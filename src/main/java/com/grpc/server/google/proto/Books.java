// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressbook.proto

package com.grpc.server.google.proto;

/**
 * Protobuf type {@code Books}
 */
public  final class Books extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Books)
    BooksOrBuilder {
  // Use Books.newBuilder() to construct.
  private Books(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Books() {
    arrayBooks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Books(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              arrayBooks_ = new java.util.ArrayList<com.grpc.server.google.proto.Book>();
              mutable_bitField0_ |= 0x00000001;
            }
            arrayBooks_.add(
                input.readMessage(com.grpc.server.google.proto.Book.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        arrayBooks_ = java.util.Collections.unmodifiableList(arrayBooks_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.server.google.proto.AddressBookClass.internal_static_Books_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.server.google.proto.AddressBookClass.internal_static_Books_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.server.google.proto.Books.class, com.grpc.server.google.proto.Books.Builder.class);
  }

  public static final int ARRAYBOOKS_FIELD_NUMBER = 1;
  private java.util.List<com.grpc.server.google.proto.Book> arrayBooks_;
  /**
   * <code>repeated .Book arrayBooks = 1;</code>
   */
  public java.util.List<com.grpc.server.google.proto.Book> getArrayBooksList() {
    return arrayBooks_;
  }
  /**
   * <code>repeated .Book arrayBooks = 1;</code>
   */
  public java.util.List<? extends com.grpc.server.google.proto.BookOrBuilder> 
      getArrayBooksOrBuilderList() {
    return arrayBooks_;
  }
  /**
   * <code>repeated .Book arrayBooks = 1;</code>
   */
  public int getArrayBooksCount() {
    return arrayBooks_.size();
  }
  /**
   * <code>repeated .Book arrayBooks = 1;</code>
   */
  public com.grpc.server.google.proto.Book getArrayBooks(int index) {
    return arrayBooks_.get(index);
  }
  /**
   * <code>repeated .Book arrayBooks = 1;</code>
   */
  public com.grpc.server.google.proto.BookOrBuilder getArrayBooksOrBuilder(
      int index) {
    return arrayBooks_.get(index);
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
    for (int i = 0; i < arrayBooks_.size(); i++) {
      output.writeMessage(1, arrayBooks_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < arrayBooks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, arrayBooks_.get(i));
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
    if (!(obj instanceof com.grpc.server.google.proto.Books)) {
      return super.equals(obj);
    }
    com.grpc.server.google.proto.Books other = (com.grpc.server.google.proto.Books) obj;

    boolean result = true;
    result = result && getArrayBooksList()
        .equals(other.getArrayBooksList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getArrayBooksCount() > 0) {
      hash = (37 * hash) + ARRAYBOOKS_FIELD_NUMBER;
      hash = (53 * hash) + getArrayBooksList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.server.google.proto.Books parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.server.google.proto.Books parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.server.google.proto.Books parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.server.google.proto.Books parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.server.google.proto.Books parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.server.google.proto.Books parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.server.google.proto.Books parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.server.google.proto.Books parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.server.google.proto.Books parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.server.google.proto.Books parseFrom(
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
  public static Builder newBuilder(com.grpc.server.google.proto.Books prototype) {
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
   * Protobuf type {@code Books}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Books)
      com.grpc.server.google.proto.BooksOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.server.google.proto.AddressBookClass.internal_static_Books_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.server.google.proto.AddressBookClass.internal_static_Books_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.server.google.proto.Books.class, com.grpc.server.google.proto.Books.Builder.class);
    }

    // Construct using com.grpc.server.google.proto.Books.newBuilder()
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
        getArrayBooksFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (arrayBooksBuilder_ == null) {
        arrayBooks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        arrayBooksBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.server.google.proto.AddressBookClass.internal_static_Books_descriptor;
    }

    public com.grpc.server.google.proto.Books getDefaultInstanceForType() {
      return com.grpc.server.google.proto.Books.getDefaultInstance();
    }

    public com.grpc.server.google.proto.Books build() {
      com.grpc.server.google.proto.Books result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.grpc.server.google.proto.Books buildPartial() {
      com.grpc.server.google.proto.Books result = new com.grpc.server.google.proto.Books(this);
      int from_bitField0_ = bitField0_;
      if (arrayBooksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          arrayBooks_ = java.util.Collections.unmodifiableList(arrayBooks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.arrayBooks_ = arrayBooks_;
      } else {
        result.arrayBooks_ = arrayBooksBuilder_.build();
      }
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
      if (other instanceof com.grpc.server.google.proto.Books) {
        return mergeFrom((com.grpc.server.google.proto.Books)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.server.google.proto.Books other) {
      if (other == com.grpc.server.google.proto.Books.getDefaultInstance()) return this;
      if (arrayBooksBuilder_ == null) {
        if (!other.arrayBooks_.isEmpty()) {
          if (arrayBooks_.isEmpty()) {
            arrayBooks_ = other.arrayBooks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureArrayBooksIsMutable();
            arrayBooks_.addAll(other.arrayBooks_);
          }
          onChanged();
        }
      } else {
        if (!other.arrayBooks_.isEmpty()) {
          if (arrayBooksBuilder_.isEmpty()) {
            arrayBooksBuilder_.dispose();
            arrayBooksBuilder_ = null;
            arrayBooks_ = other.arrayBooks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            arrayBooksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getArrayBooksFieldBuilder() : null;
          } else {
            arrayBooksBuilder_.addAllMessages(other.arrayBooks_);
          }
        }
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
      com.grpc.server.google.proto.Books parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.server.google.proto.Books) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.grpc.server.google.proto.Book> arrayBooks_ =
      java.util.Collections.emptyList();
    private void ensureArrayBooksIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        arrayBooks_ = new java.util.ArrayList<com.grpc.server.google.proto.Book>(arrayBooks_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.server.google.proto.Book, com.grpc.server.google.proto.Book.Builder, com.grpc.server.google.proto.BookOrBuilder> arrayBooksBuilder_;

    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public java.util.List<com.grpc.server.google.proto.Book> getArrayBooksList() {
      if (arrayBooksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(arrayBooks_);
      } else {
        return arrayBooksBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public int getArrayBooksCount() {
      if (arrayBooksBuilder_ == null) {
        return arrayBooks_.size();
      } else {
        return arrayBooksBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public com.grpc.server.google.proto.Book getArrayBooks(int index) {
      if (arrayBooksBuilder_ == null) {
        return arrayBooks_.get(index);
      } else {
        return arrayBooksBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public Builder setArrayBooks(
        int index, com.grpc.server.google.proto.Book value) {
      if (arrayBooksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArrayBooksIsMutable();
        arrayBooks_.set(index, value);
        onChanged();
      } else {
        arrayBooksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public Builder setArrayBooks(
        int index, com.grpc.server.google.proto.Book.Builder builderForValue) {
      if (arrayBooksBuilder_ == null) {
        ensureArrayBooksIsMutable();
        arrayBooks_.set(index, builderForValue.build());
        onChanged();
      } else {
        arrayBooksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public Builder addArrayBooks(com.grpc.server.google.proto.Book value) {
      if (arrayBooksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArrayBooksIsMutable();
        arrayBooks_.add(value);
        onChanged();
      } else {
        arrayBooksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public Builder addArrayBooks(
        int index, com.grpc.server.google.proto.Book value) {
      if (arrayBooksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArrayBooksIsMutable();
        arrayBooks_.add(index, value);
        onChanged();
      } else {
        arrayBooksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public Builder addArrayBooks(
        com.grpc.server.google.proto.Book.Builder builderForValue) {
      if (arrayBooksBuilder_ == null) {
        ensureArrayBooksIsMutable();
        arrayBooks_.add(builderForValue.build());
        onChanged();
      } else {
        arrayBooksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public Builder addArrayBooks(
        int index, com.grpc.server.google.proto.Book.Builder builderForValue) {
      if (arrayBooksBuilder_ == null) {
        ensureArrayBooksIsMutable();
        arrayBooks_.add(index, builderForValue.build());
        onChanged();
      } else {
        arrayBooksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public Builder addAllArrayBooks(
        java.lang.Iterable<? extends com.grpc.server.google.proto.Book> values) {
      if (arrayBooksBuilder_ == null) {
        ensureArrayBooksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, arrayBooks_);
        onChanged();
      } else {
        arrayBooksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public Builder clearArrayBooks() {
      if (arrayBooksBuilder_ == null) {
        arrayBooks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        arrayBooksBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public Builder removeArrayBooks(int index) {
      if (arrayBooksBuilder_ == null) {
        ensureArrayBooksIsMutable();
        arrayBooks_.remove(index);
        onChanged();
      } else {
        arrayBooksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public com.grpc.server.google.proto.Book.Builder getArrayBooksBuilder(
        int index) {
      return getArrayBooksFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public com.grpc.server.google.proto.BookOrBuilder getArrayBooksOrBuilder(
        int index) {
      if (arrayBooksBuilder_ == null) {
        return arrayBooks_.get(index);  } else {
        return arrayBooksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public java.util.List<? extends com.grpc.server.google.proto.BookOrBuilder> 
         getArrayBooksOrBuilderList() {
      if (arrayBooksBuilder_ != null) {
        return arrayBooksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(arrayBooks_);
      }
    }
    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public com.grpc.server.google.proto.Book.Builder addArrayBooksBuilder() {
      return getArrayBooksFieldBuilder().addBuilder(
          com.grpc.server.google.proto.Book.getDefaultInstance());
    }
    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public com.grpc.server.google.proto.Book.Builder addArrayBooksBuilder(
        int index) {
      return getArrayBooksFieldBuilder().addBuilder(
          index, com.grpc.server.google.proto.Book.getDefaultInstance());
    }
    /**
     * <code>repeated .Book arrayBooks = 1;</code>
     */
    public java.util.List<com.grpc.server.google.proto.Book.Builder> 
         getArrayBooksBuilderList() {
      return getArrayBooksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.server.google.proto.Book, com.grpc.server.google.proto.Book.Builder, com.grpc.server.google.proto.BookOrBuilder> 
        getArrayBooksFieldBuilder() {
      if (arrayBooksBuilder_ == null) {
        arrayBooksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.grpc.server.google.proto.Book, com.grpc.server.google.proto.Book.Builder, com.grpc.server.google.proto.BookOrBuilder>(
                arrayBooks_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        arrayBooks_ = null;
      }
      return arrayBooksBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Books)
  }

  // @@protoc_insertion_point(class_scope:Books)
  private static final com.grpc.server.google.proto.Books DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.server.google.proto.Books();
  }

  public static com.grpc.server.google.proto.Books getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Books>
      PARSER = new com.google.protobuf.AbstractParser<Books>() {
    public Books parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Books(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Books> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Books> getParserForType() {
    return PARSER;
  }

  public com.grpc.server.google.proto.Books getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

