package com.sunsheen.metadatacom.grpc.service.handle;

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
    comments = "Source: getHandleByDatumCode.proto")
public final class HandleServiceGrpc {

  private HandleServiceGrpc() {}

  public static final String SERVICE_NAME = "handle.HandleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest,
      com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getGetHandleByDatumCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHandleByDatumCode",
      requestType = com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest.class,
      responseType = com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest,
      com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getGetHandleByDatumCodeMethod() {
    io.grpc.MethodDescriptor<com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest, com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getGetHandleByDatumCodeMethod;
    if ((getGetHandleByDatumCodeMethod = HandleServiceGrpc.getGetHandleByDatumCodeMethod) == null) {
      synchronized (HandleServiceGrpc.class) {
        if ((getGetHandleByDatumCodeMethod = HandleServiceGrpc.getGetHandleByDatumCodeMethod) == null) {
          HandleServiceGrpc.getGetHandleByDatumCodeMethod = getGetHandleByDatumCodeMethod = 
              io.grpc.MethodDescriptor.<com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest, com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "handle.HandleService", "getHandleByDatumCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData.getDefaultInstance()))
                  .setSchemaDescriptor(new HandleServiceMethodDescriptorSupplier("getHandleByDatumCode"))
                  .build();
          }
        }
     }
     return getGetHandleByDatumCodeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HandleServiceStub newStub(io.grpc.Channel channel) {
    return new HandleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HandleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HandleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HandleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HandleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HandleServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 按资料编码检索总控处理表接口
     * </pre>
     */
    public void getHandleByDatumCode(com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest request,
        io.grpc.stub.StreamObserver<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHandleByDatumCodeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHandleByDatumCodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest,
                com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData>(
                  this, METHODID_GET_HANDLE_BY_DATUM_CODE)))
          .build();
    }
  }

  /**
   */
  public static final class HandleServiceStub extends io.grpc.stub.AbstractStub<HandleServiceStub> {
    private HandleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HandleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HandleServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 按资料编码检索总控处理表接口
     * </pre>
     */
    public void getHandleByDatumCode(com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest request,
        io.grpc.stub.StreamObserver<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHandleByDatumCodeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HandleServiceBlockingStub extends io.grpc.stub.AbstractStub<HandleServiceBlockingStub> {
    private HandleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HandleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HandleServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 按资料编码检索总控处理表接口
     * </pre>
     */
    public com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData getHandleByDatumCode(com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetHandleByDatumCodeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HandleServiceFutureStub extends io.grpc.stub.AbstractStub<HandleServiceFutureStub> {
    private HandleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HandleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HandleServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 按资料编码检索总控处理表接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getHandleByDatumCode(
        com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHandleByDatumCodeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HANDLE_BY_DATUM_CODE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HandleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HandleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HANDLE_BY_DATUM_CODE:
          serviceImpl.getHandleByDatumCode((com.sunsheen.metadatacom.grpc.service.grpccommon.DatumCodeRequest) request,
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

  private static abstract class HandleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HandleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sunsheen.metadatacom.grpc.service.handle.HandleProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HandleService");
    }
  }

  private static final class HandleServiceFileDescriptorSupplier
      extends HandleServiceBaseDescriptorSupplier {
    HandleServiceFileDescriptorSupplier() {}
  }

  private static final class HandleServiceMethodDescriptorSupplier
      extends HandleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HandleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HandleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HandleServiceFileDescriptorSupplier())
              .addMethod(getGetHandleByDatumCodeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
