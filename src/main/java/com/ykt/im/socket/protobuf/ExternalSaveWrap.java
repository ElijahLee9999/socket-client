// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExternalSave.proto

package com.ykt.im.socket.protobuf;

public final class ExternalSaveWrap {
  private ExternalSaveWrap() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExternalSaveOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.ExternalSave)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *客户userid
     * </pre>
     *
     * <code>string external_userid = 1;</code>
     */
    java.lang.String getExternalUserid();
    /**
     * <pre>
     *客户userid
     * </pre>
     *
     * <code>string external_userid = 1;</code>
     */
    com.google.protobuf.ByteString
        getExternalUseridBytes();

    /**
     * <pre>
     *入库结果
     * </pre>
     *
     * <code>bool saved = 2;</code>
     */
    boolean getSaved();

    /**
     * <pre>
     *入库失败的错误信息
     * </pre>
     *
     * <code>string error_msg = 3;</code>
     */
    java.lang.String getErrorMsg();
    /**
     * <pre>
     *入库失败的错误信息
     * </pre>
     *
     * <code>string error_msg = 3;</code>
     */
    com.google.protobuf.ByteString
        getErrorMsgBytes();
  }
  /**
   * Protobuf type {@code protocol.ExternalSave}
   */
  public  static final class ExternalSave extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocol.ExternalSave)
      ExternalSaveOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExternalSave.newBuilder() to construct.
    private ExternalSave(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExternalSave() {
      externalUserid_ = "";
      errorMsg_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ExternalSave(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              externalUserid_ = s;
              break;
            }
            case 16: {

              saved_ = input.readBool();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              errorMsg_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ykt.im.socket.protobuf.ExternalSaveWrap.internal_static_protocol_ExternalSave_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ykt.im.socket.protobuf.ExternalSaveWrap.internal_static_protocol_ExternalSave_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave.class, com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave.Builder.class);
    }

    public static final int EXTERNAL_USERID_FIELD_NUMBER = 1;
    private volatile java.lang.Object externalUserid_;
    /**
     * <pre>
     *客户userid
     * </pre>
     *
     * <code>string external_userid = 1;</code>
     */
    public java.lang.String getExternalUserid() {
      java.lang.Object ref = externalUserid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        externalUserid_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *客户userid
     * </pre>
     *
     * <code>string external_userid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getExternalUseridBytes() {
      java.lang.Object ref = externalUserid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        externalUserid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SAVED_FIELD_NUMBER = 2;
    private boolean saved_;
    /**
     * <pre>
     *入库结果
     * </pre>
     *
     * <code>bool saved = 2;</code>
     */
    public boolean getSaved() {
      return saved_;
    }

    public static final int ERROR_MSG_FIELD_NUMBER = 3;
    private volatile java.lang.Object errorMsg_;
    /**
     * <pre>
     *入库失败的错误信息
     * </pre>
     *
     * <code>string error_msg = 3;</code>
     */
    public java.lang.String getErrorMsg() {
      java.lang.Object ref = errorMsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorMsg_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *入库失败的错误信息
     * </pre>
     *
     * <code>string error_msg = 3;</code>
     */
    public com.google.protobuf.ByteString
        getErrorMsgBytes() {
      java.lang.Object ref = errorMsg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getExternalUseridBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, externalUserid_);
      }
      if (saved_ != false) {
        output.writeBool(2, saved_);
      }
      if (!getErrorMsgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, errorMsg_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getExternalUseridBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, externalUserid_);
      }
      if (saved_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, saved_);
      }
      if (!getErrorMsgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, errorMsg_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave)) {
        return super.equals(obj);
      }
      com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave other = (com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave) obj;

      if (!getExternalUserid()
          .equals(other.getExternalUserid())) return false;
      if (getSaved()
          != other.getSaved()) return false;
      if (!getErrorMsg()
          .equals(other.getErrorMsg())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + EXTERNAL_USERID_FIELD_NUMBER;
      hash = (53 * hash) + getExternalUserid().hashCode();
      hash = (37 * hash) + SAVED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSaved());
      hash = (37 * hash) + ERROR_MSG_FIELD_NUMBER;
      hash = (53 * hash) + getErrorMsg().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code protocol.ExternalSave}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.ExternalSave)
        com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSaveOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.ykt.im.socket.protobuf.ExternalSaveWrap.internal_static_protocol_ExternalSave_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.ykt.im.socket.protobuf.ExternalSaveWrap.internal_static_protocol_ExternalSave_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave.class, com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave.Builder.class);
      }

      // Construct using com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        externalUserid_ = "";

        saved_ = false;

        errorMsg_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ykt.im.socket.protobuf.ExternalSaveWrap.internal_static_protocol_ExternalSave_descriptor;
      }

      @java.lang.Override
      public com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave getDefaultInstanceForType() {
        return com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave.getDefaultInstance();
      }

      @java.lang.Override
      public com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave build() {
        com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave buildPartial() {
        com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave result = new com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave(this);
        result.externalUserid_ = externalUserid_;
        result.saved_ = saved_;
        result.errorMsg_ = errorMsg_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave) {
          return mergeFrom((com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave other) {
        if (other == com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave.getDefaultInstance()) return this;
        if (!other.getExternalUserid().isEmpty()) {
          externalUserid_ = other.externalUserid_;
          onChanged();
        }
        if (other.getSaved() != false) {
          setSaved(other.getSaved());
        }
        if (!other.getErrorMsg().isEmpty()) {
          errorMsg_ = other.errorMsg_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object externalUserid_ = "";
      /**
       * <pre>
       *客户userid
       * </pre>
       *
       * <code>string external_userid = 1;</code>
       */
      public java.lang.String getExternalUserid() {
        java.lang.Object ref = externalUserid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          externalUserid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *客户userid
       * </pre>
       *
       * <code>string external_userid = 1;</code>
       */
      public com.google.protobuf.ByteString
          getExternalUseridBytes() {
        java.lang.Object ref = externalUserid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          externalUserid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *客户userid
       * </pre>
       *
       * <code>string external_userid = 1;</code>
       */
      public Builder setExternalUserid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        externalUserid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *客户userid
       * </pre>
       *
       * <code>string external_userid = 1;</code>
       */
      public Builder clearExternalUserid() {
        
        externalUserid_ = getDefaultInstance().getExternalUserid();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *客户userid
       * </pre>
       *
       * <code>string external_userid = 1;</code>
       */
      public Builder setExternalUseridBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        externalUserid_ = value;
        onChanged();
        return this;
      }

      private boolean saved_ ;
      /**
       * <pre>
       *入库结果
       * </pre>
       *
       * <code>bool saved = 2;</code>
       */
      public boolean getSaved() {
        return saved_;
      }
      /**
       * <pre>
       *入库结果
       * </pre>
       *
       * <code>bool saved = 2;</code>
       */
      public Builder setSaved(boolean value) {
        
        saved_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *入库结果
       * </pre>
       *
       * <code>bool saved = 2;</code>
       */
      public Builder clearSaved() {
        
        saved_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object errorMsg_ = "";
      /**
       * <pre>
       *入库失败的错误信息
       * </pre>
       *
       * <code>string error_msg = 3;</code>
       */
      public java.lang.String getErrorMsg() {
        java.lang.Object ref = errorMsg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          errorMsg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *入库失败的错误信息
       * </pre>
       *
       * <code>string error_msg = 3;</code>
       */
      public com.google.protobuf.ByteString
          getErrorMsgBytes() {
        java.lang.Object ref = errorMsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          errorMsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *入库失败的错误信息
       * </pre>
       *
       * <code>string error_msg = 3;</code>
       */
      public Builder setErrorMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        errorMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *入库失败的错误信息
       * </pre>
       *
       * <code>string error_msg = 3;</code>
       */
      public Builder clearErrorMsg() {
        
        errorMsg_ = getDefaultInstance().getErrorMsg();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *入库失败的错误信息
       * </pre>
       *
       * <code>string error_msg = 3;</code>
       */
      public Builder setErrorMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        errorMsg_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:protocol.ExternalSave)
    }

    // @@protoc_insertion_point(class_scope:protocol.ExternalSave)
    private static final com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave();
    }

    public static com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExternalSave>
        PARSER = new com.google.protobuf.AbstractParser<ExternalSave>() {
      @java.lang.Override
      public ExternalSave parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ExternalSave(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ExternalSave> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExternalSave> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.ykt.im.socket.protobuf.ExternalSaveWrap.ExternalSave getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_ExternalSave_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_ExternalSave_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022ExternalSave.proto\022\010protocol\"I\n\014Extern" +
      "alSave\022\027\n\017external_userid\030\001 \001(\t\022\r\n\005saved" +
      "\030\002 \001(\010\022\021\n\terror_msg\030\003 \001(\tB0\n\032com.ykt.im." +
      "socket.protobufB\020ExternalSaveWrapH\001b\006pro" +
      "to3"
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
    internal_static_protocol_ExternalSave_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_ExternalSave_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_ExternalSave_descriptor,
        new java.lang.String[] { "ExternalUserid", "Saved", "ErrorMsg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
