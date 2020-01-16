// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/WalletService.proto

package com.grpc.server.wallet;

/**
 * Protobuf type {@code com.grpc.server.wallet.TransactionResponse}
 */
public  final class TransactionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.grpc.server.wallet.TransactionResponse)
    TransactionResponseOrBuilder {
  // Use TransactionResponse.newBuilder() to construct.
  private TransactionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransactionResponse() {
    userFrom_ = "";
    passwordFrom_ = "";
    userTo_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TransactionResponse(
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

            userFrom_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            passwordFrom_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            userTo_ = s;
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
    return com.grpc.server.wallet.WalletSevice.internal_static_com_grpc_server_wallet_TransactionResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.server.wallet.WalletSevice.internal_static_com_grpc_server_wallet_TransactionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.server.wallet.TransactionResponse.class, com.grpc.server.wallet.TransactionResponse.Builder.class);
  }

  public static final int USERFROM_FIELD_NUMBER = 1;
  private volatile java.lang.Object userFrom_;
  /**
   * <code>optional string userFrom = 1;</code>
   */
  public java.lang.String getUserFrom() {
    java.lang.Object ref = userFrom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userFrom_ = s;
      return s;
    }
  }
  /**
   * <code>optional string userFrom = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserFromBytes() {
    java.lang.Object ref = userFrom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userFrom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PASSWORDFROM_FIELD_NUMBER = 2;
  private volatile java.lang.Object passwordFrom_;
  /**
   * <code>optional string passwordFrom = 2;</code>
   */
  public java.lang.String getPasswordFrom() {
    java.lang.Object ref = passwordFrom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      passwordFrom_ = s;
      return s;
    }
  }
  /**
   * <code>optional string passwordFrom = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPasswordFromBytes() {
    java.lang.Object ref = passwordFrom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      passwordFrom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERTO_FIELD_NUMBER = 3;
  private volatile java.lang.Object userTo_;
  /**
   * <code>optional string userTo = 3;</code>
   */
  public java.lang.String getUserTo() {
    java.lang.Object ref = userTo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userTo_ = s;
      return s;
    }
  }
  /**
   * <code>optional string userTo = 3;</code>
   */
  public com.google.protobuf.ByteString
      getUserToBytes() {
    java.lang.Object ref = userTo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userTo_ = b;
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
    if (!getUserFromBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userFrom_);
    }
    if (!getPasswordFromBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, passwordFrom_);
    }
    if (!getUserToBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userTo_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserFromBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userFrom_);
    }
    if (!getPasswordFromBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, passwordFrom_);
    }
    if (!getUserToBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userTo_);
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
    if (!(obj instanceof com.grpc.server.wallet.TransactionResponse)) {
      return super.equals(obj);
    }
    com.grpc.server.wallet.TransactionResponse other = (com.grpc.server.wallet.TransactionResponse) obj;

    boolean result = true;
    result = result && getUserFrom()
        .equals(other.getUserFrom());
    result = result && getPasswordFrom()
        .equals(other.getPasswordFrom());
    result = result && getUserTo()
        .equals(other.getUserTo());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + USERFROM_FIELD_NUMBER;
    hash = (53 * hash) + getUserFrom().hashCode();
    hash = (37 * hash) + PASSWORDFROM_FIELD_NUMBER;
    hash = (53 * hash) + getPasswordFrom().hashCode();
    hash = (37 * hash) + USERTO_FIELD_NUMBER;
    hash = (53 * hash) + getUserTo().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.server.wallet.TransactionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.server.wallet.TransactionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.server.wallet.TransactionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.server.wallet.TransactionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.server.wallet.TransactionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.server.wallet.TransactionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.server.wallet.TransactionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.server.wallet.TransactionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.server.wallet.TransactionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.server.wallet.TransactionResponse parseFrom(
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
  public static Builder newBuilder(com.grpc.server.wallet.TransactionResponse prototype) {
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
   * Protobuf type {@code com.grpc.server.wallet.TransactionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.grpc.server.wallet.TransactionResponse)
      com.grpc.server.wallet.TransactionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.server.wallet.WalletSevice.internal_static_com_grpc_server_wallet_TransactionResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.server.wallet.WalletSevice.internal_static_com_grpc_server_wallet_TransactionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.server.wallet.TransactionResponse.class, com.grpc.server.wallet.TransactionResponse.Builder.class);
    }

    // Construct using com.grpc.server.wallet.TransactionResponse.newBuilder()
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
      userFrom_ = "";

      passwordFrom_ = "";

      userTo_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.server.wallet.WalletSevice.internal_static_com_grpc_server_wallet_TransactionResponse_descriptor;
    }

    public com.grpc.server.wallet.TransactionResponse getDefaultInstanceForType() {
      return com.grpc.server.wallet.TransactionResponse.getDefaultInstance();
    }

    public com.grpc.server.wallet.TransactionResponse build() {
      com.grpc.server.wallet.TransactionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.grpc.server.wallet.TransactionResponse buildPartial() {
      com.grpc.server.wallet.TransactionResponse result = new com.grpc.server.wallet.TransactionResponse(this);
      result.userFrom_ = userFrom_;
      result.passwordFrom_ = passwordFrom_;
      result.userTo_ = userTo_;
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
      if (other instanceof com.grpc.server.wallet.TransactionResponse) {
        return mergeFrom((com.grpc.server.wallet.TransactionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.server.wallet.TransactionResponse other) {
      if (other == com.grpc.server.wallet.TransactionResponse.getDefaultInstance()) return this;
      if (!other.getUserFrom().isEmpty()) {
        userFrom_ = other.userFrom_;
        onChanged();
      }
      if (!other.getPasswordFrom().isEmpty()) {
        passwordFrom_ = other.passwordFrom_;
        onChanged();
      }
      if (!other.getUserTo().isEmpty()) {
        userTo_ = other.userTo_;
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
      com.grpc.server.wallet.TransactionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.server.wallet.TransactionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userFrom_ = "";
    /**
     * <code>optional string userFrom = 1;</code>
     */
    public java.lang.String getUserFrom() {
      java.lang.Object ref = userFrom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userFrom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string userFrom = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserFromBytes() {
      java.lang.Object ref = userFrom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userFrom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string userFrom = 1;</code>
     */
    public Builder setUserFrom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userFrom_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string userFrom = 1;</code>
     */
    public Builder clearUserFrom() {
      
      userFrom_ = getDefaultInstance().getUserFrom();
      onChanged();
      return this;
    }
    /**
     * <code>optional string userFrom = 1;</code>
     */
    public Builder setUserFromBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userFrom_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object passwordFrom_ = "";
    /**
     * <code>optional string passwordFrom = 2;</code>
     */
    public java.lang.String getPasswordFrom() {
      java.lang.Object ref = passwordFrom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        passwordFrom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string passwordFrom = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPasswordFromBytes() {
      java.lang.Object ref = passwordFrom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        passwordFrom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string passwordFrom = 2;</code>
     */
    public Builder setPasswordFrom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      passwordFrom_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string passwordFrom = 2;</code>
     */
    public Builder clearPasswordFrom() {
      
      passwordFrom_ = getDefaultInstance().getPasswordFrom();
      onChanged();
      return this;
    }
    /**
     * <code>optional string passwordFrom = 2;</code>
     */
    public Builder setPasswordFromBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      passwordFrom_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userTo_ = "";
    /**
     * <code>optional string userTo = 3;</code>
     */
    public java.lang.String getUserTo() {
      java.lang.Object ref = userTo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userTo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string userTo = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUserToBytes() {
      java.lang.Object ref = userTo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userTo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string userTo = 3;</code>
     */
    public Builder setUserTo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userTo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string userTo = 3;</code>
     */
    public Builder clearUserTo() {
      
      userTo_ = getDefaultInstance().getUserTo();
      onChanged();
      return this;
    }
    /**
     * <code>optional string userTo = 3;</code>
     */
    public Builder setUserToBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userTo_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.grpc.server.wallet.TransactionResponse)
  }

  // @@protoc_insertion_point(class_scope:com.grpc.server.wallet.TransactionResponse)
  private static final com.grpc.server.wallet.TransactionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.server.wallet.TransactionResponse();
  }

  public static com.grpc.server.wallet.TransactionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransactionResponse>
      PARSER = new com.google.protobuf.AbstractParser<TransactionResponse>() {
    public TransactionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TransactionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TransactionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransactionResponse> getParserForType() {
    return PARSER;
  }

  public com.grpc.server.wallet.TransactionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

