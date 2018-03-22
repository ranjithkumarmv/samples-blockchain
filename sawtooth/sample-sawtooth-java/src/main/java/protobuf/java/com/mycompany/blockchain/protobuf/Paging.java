// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StateData.proto

package protobuf.java.com.mycompany.blockchain.protobuf;

/**
 * Protobuf type {@code Paging}
 */
public  final class Paging extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Paging)
    PagingOrBuilder {
  // Use Paging.newBuilder() to construct.
  private Paging(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Paging() {
    limit_ = "";
    start_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Paging(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            limit_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            start_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protobuf.java.com.mycompany.blockchain.protobuf.StateDataOuterClass.internal_static_Paging_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protobuf.java.com.mycompany.blockchain.protobuf.StateDataOuterClass.internal_static_Paging_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protobuf.java.com.mycompany.blockchain.protobuf.Paging.class, protobuf.java.com.mycompany.blockchain.protobuf.Paging.Builder.class);
  }

  public static final int LIMIT_FIELD_NUMBER = 1;
  private volatile java.lang.Object limit_;
  /**
   * <code>string limit = 1;</code>
   */
  public java.lang.String getLimit() {
    java.lang.Object ref = limit_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      limit_ = s;
      return s;
    }
  }
  /**
   * <code>string limit = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLimitBytes() {
    java.lang.Object ref = limit_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      limit_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int START_FIELD_NUMBER = 2;
  private volatile java.lang.Object start_;
  /**
   * <code>string start = 2;</code>
   */
  public java.lang.String getStart() {
    java.lang.Object ref = start_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      start_ = s;
      return s;
    }
  }
  /**
   * <code>string start = 2;</code>
   */
  public com.google.protobuf.ByteString
      getStartBytes() {
    java.lang.Object ref = start_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      start_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getLimitBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, limit_);
    }
    if (!getStartBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, start_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLimitBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, limit_);
    }
    if (!getStartBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, start_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof protobuf.java.com.mycompany.blockchain.protobuf.Paging)) {
      return super.equals(obj);
    }
    protobuf.java.com.mycompany.blockchain.protobuf.Paging other = (protobuf.java.com.mycompany.blockchain.protobuf.Paging) obj;

    boolean result = true;
    result = result && getLimit()
        .equals(other.getLimit());
    result = result && getStart()
        .equals(other.getStart());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getLimit().hashCode();
    hash = (37 * hash) + START_FIELD_NUMBER;
    hash = (53 * hash) + getStart().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protobuf.java.com.mycompany.blockchain.protobuf.Paging parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protobuf.java.com.mycompany.blockchain.protobuf.Paging parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protobuf.java.com.mycompany.blockchain.protobuf.Paging parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protobuf.java.com.mycompany.blockchain.protobuf.Paging parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protobuf.java.com.mycompany.blockchain.protobuf.Paging parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protobuf.java.com.mycompany.blockchain.protobuf.Paging parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protobuf.java.com.mycompany.blockchain.protobuf.Paging parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protobuf.java.com.mycompany.blockchain.protobuf.Paging parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protobuf.java.com.mycompany.blockchain.protobuf.Paging parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protobuf.java.com.mycompany.blockchain.protobuf.Paging parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(protobuf.java.com.mycompany.blockchain.protobuf.Paging prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Paging}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Paging)
      protobuf.java.com.mycompany.blockchain.protobuf.PagingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf.java.com.mycompany.blockchain.protobuf.StateDataOuterClass.internal_static_Paging_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf.java.com.mycompany.blockchain.protobuf.StateDataOuterClass.internal_static_Paging_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protobuf.java.com.mycompany.blockchain.protobuf.Paging.class, protobuf.java.com.mycompany.blockchain.protobuf.Paging.Builder.class);
    }

    // Construct using protobuf.java.com.mycompany.blockchain.protobuf.Paging.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      limit_ = "";

      start_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protobuf.java.com.mycompany.blockchain.protobuf.StateDataOuterClass.internal_static_Paging_descriptor;
    }

    public protobuf.java.com.mycompany.blockchain.protobuf.Paging getDefaultInstanceForType() {
      return protobuf.java.com.mycompany.blockchain.protobuf.Paging.getDefaultInstance();
    }

    public protobuf.java.com.mycompany.blockchain.protobuf.Paging build() {
      protobuf.java.com.mycompany.blockchain.protobuf.Paging result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protobuf.java.com.mycompany.blockchain.protobuf.Paging buildPartial() {
      protobuf.java.com.mycompany.blockchain.protobuf.Paging result = new protobuf.java.com.mycompany.blockchain.protobuf.Paging(this);
      result.limit_ = limit_;
      result.start_ = start_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof protobuf.java.com.mycompany.blockchain.protobuf.Paging) {
        return mergeFrom((protobuf.java.com.mycompany.blockchain.protobuf.Paging)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protobuf.java.com.mycompany.blockchain.protobuf.Paging other) {
      if (other == protobuf.java.com.mycompany.blockchain.protobuf.Paging.getDefaultInstance()) return this;
      if (!other.getLimit().isEmpty()) {
        limit_ = other.limit_;
        onChanged();
      }
      if (!other.getStart().isEmpty()) {
        start_ = other.start_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      protobuf.java.com.mycompany.blockchain.protobuf.Paging parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protobuf.java.com.mycompany.blockchain.protobuf.Paging) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object limit_ = "";
    /**
     * <code>string limit = 1;</code>
     */
    public java.lang.String getLimit() {
      java.lang.Object ref = limit_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        limit_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string limit = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLimitBytes() {
      java.lang.Object ref = limit_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        limit_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string limit = 1;</code>
     */
    public Builder setLimit(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      limit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string limit = 1;</code>
     */
    public Builder clearLimit() {
      
      limit_ = getDefaultInstance().getLimit();
      onChanged();
      return this;
    }
    /**
     * <code>string limit = 1;</code>
     */
    public Builder setLimitBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      limit_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object start_ = "";
    /**
     * <code>string start = 2;</code>
     */
    public java.lang.String getStart() {
      java.lang.Object ref = start_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        start_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string start = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStartBytes() {
      java.lang.Object ref = start_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        start_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string start = 2;</code>
     */
    public Builder setStart(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      start_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string start = 2;</code>
     */
    public Builder clearStart() {
      
      start_ = getDefaultInstance().getStart();
      onChanged();
      return this;
    }
    /**
     * <code>string start = 2;</code>
     */
    public Builder setStartBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      start_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Paging)
  }

  // @@protoc_insertion_point(class_scope:Paging)
  private static final protobuf.java.com.mycompany.blockchain.protobuf.Paging DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protobuf.java.com.mycompany.blockchain.protobuf.Paging();
  }

  public static protobuf.java.com.mycompany.blockchain.protobuf.Paging getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Paging>
      PARSER = new com.google.protobuf.AbstractParser<Paging>() {
    public Paging parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Paging(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Paging> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Paging> getParserForType() {
    return PARSER;
  }

  public protobuf.java.com.mycompany.blockchain.protobuf.Paging getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
