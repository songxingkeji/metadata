// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpcCommon.proto

package com.sunsheen.metadatacom.grpc.service.grpccommon;

/**
 * <pre>
 * 返回状态及返回数据
 * </pre>
 *
 * Protobuf type {@code grpccommon.ResponseData}
 */
public  final class ResponseData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpccommon.ResponseData)
    ResponseDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResponseData.newBuilder() to construct.
  private ResponseData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponseData() {
    returnCode_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResponseData(
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
          case 8: {

            returnCode_ = input.readInt32();
            break;
          }
          case 18: {
            com.sunsheen.metadatacom.grpc.service.grpccommon.DbData.Builder subBuilder = null;
            if (dbData_ != null) {
              subBuilder = dbData_.toBuilder();
            }
            dbData_ = input.readMessage(com.sunsheen.metadatacom.grpc.service.grpccommon.DbData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dbData_);
              dbData_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.sunsheen.metadatacom.grpc.service.grpccommon.GrpcCommonProto.internal_static_grpccommon_ResponseData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sunsheen.metadatacom.grpc.service.grpccommon.GrpcCommonProto.internal_static_grpccommon_ResponseData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData.class, com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData.Builder.class);
  }

  public static final int RETURNCODE_FIELD_NUMBER = 1;
  private int returnCode_;
  /**
   * <pre>
   * 返回状态
   * </pre>
   *
   * <code>int32 returnCode = 1;</code>
   */
  public int getReturnCode() {
    return returnCode_;
  }

  public static final int DBDATA_FIELD_NUMBER = 2;
  private com.sunsheen.metadatacom.grpc.service.grpccommon.DbData dbData_;
  /**
   * <pre>
   * 返回数据
   * </pre>
   *
   * <code>.grpccommon.DbData dbData = 2;</code>
   */
  public boolean hasDbData() {
    return dbData_ != null;
  }
  /**
   * <pre>
   * 返回数据
   * </pre>
   *
   * <code>.grpccommon.DbData dbData = 2;</code>
   */
  public com.sunsheen.metadatacom.grpc.service.grpccommon.DbData getDbData() {
    return dbData_ == null ? com.sunsheen.metadatacom.grpc.service.grpccommon.DbData.getDefaultInstance() : dbData_;
  }
  /**
   * <pre>
   * 返回数据
   * </pre>
   *
   * <code>.grpccommon.DbData dbData = 2;</code>
   */
  public com.sunsheen.metadatacom.grpc.service.grpccommon.DbDataOrBuilder getDbDataOrBuilder() {
    return getDbData();
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
    if (returnCode_ != 0) {
      output.writeInt32(1, returnCode_);
    }
    if (dbData_ != null) {
      output.writeMessage(2, getDbData());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (returnCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, returnCode_);
    }
    if (dbData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDbData());
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
    if (!(obj instanceof com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData)) {
      return super.equals(obj);
    }
    com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData other = (com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData) obj;

    boolean result = true;
    result = result && (getReturnCode()
        == other.getReturnCode());
    result = result && (hasDbData() == other.hasDbData());
    if (hasDbData()) {
      result = result && getDbData()
          .equals(other.getDbData());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RETURNCODE_FIELD_NUMBER;
    hash = (53 * hash) + getReturnCode();
    if (hasDbData()) {
      hash = (37 * hash) + DBDATA_FIELD_NUMBER;
      hash = (53 * hash) + getDbData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData parseFrom(
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
  public static Builder newBuilder(com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData prototype) {
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
   * <pre>
   * 返回状态及返回数据
   * </pre>
   *
   * Protobuf type {@code grpccommon.ResponseData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpccommon.ResponseData)
      com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sunsheen.metadatacom.grpc.service.grpccommon.GrpcCommonProto.internal_static_grpccommon_ResponseData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sunsheen.metadatacom.grpc.service.grpccommon.GrpcCommonProto.internal_static_grpccommon_ResponseData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData.class, com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData.Builder.class);
    }

    // Construct using com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData.newBuilder()
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
      returnCode_ = 0;

      if (dbDataBuilder_ == null) {
        dbData_ = null;
      } else {
        dbData_ = null;
        dbDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sunsheen.metadatacom.grpc.service.grpccommon.GrpcCommonProto.internal_static_grpccommon_ResponseData_descriptor;
    }

    @java.lang.Override
    public com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData getDefaultInstanceForType() {
      return com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData.getDefaultInstance();
    }

    @java.lang.Override
    public com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData build() {
      com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData buildPartial() {
      com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData result = new com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData(this);
      result.returnCode_ = returnCode_;
      if (dbDataBuilder_ == null) {
        result.dbData_ = dbData_;
      } else {
        result.dbData_ = dbDataBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData) {
        return mergeFrom((com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData other) {
      if (other == com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData.getDefaultInstance()) return this;
      if (other.getReturnCode() != 0) {
        setReturnCode(other.getReturnCode());
      }
      if (other.hasDbData()) {
        mergeDbData(other.getDbData());
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
      com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int returnCode_ ;
    /**
     * <pre>
     * 返回状态
     * </pre>
     *
     * <code>int32 returnCode = 1;</code>
     */
    public int getReturnCode() {
      return returnCode_;
    }
    /**
     * <pre>
     * 返回状态
     * </pre>
     *
     * <code>int32 returnCode = 1;</code>
     */
    public Builder setReturnCode(int value) {
      
      returnCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 返回状态
     * </pre>
     *
     * <code>int32 returnCode = 1;</code>
     */
    public Builder clearReturnCode() {
      
      returnCode_ = 0;
      onChanged();
      return this;
    }

    private com.sunsheen.metadatacom.grpc.service.grpccommon.DbData dbData_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.sunsheen.metadatacom.grpc.service.grpccommon.DbData, com.sunsheen.metadatacom.grpc.service.grpccommon.DbData.Builder, com.sunsheen.metadatacom.grpc.service.grpccommon.DbDataOrBuilder> dbDataBuilder_;
    /**
     * <pre>
     * 返回数据
     * </pre>
     *
     * <code>.grpccommon.DbData dbData = 2;</code>
     */
    public boolean hasDbData() {
      return dbDataBuilder_ != null || dbData_ != null;
    }
    /**
     * <pre>
     * 返回数据
     * </pre>
     *
     * <code>.grpccommon.DbData dbData = 2;</code>
     */
    public com.sunsheen.metadatacom.grpc.service.grpccommon.DbData getDbData() {
      if (dbDataBuilder_ == null) {
        return dbData_ == null ? com.sunsheen.metadatacom.grpc.service.grpccommon.DbData.getDefaultInstance() : dbData_;
      } else {
        return dbDataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 返回数据
     * </pre>
     *
     * <code>.grpccommon.DbData dbData = 2;</code>
     */
    public Builder setDbData(com.sunsheen.metadatacom.grpc.service.grpccommon.DbData value) {
      if (dbDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dbData_ = value;
        onChanged();
      } else {
        dbDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 返回数据
     * </pre>
     *
     * <code>.grpccommon.DbData dbData = 2;</code>
     */
    public Builder setDbData(
        com.sunsheen.metadatacom.grpc.service.grpccommon.DbData.Builder builderForValue) {
      if (dbDataBuilder_ == null) {
        dbData_ = builderForValue.build();
        onChanged();
      } else {
        dbDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 返回数据
     * </pre>
     *
     * <code>.grpccommon.DbData dbData = 2;</code>
     */
    public Builder mergeDbData(com.sunsheen.metadatacom.grpc.service.grpccommon.DbData value) {
      if (dbDataBuilder_ == null) {
        if (dbData_ != null) {
          dbData_ =
            com.sunsheen.metadatacom.grpc.service.grpccommon.DbData.newBuilder(dbData_).mergeFrom(value).buildPartial();
        } else {
          dbData_ = value;
        }
        onChanged();
      } else {
        dbDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 返回数据
     * </pre>
     *
     * <code>.grpccommon.DbData dbData = 2;</code>
     */
    public Builder clearDbData() {
      if (dbDataBuilder_ == null) {
        dbData_ = null;
        onChanged();
      } else {
        dbData_ = null;
        dbDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 返回数据
     * </pre>
     *
     * <code>.grpccommon.DbData dbData = 2;</code>
     */
    public com.sunsheen.metadatacom.grpc.service.grpccommon.DbData.Builder getDbDataBuilder() {
      
      onChanged();
      return getDbDataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 返回数据
     * </pre>
     *
     * <code>.grpccommon.DbData dbData = 2;</code>
     */
    public com.sunsheen.metadatacom.grpc.service.grpccommon.DbDataOrBuilder getDbDataOrBuilder() {
      if (dbDataBuilder_ != null) {
        return dbDataBuilder_.getMessageOrBuilder();
      } else {
        return dbData_ == null ?
            com.sunsheen.metadatacom.grpc.service.grpccommon.DbData.getDefaultInstance() : dbData_;
      }
    }
    /**
     * <pre>
     * 返回数据
     * </pre>
     *
     * <code>.grpccommon.DbData dbData = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.sunsheen.metadatacom.grpc.service.grpccommon.DbData, com.sunsheen.metadatacom.grpc.service.grpccommon.DbData.Builder, com.sunsheen.metadatacom.grpc.service.grpccommon.DbDataOrBuilder> 
        getDbDataFieldBuilder() {
      if (dbDataBuilder_ == null) {
        dbDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.sunsheen.metadatacom.grpc.service.grpccommon.DbData, com.sunsheen.metadatacom.grpc.service.grpccommon.DbData.Builder, com.sunsheen.metadatacom.grpc.service.grpccommon.DbDataOrBuilder>(
                getDbData(),
                getParentForChildren(),
                isClean());
        dbData_ = null;
      }
      return dbDataBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpccommon.ResponseData)
  }

  // @@protoc_insertion_point(class_scope:grpccommon.ResponseData)
  private static final com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData();
  }

  public static com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseData>
      PARSER = new com.google.protobuf.AbstractParser<ResponseData>() {
    @java.lang.Override
    public ResponseData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResponseData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResponseData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponseData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

