// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserMsgSyncSave.proto

package com.ykt.im.socket.protobuf;

public final class UserMsgSyncSaveWrap {
  private UserMsgSyncSaveWrap() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UserMsgSyncSaveOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.UserMsgSyncSave)
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
     *企业微信消息ID
     * </pre>
     *
     * <code>string wx_msg_id = 2;</code>
     */
    java.lang.String getWxMsgId();
    /**
     * <pre>
     *企业微信消息ID
     * </pre>
     *
     * <code>string wx_msg_id = 2;</code>
     */
    com.google.protobuf.ByteString
        getWxMsgIdBytes();

    /**
     * <pre>
     *平台消息ID，若为空则表示失败
     * </pre>
     *
     * <code>string msg_id = 3;</code>
     */
    java.lang.String getMsgId();
    /**
     * <pre>
     *平台消息ID，若为空则表示失败
     * </pre>
     *
     * <code>string msg_id = 3;</code>
     */
    com.google.protobuf.ByteString
        getMsgIdBytes();
  }
  /**
   * Protobuf type {@code protocol.UserMsgSyncSave}
   */
  public  static final class UserMsgSyncSave extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocol.UserMsgSyncSave)
      UserMsgSyncSaveOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserMsgSyncSave.newBuilder() to construct.
    private UserMsgSyncSave(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserMsgSyncSave() {
      externalUserid_ = "";
      wxMsgId_ = "";
      msgId_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserMsgSyncSave(
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
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              wxMsgId_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              msgId_ = s;
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
      return com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.internal_static_protocol_UserMsgSyncSave_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.internal_static_protocol_UserMsgSyncSave_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave.class, com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave.Builder.class);
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

    public static final int WX_MSG_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object wxMsgId_;
    /**
     * <pre>
     *企业微信消息ID
     * </pre>
     *
     * <code>string wx_msg_id = 2;</code>
     */
    public java.lang.String getWxMsgId() {
      java.lang.Object ref = wxMsgId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        wxMsgId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *企业微信消息ID
     * </pre>
     *
     * <code>string wx_msg_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getWxMsgIdBytes() {
      java.lang.Object ref = wxMsgId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        wxMsgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MSG_ID_FIELD_NUMBER = 3;
    private volatile java.lang.Object msgId_;
    /**
     * <pre>
     *平台消息ID，若为空则表示失败
     * </pre>
     *
     * <code>string msg_id = 3;</code>
     */
    public java.lang.String getMsgId() {
      java.lang.Object ref = msgId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msgId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *平台消息ID，若为空则表示失败
     * </pre>
     *
     * <code>string msg_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMsgIdBytes() {
      java.lang.Object ref = msgId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msgId_ = b;
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
      if (!getWxMsgIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, wxMsgId_);
      }
      if (!getMsgIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, msgId_);
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
      if (!getWxMsgIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, wxMsgId_);
      }
      if (!getMsgIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, msgId_);
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
      if (!(obj instanceof com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave)) {
        return super.equals(obj);
      }
      com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave other = (com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave) obj;

      if (!getExternalUserid()
          .equals(other.getExternalUserid())) return false;
      if (!getWxMsgId()
          .equals(other.getWxMsgId())) return false;
      if (!getMsgId()
          .equals(other.getMsgId())) return false;
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
      hash = (37 * hash) + WX_MSG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWxMsgId().hashCode();
      hash = (37 * hash) + MSG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMsgId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave parseFrom(
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
    public static Builder newBuilder(com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave prototype) {
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
     * Protobuf type {@code protocol.UserMsgSyncSave}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.UserMsgSyncSave)
        com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSaveOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.internal_static_protocol_UserMsgSyncSave_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.internal_static_protocol_UserMsgSyncSave_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave.class, com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave.Builder.class);
      }

      // Construct using com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave.newBuilder()
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

        wxMsgId_ = "";

        msgId_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.internal_static_protocol_UserMsgSyncSave_descriptor;
      }

      @java.lang.Override
      public com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave getDefaultInstanceForType() {
        return com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave.getDefaultInstance();
      }

      @java.lang.Override
      public com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave build() {
        com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave buildPartial() {
        com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave result = new com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave(this);
        result.externalUserid_ = externalUserid_;
        result.wxMsgId_ = wxMsgId_;
        result.msgId_ = msgId_;
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
        if (other instanceof com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave) {
          return mergeFrom((com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave other) {
        if (other == com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave.getDefaultInstance()) return this;
        if (!other.getExternalUserid().isEmpty()) {
          externalUserid_ = other.externalUserid_;
          onChanged();
        }
        if (!other.getWxMsgId().isEmpty()) {
          wxMsgId_ = other.wxMsgId_;
          onChanged();
        }
        if (!other.getMsgId().isEmpty()) {
          msgId_ = other.msgId_;
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
        com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave) e.getUnfinishedMessage();
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

      private java.lang.Object wxMsgId_ = "";
      /**
       * <pre>
       *企业微信消息ID
       * </pre>
       *
       * <code>string wx_msg_id = 2;</code>
       */
      public java.lang.String getWxMsgId() {
        java.lang.Object ref = wxMsgId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          wxMsgId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *企业微信消息ID
       * </pre>
       *
       * <code>string wx_msg_id = 2;</code>
       */
      public com.google.protobuf.ByteString
          getWxMsgIdBytes() {
        java.lang.Object ref = wxMsgId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          wxMsgId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *企业微信消息ID
       * </pre>
       *
       * <code>string wx_msg_id = 2;</code>
       */
      public Builder setWxMsgId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        wxMsgId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *企业微信消息ID
       * </pre>
       *
       * <code>string wx_msg_id = 2;</code>
       */
      public Builder clearWxMsgId() {
        
        wxMsgId_ = getDefaultInstance().getWxMsgId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *企业微信消息ID
       * </pre>
       *
       * <code>string wx_msg_id = 2;</code>
       */
      public Builder setWxMsgIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        wxMsgId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object msgId_ = "";
      /**
       * <pre>
       *平台消息ID，若为空则表示失败
       * </pre>
       *
       * <code>string msg_id = 3;</code>
       */
      public java.lang.String getMsgId() {
        java.lang.Object ref = msgId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          msgId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *平台消息ID，若为空则表示失败
       * </pre>
       *
       * <code>string msg_id = 3;</code>
       */
      public com.google.protobuf.ByteString
          getMsgIdBytes() {
        java.lang.Object ref = msgId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msgId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *平台消息ID，若为空则表示失败
       * </pre>
       *
       * <code>string msg_id = 3;</code>
       */
      public Builder setMsgId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        msgId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *平台消息ID，若为空则表示失败
       * </pre>
       *
       * <code>string msg_id = 3;</code>
       */
      public Builder clearMsgId() {
        
        msgId_ = getDefaultInstance().getMsgId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *平台消息ID，若为空则表示失败
       * </pre>
       *
       * <code>string msg_id = 3;</code>
       */
      public Builder setMsgIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        msgId_ = value;
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


      // @@protoc_insertion_point(builder_scope:protocol.UserMsgSyncSave)
    }

    // @@protoc_insertion_point(class_scope:protocol.UserMsgSyncSave)
    private static final com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave();
    }

    public static com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserMsgSyncSave>
        PARSER = new com.google.protobuf.AbstractParser<UserMsgSyncSave>() {
      @java.lang.Override
      public UserMsgSyncSave parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserMsgSyncSave(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserMsgSyncSave> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserMsgSyncSave> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap.UserMsgSyncSave getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_UserMsgSyncSave_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_UserMsgSyncSave_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025UserMsgSyncSave.proto\022\010protocol\"M\n\017Use" +
      "rMsgSyncSave\022\027\n\017external_userid\030\001 \001(\t\022\021\n" +
      "\twx_msg_id\030\002 \001(\t\022\016\n\006msg_id\030\003 \001(\tB3\n\032com." +
      "ykt.im.socket.protobufB\023UserMsgSyncSaveW" +
      "rapH\001b\006proto3"
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
    internal_static_protocol_UserMsgSyncSave_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_UserMsgSyncSave_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_UserMsgSyncSave_descriptor,
        new java.lang.String[] { "ExternalUserid", "WxMsgId", "MsgId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
