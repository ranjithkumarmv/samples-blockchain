import java.io.UnsupportedEncodingException;
import java.time.Instant;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.logging.Logger;

import org.bitcoinj.core.ECKey;

import com.google.protobuf.ByteString;
import com.googlecode.protobuf.format.JsonFormat;
import com.googlecode.protobuf.format.JsonFormat.ParseException;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import protobuf.java.com.mycompany.blockchain.protobuf.Data;
import protobuf.java.com.mycompany.blockchain.protobuf.StateData;
import sawtooth.sdk.client.Signing;
import sawtooth.sdk.processor.TransactionHandler;
import sawtooth.sdk.processor.Utils;
import sawtooth.sdk.processor.exceptions.InternalError;
import sawtooth.sdk.protobuf.Batch;
import sawtooth.sdk.protobuf.BatchHeader;
import sawtooth.sdk.protobuf.BatchList;
import sawtooth.sdk.protobuf.Transaction;
import sawtooth.sdk.protobuf.TransactionHeader;

/**
 * 
 */

/**
 * @author dev
 *
 */
public class InventoryClientSender {
	private static final Logger logger = Logger.getLogger(InventoryClientSender.class.getName());
	private static final String IDEM = "invent";
	private static final String VER = "1.0";
	private static final String ITEM_ID = "00006";
	public static void main(String[] args) throws UnirestException, UnsupportedEncodingException, InternalError, ParseException {
		//putDataToBLockchain();
		getDataFromBlockchain();		
	}
	
	public static void getDataFromBlockchain() throws UnirestException, UnsupportedEncodingException, InternalError, ParseException {

		String address = getAddress(IDEM, ITEM_ID); // get unique address for input and output
		
		String serverResponse = Unirest.get("http://localhost:8008/state")
				.queryString("address",address)
				.asString()
				.getBody();
		
		System.out.println(serverResponse);
		
		StateData.Builder stateBuilder = StateData.newBuilder();
		JsonFormat.merge(serverResponse, stateBuilder);
		StateData stateData = stateBuilder.build();
		Decoder decoder = Base64.getDecoder();
		for(Data data : stateData.getDataList()) {
			byte[] valueDecoded = decoder.decode(data.getData());
			System.out.println("Decoded value is " + new String(valueDecoded));
		}
	}
	
	public static void putDataToBLockchain() throws UnirestException, UnsupportedEncodingException, InternalError, ParseException {
		ECKey privateKey = Signing.generatePrivateKey(null); // new random privatekey

		String publicKeyHex = privateKey.getPublicKeyAsHex();

		ByteString publicKeyByteString = ByteString.copyFrom(new String(publicKeyHex), "UTF-8");

		//Paramters in sequence : id,itemName,color,price
		String payload = "create," + ITEM_ID + ",Hyperledger-Sawtooth-6,OrangeBlue,7000";
		//String payload = "list," + ITEM_ID;
		logger.info("Sending payload as - "+  payload);
		String payloadBytes = Utils.hash512(payload.getBytes()); // --fix for invaluid payload seriqalization

		ByteString payloadByteString = ByteString.copyFrom(payload.getBytes());

		String address = getAddress(IDEM, ITEM_ID); // get unique address for input and output
		logger.info("Sending address as - "+  address);
		TransactionHeader txnHeader = TransactionHeader.newBuilder().clearBatcherPublicKey()
				.setBatcherPublicKey(publicKeyHex)
				.setFamilyName(IDEM)  // Idem Family
				.setFamilyVersion(VER)
				.addInputs(address)
				.setNonce("1")
				.addOutputs(address)
				.setPayloadSha512(payloadBytes)
				.setSignerPublicKey(publicKeyHex)
				.build();

		ByteString txnHeaderBytes = txnHeader.toByteString();

		byte[] txnHeaderSignature = privateKey.signMessage(txnHeaderBytes.toString()).getBytes();

		String value = Signing.sign(privateKey, txnHeader.toByteArray());
		Transaction txn = Transaction.newBuilder().setHeader(txnHeaderBytes).setPayload(payloadByteString)
				.setHeaderSignature(value).build();

		BatchHeader batchHeader = BatchHeader.newBuilder().clearSignerPublicKey().setSignerPublicKey(publicKeyHex)
				.addTransactionIds(txn.getHeaderSignature()).build();

		ByteString batchHeaderBytes = batchHeader.toByteString();

		byte[] batchHeaderSignature = privateKey.signMessage(batchHeaderBytes.toString()).getBytes();
		String value_batch = Signing.sign(privateKey, batchHeader.toByteArray());
		Batch batch = Batch.newBuilder()
				.setHeader(batchHeaderBytes)
				.setHeaderSignature(value_batch)
				.setTrace(true)
				.addTransactions(txn)
				.build();

		BatchList batchList = BatchList.newBuilder()
				.addBatches(batch)
				.build();

		ByteString batchBytes = batchList.toByteString();

		String serverResponse = Unirest.post("http://localhost:8008/batches")
				.header("Content-Type", "application/octet-stream")
				.body(batchBytes.toByteArray())
				.asString()
				.getBody();

		System.out.println(serverResponse);
	}

	/**
	 * Create a unique payload with prefix and elapsed nano seconds EPOCH
	 * @param prefix
	 * @return
	 */
	private static String getIncrementalPayload(String prefix) {
		return prefix + Instant.now().getEpochSecond();
	}

	/**
	 * Calculates and encoded value for Prefxing address
	 * @param prefix
	 * @throws UnsupportedEncodingException 
	 */
	public  static  String prefixAddress(String prefix) throws UnsupportedEncodingException {
		return Utils.hash512(prefix.getBytes("UTF-8")).substring(0, 6);
	}
	
	/**
	 * Calculates an encoded value for a unique key address
	 * @param uniqueKey
	 * @throws InternalError 
	 */
	public static  String keyAddress(String key) throws InternalError {
		String address = null;
		try {
			String hashedName = Utils.hash512(key.getBytes("UTF-8"));
			address =  hashedName.substring(hashedName.length() - 64);
		} catch (UnsupportedEncodingException usee) {
			usee.printStackTrace();
			throw new InternalError("Internal Error, " + usee.toString());
		}
		return address;
	}
	
	/**
	 * builds an address for input and output
	 * @param prefix
	 * @param key
	 * @throws InternalError 
	 * @throws UnsupportedEncodingException 
	 */
	public static String getAddress(String prefix,String key) throws UnsupportedEncodingException, InternalError {
		return prefixAddress(prefix).concat(keyAddress(key));
		
	}
	
}
