// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpcCommon.proto

package com.sunsheen.metadatacom.grpc.service.grpccommon;

public final class GrpcCommonProto {
  private GrpcCommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpccommon_UserPwdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpccommon_UserPwdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpccommon_DatumCodeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpccommon_DatumCodeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpccommon_TableMap_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpccommon_TableMap_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpccommon_TableMap_MapAnyEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpccommon_TableMap_MapAnyEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpccommon_DbData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpccommon_DbData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpccommon_ResponseData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpccommon_ResponseData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpccommon_StringResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpccommon_StringResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpccommon_IntResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpccommon_IntResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpccommon_LongResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpccommon_LongResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020grpcCommon.proto\022\ngrpccommon\032\031google/p" +
      "rotobuf/any.proto\"B\n\016UserPwdRequest\022\016\n\006u" +
      "serId\030\001 \001(\t\022\013\n\003pwd\030\002 \001(\t\022\023\n\013interfaceId\030" +
      "\003 \001(\t\"Y\n\020DatumCodeRequest\0222\n\016userPwdRequ" +
      "est\030\001 \001(\0132\032.grpccommon.UserPwdRequest\022\021\n" +
      "\tdatumCode\030\002 \001(\t\"\201\001\n\010TableMap\0220\n\006mapAny\030" +
      "\001 \003(\0132 .grpccommon.TableMap.MapAnyEntry\032" +
      "C\n\013MapAnyEntry\022\013\n\003key\030\001 \001(\t\022#\n\005value\030\002 \001" +
      "(\0132\024.google.protobuf.Any:\0028\001\"0\n\006DbData\022&" +
      "\n\010tableMap\030\001 \003(\0132\024.grpccommon.TableMap\"F" +
      "\n\014ResponseData\022\022\n\nreturnCode\030\001 \001(\005\022\"\n\006db" +
      "Data\030\002 \001(\0132\022.grpccommon.DbData\"%\n\016String" +
      "Response\022\023\n\013stringValue\030\001 \001(\t\"\037\n\013IntResp" +
      "onse\022\020\n\010intValue\030\001 \001(\005\"!\n\014LongResponse\022\021" +
      "\n\tlongValue\030\001 \001(\003BE\n0com.sunsheen.metada" +
      "tacom.grpc.service.grpccommonB\017GrpcCommo" +
      "nProtoP\001b\006proto3"
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
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_grpccommon_UserPwdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpccommon_UserPwdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpccommon_UserPwdRequest_descriptor,
        new java.lang.String[] { "UserId", "Pwd", "InterfaceId", });
    internal_static_grpccommon_DatumCodeRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpccommon_DatumCodeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpccommon_DatumCodeRequest_descriptor,
        new java.lang.String[] { "UserPwdRequest", "DatumCode", });
    internal_static_grpccommon_TableMap_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_grpccommon_TableMap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpccommon_TableMap_descriptor,
        new java.lang.String[] { "MapAny", });
    internal_static_grpccommon_TableMap_MapAnyEntry_descriptor =
      internal_static_grpccommon_TableMap_descriptor.getNestedTypes().get(0);
    internal_static_grpccommon_TableMap_MapAnyEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpccommon_TableMap_MapAnyEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_grpccommon_DbData_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_grpccommon_DbData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpccommon_DbData_descriptor,
        new java.lang.String[] { "TableMap", });
    internal_static_grpccommon_ResponseData_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_grpccommon_ResponseData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpccommon_ResponseData_descriptor,
        new java.lang.String[] { "ReturnCode", "DbData", });
    internal_static_grpccommon_StringResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_grpccommon_StringResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpccommon_StringResponse_descriptor,
        new java.lang.String[] { "StringValue", });
    internal_static_grpccommon_IntResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_grpccommon_IntResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpccommon_IntResponse_descriptor,
        new java.lang.String[] { "IntValue", });
    internal_static_grpccommon_LongResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_grpccommon_LongResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpccommon_LongResponse_descriptor,
        new java.lang.String[] { "LongValue", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}