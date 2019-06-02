package com.sunsheen.metadatacom.grpc.service.datumtypeelm;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: getDatumtypeelm.proto")
public final class DatumtypeelmServiceGrpc {

  private DatumtypeelmServiceGrpc() {}

  public static final String SERVICE_NAME = "datumtypeelm.DatumtypeelmService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest,
      com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getGetDatumtypeelmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDatumtypeelm",
      requestType = com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest.class,
      responseType = com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest,
      com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getGetDatumtypeelmMethod() {
    io.grpc.MethodDescriptor<com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest, com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getGetDatumtypeelmMethod;
    if ((getGetDatumtypeelmMethod = DatumtypeelmServiceGrpc.getGetDatumtypeelmMethod) == null) {
      synchronized (DatumtypeelmServiceGrpc.class) {
        if ((getGetDatumtypeelmMethod = DatumtypeelmServiceGrpc.getGetDatumtypeelmMethod) == null) {
          DatumtypeelmServiceGrpc.getGetDatumtypeelmMethod = getGetDatumtypeelmMethod = 
              io.grpc.MethodDescriptor.<com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest, com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "datumtypeelm.DatumtypeelmService", "getDatumtypeelm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData.getDefaultInstance()))
                  .setSchemaDescriptor(new DatumtypeelmServiceMethodDescriptorSupplier("getDatumtypeelm"))
                  .build();
          }
        }
     }
     return getGetDatumtypeelmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest,
      com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getGetElementsInfoByDatumCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getElementsInfoByDatumCode",
      requestType = com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest.class,
      responseType = com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest,
      com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getGetElementsInfoByDatumCodeMethod() {
    io.grpc.MethodDescriptor<com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest, com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getGetElementsInfoByDatumCodeMethod;
    if ((getGetElementsInfoByDatumCodeMethod = DatumtypeelmServiceGrpc.getGetElementsInfoByDatumCodeMethod) == null) {
      synchronized (DatumtypeelmServiceGrpc.class) {
        if ((getGetElementsInfoByDatumCodeMethod = DatumtypeelmServiceGrpc.getGetElementsInfoByDatumCodeMethod) == null) {
          DatumtypeelmServiceGrpc.getGetElementsInfoByDatumCodeMethod = getGetElementsInfoByDatumCodeMethod = 
              io.grpc.MethodDescriptor.<com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest, com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "datumtypeelm.DatumtypeelmService", "getElementsInfoByDatumCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData.getDefaultInstance()))
                  .setSchemaDescriptor(new DatumtypeelmServiceMethodDescriptorSupplier("getElementsInfoByDatumCode"))
                  .build();
          }
        }
     }
     return getGetElementsInfoByDatumCodeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatumtypeelmServiceStub newStub(io.grpc.Channel channel) {
    return new DatumtypeelmServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatumtypeelmServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DatumtypeelmServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatumtypeelmServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DatumtypeelmServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DatumtypeelmServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取全部的资料编码与数据元关系数据接口
     * </pre>
     */
    public void getDatumtypeelm(com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest request,
        io.grpc.stub.StreamObserver<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDatumtypeelmMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取指定资料编码与数据元的关系数据接口
     * </pre>
     */
    public void getElementsInfoByDatumCode(com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest request,
        io.grpc.stub.StreamObserver<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> responseObserver) {
      asyncUnimplementedUnaryCall(getGetElementsInfoByDatumCodeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDatumtypeelmMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest,
                com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData>(
                  this, METHODID_GET_DATUMTYPEELM)))
          .addMethod(
            getGetElementsInfoByDatumCodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest,
                com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData>(
                  this, METHODID_GET_ELEMENTS_INFO_BY_DATUM_CODE)))
          .build();
    }
  }

  /**
   */
  public static final class DatumtypeelmServiceStub extends io.grpc.stub.AbstractStub<DatumtypeelmServiceStub> {
    private DatumtypeelmServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatumtypeelmServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatumtypeelmServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatumtypeelmServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取全部的资料编码与数据元关系数据接口
     * </pre>
     */
    public void getDatumtypeelm(com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest request,
        io.grpc.stub.StreamObserver<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDatumtypeelmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取指定资料编码与数据元的关系数据接口
     * </pre>
     */
    public void getElementsInfoByDatumCode(com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest request,
        io.grpc.stub.StreamObserver<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetElementsInfoByDatumCodeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DatumtypeelmServiceBlockingStub extends io.grpc.stub.AbstractStub<DatumtypeelmServiceBlockingStub> {
    private DatumtypeelmServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatumtypeelmServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatumtypeelmServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatumtypeelmServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取全部的资料编码与数据元关系数据接口
     * </pre>
     */
    public com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData getDatumtypeelm(com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDatumtypeelmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取指定资料编码与数据元的关系数据接口
     * </pre>
     */
    public com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData getElementsInfoByDatumCode(com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetElementsInfoByDatumCodeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DatumtypeelmServiceFutureStub extends io.grpc.stub.AbstractStub<DatumtypeelmServiceFutureStub> {
    private DatumtypeelmServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatumtypeelmServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatumtypeelmServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatumtypeelmServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取全部的资料编码与数据元关系数据接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getDatumtypeelm(
        com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDatumtypeelmMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取指定资料编码与数据元的关系数据接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getElementsInfoByDatumCode(
        com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetElementsInfoByDatumCodeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DATUMTYPEELM = 0;
  private static final int METHODID_GET_ELEMENTS_INFO_BY_DATUM_CODE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DatumtypeelmServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DatumtypeelmServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DATUMTYPEELM:
          serviceImpl.getDatumtypeelm((com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest) request,
              (io.grpc.stub.StreamObserver<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData>) responseObserver);
          break;
        case METHODID_GET_ELEMENTS_INFO_BY_DATUM_CODE:
          serviceImpl.getElementsInfoByDatumCode((com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DatumtypeelmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DatumtypeelmServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sunsheen.metadatacom.grpc.service.datumtypeelm.DatumtypeelmProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DatumtypeelmService");
    }
  }

  private static final class DatumtypeelmServiceFileDescriptorSupplier
      extends DatumtypeelmServiceBaseDescriptorSupplier {
    DatumtypeelmServiceFileDescriptorSupplier() {}
  }

  private static final class DatumtypeelmServiceMethodDescriptorSupplier
      extends DatumtypeelmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DatumtypeelmServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DatumtypeelmServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DatumtypeelmServiceFileDescriptorSupplier())
              .addMethod(getGetDatumtypeelmMethod())
              .addMethod(getGetElementsInfoByDatumCodeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
