// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StateData.proto

package protobuf.java.com.mycompany.blockchain.protobuf;

public final class StateDataOuterClass {
  private StateDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StateData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StateData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Paging_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Paging_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017StateData.proto\"U\n\tStateData\022\023\n\004data\030\001" +
      " \003(\0132\005.Data\022\014\n\004head\030\002 \001(\t\022\014\n\004link\030\003 \001(\t\022" +
      "\027\n\006paging\030\004 \001(\0132\007.Paging\"%\n\004Data\022\017\n\007addr" +
      "ess\030\001 \001(\t\022\014\n\004data\030\002 \001(\t\"&\n\006Paging\022\r\n\005lim" +
      "it\030\001 \001(\t\022\r\n\005start\030\002 \001(\tB3\n/protobuf.java" +
      ".com.mycompany.blockchain.protobufP\001b\006pr" +
      "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_StateData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StateData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StateData_descriptor,
        new java.lang.String[] { "Data", "Head", "Link", "Paging", });
    internal_static_Data_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Data_descriptor,
        new java.lang.String[] { "Address", "Data", });
    internal_static_Paging_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Paging_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Paging_descriptor,
        new java.lang.String[] { "Limit", "Start", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}