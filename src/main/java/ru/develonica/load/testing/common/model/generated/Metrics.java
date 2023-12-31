// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LoadTestingStart.proto

package ru.develonica.load.testing.common.model.generated;

/**
 * Protobuf type {@code ru.develonica.load.testing.common.model.generated.Metrics}
 */
public final class Metrics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ru.develonica.load.testing.common.model.generated.Metrics)
    MetricsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Metrics.newBuilder() to construct.
  private Metrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Metrics() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Metrics();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ru.develonica.load.testing.common.model.generated.LoadTestingStart.internal_static_ru_develonica_load_testing_common_model_generated_Metrics_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetCodesReceived();
      case 2:
        return internalGetMemoryMetrics();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.develonica.load.testing.common.model.generated.LoadTestingStart.internal_static_ru_develonica_load_testing_common_model_generated_Metrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.develonica.load.testing.common.model.generated.Metrics.class, ru.develonica.load.testing.common.model.generated.Metrics.Builder.class);
  }

  public static final int CODESRECEIVED_FIELD_NUMBER = 1;
  private static final class CodesReceivedDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, java.lang.Long> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, java.lang.Long>newDefaultInstance(
                ru.develonica.load.testing.common.model.generated.LoadTestingStart.internal_static_ru_develonica_load_testing_common_model_generated_Metrics_CodesReceivedEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L);
  }
  private com.google.protobuf.MapField<
      java.lang.Integer, java.lang.Long> codesReceived_;
  private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long>
  internalGetCodesReceived() {
    if (codesReceived_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          CodesReceivedDefaultEntryHolder.defaultEntry);
    }
    return codesReceived_;
  }

  public int getCodesReceivedCount() {
    return internalGetCodesReceived().getMap().size();
  }
  /**
   * <code>map&lt;int32, int64&gt; codesReceived = 1;</code>
   */

  @java.lang.Override
  public boolean containsCodesReceived(
      int key) {
    
    return internalGetCodesReceived().getMap().containsKey(key);
  }
  /**
   * Use {@link #getCodesReceivedMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, java.lang.Long> getCodesReceived() {
    return getCodesReceivedMap();
  }
  /**
   * <code>map&lt;int32, int64&gt; codesReceived = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.Integer, java.lang.Long> getCodesReceivedMap() {
    return internalGetCodesReceived().getMap();
  }
  /**
   * <code>map&lt;int32, int64&gt; codesReceived = 1;</code>
   */
  @java.lang.Override

  public long getCodesReceivedOrDefault(
      int key,
      long defaultValue) {
    
    java.util.Map<java.lang.Integer, java.lang.Long> map =
        internalGetCodesReceived().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;int32, int64&gt; codesReceived = 1;</code>
   */
  @java.lang.Override

  public long getCodesReceivedOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, java.lang.Long> map =
        internalGetCodesReceived().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int MEMORYMETRICS_FIELD_NUMBER = 2;
  private static final class MemoryMetricsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric>newDefaultInstance(
                ru.develonica.load.testing.common.model.generated.LoadTestingStart.internal_static_ru_develonica_load_testing_common_model_generated_Metrics_MemoryMetricsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                ru.develonica.load.testing.common.model.generated.TimeBasedMetric.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric> memoryMetrics_;
  private com.google.protobuf.MapField<java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric>
  internalGetMemoryMetrics() {
    if (memoryMetrics_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          MemoryMetricsDefaultEntryHolder.defaultEntry);
    }
    return memoryMetrics_;
  }

  public int getMemoryMetricsCount() {
    return internalGetMemoryMetrics().getMap().size();
  }
  /**
   * <code>map&lt;string, .ru.develonica.load.testing.common.model.generated.TimeBasedMetric&gt; memoryMetrics = 2;</code>
   */

  @java.lang.Override
  public boolean containsMemoryMetrics(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetMemoryMetrics().getMap().containsKey(key);
  }
  /**
   * Use {@link #getMemoryMetricsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric> getMemoryMetrics() {
    return getMemoryMetricsMap();
  }
  /**
   * <code>map&lt;string, .ru.develonica.load.testing.common.model.generated.TimeBasedMetric&gt; memoryMetrics = 2;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric> getMemoryMetricsMap() {
    return internalGetMemoryMetrics().getMap();
  }
  /**
   * <code>map&lt;string, .ru.develonica.load.testing.common.model.generated.TimeBasedMetric&gt; memoryMetrics = 2;</code>
   */
  @java.lang.Override

  public ru.develonica.load.testing.common.model.generated.TimeBasedMetric getMemoryMetricsOrDefault(
      java.lang.String key,
      ru.develonica.load.testing.common.model.generated.TimeBasedMetric defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric> map =
        internalGetMemoryMetrics().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .ru.develonica.load.testing.common.model.generated.TimeBasedMetric&gt; memoryMetrics = 2;</code>
   */
  @java.lang.Override

  public ru.develonica.load.testing.common.model.generated.TimeBasedMetric getMemoryMetricsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric> map =
        internalGetMemoryMetrics().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetCodesReceived(),
        CodesReceivedDefaultEntryHolder.defaultEntry,
        1);
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetMemoryMetrics(),
        MemoryMetricsDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Long> entry
         : internalGetCodesReceived().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Long>
      codesReceived__ = CodesReceivedDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, codesReceived__);
    }
    for (java.util.Map.Entry<java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric> entry
         : internalGetMemoryMetrics().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric>
      memoryMetrics__ = MemoryMetricsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, memoryMetrics__);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ru.develonica.load.testing.common.model.generated.Metrics)) {
      return super.equals(obj);
    }
    ru.develonica.load.testing.common.model.generated.Metrics other = (ru.develonica.load.testing.common.model.generated.Metrics) obj;

    if (!internalGetCodesReceived().equals(
        other.internalGetCodesReceived())) return false;
    if (!internalGetMemoryMetrics().equals(
        other.internalGetMemoryMetrics())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetCodesReceived().getMap().isEmpty()) {
      hash = (37 * hash) + CODESRECEIVED_FIELD_NUMBER;
      hash = (53 * hash) + internalGetCodesReceived().hashCode();
    }
    if (!internalGetMemoryMetrics().getMap().isEmpty()) {
      hash = (37 * hash) + MEMORYMETRICS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMemoryMetrics().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.develonica.load.testing.common.model.generated.Metrics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.develonica.load.testing.common.model.generated.Metrics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.develonica.load.testing.common.model.generated.Metrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.develonica.load.testing.common.model.generated.Metrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.develonica.load.testing.common.model.generated.Metrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.develonica.load.testing.common.model.generated.Metrics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.develonica.load.testing.common.model.generated.Metrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.develonica.load.testing.common.model.generated.Metrics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.develonica.load.testing.common.model.generated.Metrics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ru.develonica.load.testing.common.model.generated.Metrics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.develonica.load.testing.common.model.generated.Metrics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.develonica.load.testing.common.model.generated.Metrics parseFrom(
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
  public static Builder newBuilder(ru.develonica.load.testing.common.model.generated.Metrics prototype) {
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
   * Protobuf type {@code ru.develonica.load.testing.common.model.generated.Metrics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ru.develonica.load.testing.common.model.generated.Metrics)
      ru.develonica.load.testing.common.model.generated.MetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.develonica.load.testing.common.model.generated.LoadTestingStart.internal_static_ru_develonica_load_testing_common_model_generated_Metrics_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetCodesReceived();
        case 2:
          return internalGetMemoryMetrics();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableCodesReceived();
        case 2:
          return internalGetMutableMemoryMetrics();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.develonica.load.testing.common.model.generated.LoadTestingStart.internal_static_ru_develonica_load_testing_common_model_generated_Metrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.develonica.load.testing.common.model.generated.Metrics.class, ru.develonica.load.testing.common.model.generated.Metrics.Builder.class);
    }

    // Construct using ru.develonica.load.testing.common.model.generated.Metrics.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableCodesReceived().clear();
      internalGetMutableMemoryMetrics().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.develonica.load.testing.common.model.generated.LoadTestingStart.internal_static_ru_develonica_load_testing_common_model_generated_Metrics_descriptor;
    }

    @java.lang.Override
    public ru.develonica.load.testing.common.model.generated.Metrics getDefaultInstanceForType() {
      return ru.develonica.load.testing.common.model.generated.Metrics.getDefaultInstance();
    }

    @java.lang.Override
    public ru.develonica.load.testing.common.model.generated.Metrics build() {
      ru.develonica.load.testing.common.model.generated.Metrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ru.develonica.load.testing.common.model.generated.Metrics buildPartial() {
      ru.develonica.load.testing.common.model.generated.Metrics result = new ru.develonica.load.testing.common.model.generated.Metrics(this);
      int from_bitField0_ = bitField0_;
      result.codesReceived_ = internalGetCodesReceived();
      result.codesReceived_.makeImmutable();
      result.memoryMetrics_ = internalGetMemoryMetrics();
      result.memoryMetrics_.makeImmutable();
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
      if (other instanceof ru.develonica.load.testing.common.model.generated.Metrics) {
        return mergeFrom((ru.develonica.load.testing.common.model.generated.Metrics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.develonica.load.testing.common.model.generated.Metrics other) {
      if (other == ru.develonica.load.testing.common.model.generated.Metrics.getDefaultInstance()) return this;
      internalGetMutableCodesReceived().mergeFrom(
          other.internalGetCodesReceived());
      internalGetMutableMemoryMetrics().mergeFrom(
          other.internalGetMemoryMetrics());
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Long>
              codesReceived__ = input.readMessage(
                  CodesReceivedDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableCodesReceived().getMutableMap().put(
                  codesReceived__.getKey(), codesReceived__.getValue());
              break;
            } // case 10
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric>
              memoryMetrics__ = input.readMessage(
                  MemoryMetricsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableMemoryMetrics().getMutableMap().put(
                  memoryMetrics__.getKey(), memoryMetrics__.getValue());
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Long> codesReceived_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long>
    internalGetCodesReceived() {
      if (codesReceived_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            CodesReceivedDefaultEntryHolder.defaultEntry);
      }
      return codesReceived_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long>
    internalGetMutableCodesReceived() {
      onChanged();;
      if (codesReceived_ == null) {
        codesReceived_ = com.google.protobuf.MapField.newMapField(
            CodesReceivedDefaultEntryHolder.defaultEntry);
      }
      if (!codesReceived_.isMutable()) {
        codesReceived_ = codesReceived_.copy();
      }
      return codesReceived_;
    }

    public int getCodesReceivedCount() {
      return internalGetCodesReceived().getMap().size();
    }
    /**
     * <code>map&lt;int32, int64&gt; codesReceived = 1;</code>
     */

    @java.lang.Override
    public boolean containsCodesReceived(
        int key) {
      
      return internalGetCodesReceived().getMap().containsKey(key);
    }
    /**
     * Use {@link #getCodesReceivedMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Long> getCodesReceived() {
      return getCodesReceivedMap();
    }
    /**
     * <code>map&lt;int32, int64&gt; codesReceived = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Long> getCodesReceivedMap() {
      return internalGetCodesReceived().getMap();
    }
    /**
     * <code>map&lt;int32, int64&gt; codesReceived = 1;</code>
     */
    @java.lang.Override

    public long getCodesReceivedOrDefault(
        int key,
        long defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Long> map =
          internalGetCodesReceived().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;int32, int64&gt; codesReceived = 1;</code>
     */
    @java.lang.Override

    public long getCodesReceivedOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Long> map =
          internalGetCodesReceived().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearCodesReceived() {
      internalGetMutableCodesReceived().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;int32, int64&gt; codesReceived = 1;</code>
     */

    public Builder removeCodesReceived(
        int key) {
      
      internalGetMutableCodesReceived().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Long>
    getMutableCodesReceived() {
      return internalGetMutableCodesReceived().getMutableMap();
    }
    /**
     * <code>map&lt;int32, int64&gt; codesReceived = 1;</code>
     */
    public Builder putCodesReceived(
        int key,
        long value) {
      
      
      internalGetMutableCodesReceived().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;int32, int64&gt; codesReceived = 1;</code>
     */

    public Builder putAllCodesReceived(
        java.util.Map<java.lang.Integer, java.lang.Long> values) {
      internalGetMutableCodesReceived().getMutableMap()
          .putAll(values);
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric> memoryMetrics_;
    private com.google.protobuf.MapField<java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric>
    internalGetMemoryMetrics() {
      if (memoryMetrics_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MemoryMetricsDefaultEntryHolder.defaultEntry);
      }
      return memoryMetrics_;
    }
    private com.google.protobuf.MapField<java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric>
    internalGetMutableMemoryMetrics() {
      onChanged();;
      if (memoryMetrics_ == null) {
        memoryMetrics_ = com.google.protobuf.MapField.newMapField(
            MemoryMetricsDefaultEntryHolder.defaultEntry);
      }
      if (!memoryMetrics_.isMutable()) {
        memoryMetrics_ = memoryMetrics_.copy();
      }
      return memoryMetrics_;
    }

    public int getMemoryMetricsCount() {
      return internalGetMemoryMetrics().getMap().size();
    }
    /**
     * <code>map&lt;string, .ru.develonica.load.testing.common.model.generated.TimeBasedMetric&gt; memoryMetrics = 2;</code>
     */

    @java.lang.Override
    public boolean containsMemoryMetrics(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetMemoryMetrics().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMemoryMetricsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric> getMemoryMetrics() {
      return getMemoryMetricsMap();
    }
    /**
     * <code>map&lt;string, .ru.develonica.load.testing.common.model.generated.TimeBasedMetric&gt; memoryMetrics = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric> getMemoryMetricsMap() {
      return internalGetMemoryMetrics().getMap();
    }
    /**
     * <code>map&lt;string, .ru.develonica.load.testing.common.model.generated.TimeBasedMetric&gt; memoryMetrics = 2;</code>
     */
    @java.lang.Override

    public ru.develonica.load.testing.common.model.generated.TimeBasedMetric getMemoryMetricsOrDefault(
        java.lang.String key,
        ru.develonica.load.testing.common.model.generated.TimeBasedMetric defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric> map =
          internalGetMemoryMetrics().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .ru.develonica.load.testing.common.model.generated.TimeBasedMetric&gt; memoryMetrics = 2;</code>
     */
    @java.lang.Override

    public ru.develonica.load.testing.common.model.generated.TimeBasedMetric getMemoryMetricsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric> map =
          internalGetMemoryMetrics().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearMemoryMetrics() {
      internalGetMutableMemoryMetrics().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .ru.develonica.load.testing.common.model.generated.TimeBasedMetric&gt; memoryMetrics = 2;</code>
     */

    public Builder removeMemoryMetrics(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableMemoryMetrics().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric>
    getMutableMemoryMetrics() {
      return internalGetMutableMemoryMetrics().getMutableMap();
    }
    /**
     * <code>map&lt;string, .ru.develonica.load.testing.common.model.generated.TimeBasedMetric&gt; memoryMetrics = 2;</code>
     */
    public Builder putMemoryMetrics(
        java.lang.String key,
        ru.develonica.load.testing.common.model.generated.TimeBasedMetric value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableMemoryMetrics().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .ru.develonica.load.testing.common.model.generated.TimeBasedMetric&gt; memoryMetrics = 2;</code>
     */

    public Builder putAllMemoryMetrics(
        java.util.Map<java.lang.String, ru.develonica.load.testing.common.model.generated.TimeBasedMetric> values) {
      internalGetMutableMemoryMetrics().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:ru.develonica.load.testing.common.model.generated.Metrics)
  }

  // @@protoc_insertion_point(class_scope:ru.develonica.load.testing.common.model.generated.Metrics)
  private static final ru.develonica.load.testing.common.model.generated.Metrics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.develonica.load.testing.common.model.generated.Metrics();
  }

  public static ru.develonica.load.testing.common.model.generated.Metrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Metrics>
      PARSER = new com.google.protobuf.AbstractParser<Metrics>() {
    @java.lang.Override
    public Metrics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Metrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Metrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ru.develonica.load.testing.common.model.generated.Metrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

