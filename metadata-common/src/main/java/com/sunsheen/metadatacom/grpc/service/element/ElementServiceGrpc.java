package com.sunsheen.metadatacom.grpc.service.element;

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
    comments = "Source: getElement.proto")
public final class ElementServiceGrpc {

  private ElementServiceGrpc() {}

  public static final String SERVICE_NAME = "element.ElementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest,
      com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getGetElementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getElement",
      requestType = com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest.class,
      responseType = com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest,
      com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getGetElementMethod() {
    io.grpc.MethodDescriptor<com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest, com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getGetElementMethod;
    if ((getGetElementMethod = ElementServiceGrpc.getGetElementMethod) == null) {
      synchronized (ElementServiceGrpc.class) {
        if ((getGetElementMethod = ElementServiceGrpc.getGetElementMethod) == null) {
          ElementServiceGrpc.getGetElementMethod = getGetElementMethod = 
              io.grpc.MethodDescriptor.<com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest, com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "element.ElementService", "getElement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData.getDefaultInstance()))
                  .setSchemaDescriptor(new ElementServiceMethodDescriptorSupplier("getElement"))
                  .build();
          }
        }
     }
     return getGetElementMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ElementServiceStub newStub(io.grpc.Channel channel) {
    return new ElementServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ElementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ElementServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ElementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ElementServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ElementServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 气象数据元数据获取接口
     * </pre>
     */
    public void getElement(com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest request,
        io.grpc.stub.StreamObserver<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> responseObserver) {
      asyncUnimplementedUnaryCall(getGetElementMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetElementMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest,
                com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData>(
                  this, METHODID_GET_ELEMENT)))
          .build();
    }
  }

  /**
   */
  public static final class ElementServiceStub extends io.grpc.stub.AbstractStub<ElementServiceStub> {
    private ElementServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ElementServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElementServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ElementServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 气象数据元数据获取接口
     * </pre>
     */
    public void getElement(com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest request,
        io.grpc.stub.StreamObserver<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetElementMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ElementServiceBlockingStub extends io.grpc.stub.AbstractStub<ElementServiceBlockingStub> {
    private ElementServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ElementServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElementServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ElementServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 气象数据元数据获取接口
     * </pre>
     */
    public com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData getElement(com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetElementMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ElementServiceFutureStub extends io.grpc.stub.AbstractStub<ElementServiceFutureStub> {
    private ElementServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ElementServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElementServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ElementServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 气象数据元数据获取接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sunsheen.metadatacom.grpc.service.grpccommon.ResponseData> getElement(
        com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetElementMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ELEMENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ElementServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ElementServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ELEMENT:
          serviceImpl.getElement((com.sunsheen.metadatacom.grpc.service.grpccommon.UserPwdRequest) request,
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

  private static abstract class ElementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ElementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sunsheen.metadatacom.grpc.service.element.ElementProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ElementService");
    }
  }

  private static final class ElementServiceFileDescriptorSupplier
      extends ElementServiceBaseDescriptorSupplier {
    ElementServiceFileDescriptorSupplier() {}
  }

  private static final class ElementServiceMethodDescriptorSupplier
      extends ElementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ElementServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ElementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ElementServiceFileDescriptorSupplier())
              .addMethod(getGetElementMethod())
              .build();
        }
      }
    }
    return result;
  }
}
