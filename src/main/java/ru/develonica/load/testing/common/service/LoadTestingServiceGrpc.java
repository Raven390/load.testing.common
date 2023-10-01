package ru.develonica.load.testing.common.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@jakarta.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: LoadTestingStart.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LoadTestingServiceGrpc {

  private LoadTestingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ru.develonica.load.testing.common.model.generated.LoadTestingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.develonica.load.testing.common.model.generated.LoadTestingStartRequest,
      ru.develonica.load.testing.common.model.generated.LoadTestingStartResponse> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "start",
      requestType = ru.develonica.load.testing.common.model.generated.LoadTestingStartRequest.class,
      responseType = ru.develonica.load.testing.common.model.generated.LoadTestingStartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.develonica.load.testing.common.model.generated.LoadTestingStartRequest,
      ru.develonica.load.testing.common.model.generated.LoadTestingStartResponse> getStartMethod() {
    io.grpc.MethodDescriptor<ru.develonica.load.testing.common.model.generated.LoadTestingStartRequest, ru.develonica.load.testing.common.model.generated.LoadTestingStartResponse> getStartMethod;
    if ((getStartMethod = LoadTestingServiceGrpc.getStartMethod) == null) {
      synchronized (LoadTestingServiceGrpc.class) {
        if ((getStartMethod = LoadTestingServiceGrpc.getStartMethod) == null) {
          LoadTestingServiceGrpc.getStartMethod = getStartMethod =
              io.grpc.MethodDescriptor.<ru.develonica.load.testing.common.model.generated.LoadTestingStartRequest, ru.develonica.load.testing.common.model.generated.LoadTestingStartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.develonica.load.testing.common.model.generated.LoadTestingStartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.develonica.load.testing.common.model.generated.LoadTestingStartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoadTestingServiceMethodDescriptorSupplier("start"))
              .build();
        }
      }
    }
    return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.develonica.load.testing.common.model.generated.Empty,
      ru.develonica.load.testing.common.model.generated.Metrics> getMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "metrics",
      requestType = ru.develonica.load.testing.common.model.generated.Empty.class,
      responseType = ru.develonica.load.testing.common.model.generated.Metrics.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.develonica.load.testing.common.model.generated.Empty,
      ru.develonica.load.testing.common.model.generated.Metrics> getMetricsMethod() {
    io.grpc.MethodDescriptor<ru.develonica.load.testing.common.model.generated.Empty, ru.develonica.load.testing.common.model.generated.Metrics> getMetricsMethod;
    if ((getMetricsMethod = LoadTestingServiceGrpc.getMetricsMethod) == null) {
      synchronized (LoadTestingServiceGrpc.class) {
        if ((getMetricsMethod = LoadTestingServiceGrpc.getMetricsMethod) == null) {
          LoadTestingServiceGrpc.getMetricsMethod = getMetricsMethod =
              io.grpc.MethodDescriptor.<ru.develonica.load.testing.common.model.generated.Empty, ru.develonica.load.testing.common.model.generated.Metrics>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "metrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.develonica.load.testing.common.model.generated.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.develonica.load.testing.common.model.generated.Metrics.getDefaultInstance()))
              .setSchemaDescriptor(new LoadTestingServiceMethodDescriptorSupplier("metrics"))
              .build();
        }
      }
    }
    return getMetricsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoadTestingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoadTestingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoadTestingServiceStub>() {
        @java.lang.Override
        public LoadTestingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoadTestingServiceStub(channel, callOptions);
        }
      };
    return LoadTestingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoadTestingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoadTestingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoadTestingServiceBlockingStub>() {
        @java.lang.Override
        public LoadTestingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoadTestingServiceBlockingStub(channel, callOptions);
        }
      };
    return LoadTestingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoadTestingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoadTestingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoadTestingServiceFutureStub>() {
        @java.lang.Override
        public LoadTestingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoadTestingServiceFutureStub(channel, callOptions);
        }
      };
    return LoadTestingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void start(ru.develonica.load.testing.common.model.generated.LoadTestingStartRequest request,
        io.grpc.stub.StreamObserver<ru.develonica.load.testing.common.model.generated.LoadTestingStartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     */
    default void metrics(ru.develonica.load.testing.common.model.generated.Empty request,
        io.grpc.stub.StreamObserver<ru.develonica.load.testing.common.model.generated.Metrics> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMetricsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LoadTestingService.
   */
  public static abstract class LoadTestingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LoadTestingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LoadTestingService.
   */
  public static final class LoadTestingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LoadTestingServiceStub> {
    private LoadTestingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoadTestingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoadTestingServiceStub(channel, callOptions);
    }

    /**
     */
    public void start(ru.develonica.load.testing.common.model.generated.LoadTestingStartRequest request,
        io.grpc.stub.StreamObserver<ru.develonica.load.testing.common.model.generated.LoadTestingStartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void metrics(ru.develonica.load.testing.common.model.generated.Empty request,
        io.grpc.stub.StreamObserver<ru.develonica.load.testing.common.model.generated.Metrics> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMetricsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LoadTestingService.
   */
  public static final class LoadTestingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LoadTestingServiceBlockingStub> {
    private LoadTestingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoadTestingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoadTestingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.develonica.load.testing.common.model.generated.LoadTestingStartResponse start(ru.develonica.load.testing.common.model.generated.LoadTestingStartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.develonica.load.testing.common.model.generated.Metrics metrics(ru.develonica.load.testing.common.model.generated.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMetricsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LoadTestingService.
   */
  public static final class LoadTestingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LoadTestingServiceFutureStub> {
    private LoadTestingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoadTestingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoadTestingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.develonica.load.testing.common.model.generated.LoadTestingStartResponse> start(
        ru.develonica.load.testing.common.model.generated.LoadTestingStartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.develonica.load.testing.common.model.generated.Metrics> metrics(
        ru.develonica.load.testing.common.model.generated.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMetricsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START = 0;
  private static final int METHODID_METRICS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START:
          serviceImpl.start((ru.develonica.load.testing.common.model.generated.LoadTestingStartRequest) request,
              (io.grpc.stub.StreamObserver<ru.develonica.load.testing.common.model.generated.LoadTestingStartResponse>) responseObserver);
          break;
        case METHODID_METRICS:
          serviceImpl.metrics((ru.develonica.load.testing.common.model.generated.Empty) request,
              (io.grpc.stub.StreamObserver<ru.develonica.load.testing.common.model.generated.Metrics>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getStartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ru.develonica.load.testing.common.model.generated.LoadTestingStartRequest,
              ru.develonica.load.testing.common.model.generated.LoadTestingStartResponse>(
                service, METHODID_START)))
        .addMethod(
          getMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ru.develonica.load.testing.common.model.generated.Empty,
              ru.develonica.load.testing.common.model.generated.Metrics>(
                service, METHODID_METRICS)))
        .build();
  }

  private static abstract class LoadTestingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoadTestingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.develonica.load.testing.common.model.generated.LoadTestingStart.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LoadTestingService");
    }
  }

  private static final class LoadTestingServiceFileDescriptorSupplier
      extends LoadTestingServiceBaseDescriptorSupplier {
    LoadTestingServiceFileDescriptorSupplier() {}
  }

  private static final class LoadTestingServiceMethodDescriptorSupplier
      extends LoadTestingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LoadTestingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LoadTestingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LoadTestingServiceFileDescriptorSupplier())
              .addMethod(getStartMethod())
              .addMethod(getMetricsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
