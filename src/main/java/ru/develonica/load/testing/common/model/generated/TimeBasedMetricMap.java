// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LoadTestingStart.proto

package ru.develonica.load.testing.common.model.generated;

/**
 * Protobuf type {@code ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap}
 */
public final class TimeBasedMetricMap extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap)
    TimeBasedMetricMapOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TimeBasedMetricMap.newBuilder() to construct.
  private TimeBasedMetricMap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TimeBasedMetricMap() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TimeBasedMetricMap();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ru.develonica.load.testing.common.model.generated.LoadTestingStart.internal_static_ru_develonica_load_testing_common_model_generated_TimeBasedMetricMap_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetData();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.develonica.load.testing.common.model.generated.LoadTestingStart.internal_static_ru_develonica_load_testing_common_model_generated_TimeBasedMetricMap_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap.class, ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private static final class DataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Long> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Long>newDefaultInstance(
                ru.develonica.load.testing.common.model.generated.LoadTestingStart.internal_static_ru_develonica_load_testing_common_model_generated_TimeBasedMetricMap_DataEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L);
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Long> data_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
  internalGetData() {
    if (data_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          DataDefaultEntryHolder.defaultEntry);
    }
    return data_;
  }

  public int getDataCount() {
    return internalGetData().getMap().size();
  }
  /**
   * <code>map&lt;string, int64&gt; data = 1;</code>
   */

  @java.lang.Override
  public boolean containsData(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetData().getMap().containsKey(key);
  }
  /**
   * Use {@link #getDataMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Long> getData() {
    return getDataMap();
  }
  /**
   * <code>map&lt;string, int64&gt; data = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.Long> getDataMap() {
    return internalGetData().getMap();
  }
  /**
   * <code>map&lt;string, int64&gt; data = 1;</code>
   */
  @java.lang.Override

  public long getDataOrDefault(
      java.lang.String key,
      long defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetData().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, int64&gt; data = 1;</code>
   */
  @java.lang.Override

  public long getDataOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetData().getMap();
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
      .serializeStringMapTo(
        output,
        internalGetData(),
        DataDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry
         : internalGetData().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
      data__ = DataDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, data__);
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
    if (!(obj instanceof ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap)) {
      return super.equals(obj);
    }
    ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap other = (ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap) obj;

    if (!internalGetData().equals(
        other.internalGetData())) return false;
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
    if (!internalGetData().getMap().isEmpty()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap parseFrom(
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
  public static Builder newBuilder(ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap prototype) {
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
   * Protobuf type {@code ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap)
      ru.develonica.load.testing.common.model.generated.TimeBasedMetricMapOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.develonica.load.testing.common.model.generated.LoadTestingStart.internal_static_ru_develonica_load_testing_common_model_generated_TimeBasedMetricMap_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetData();
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
          return internalGetMutableData();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.develonica.load.testing.common.model.generated.LoadTestingStart.internal_static_ru_develonica_load_testing_common_model_generated_TimeBasedMetricMap_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap.class, ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap.Builder.class);
    }

    // Construct using ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableData().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.develonica.load.testing.common.model.generated.LoadTestingStart.internal_static_ru_develonica_load_testing_common_model_generated_TimeBasedMetricMap_descriptor;
    }

    @java.lang.Override
    public ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap getDefaultInstanceForType() {
      return ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap.getDefaultInstance();
    }

    @java.lang.Override
    public ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap build() {
      ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap buildPartial() {
      ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap result = new ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap(this);
      int from_bitField0_ = bitField0_;
      result.data_ = internalGetData();
      result.data_.makeImmutable();
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
      if (other instanceof ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap) {
        return mergeFrom((ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap other) {
      if (other == ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap.getDefaultInstance()) return this;
      internalGetMutableData().mergeFrom(
          other.internalGetData());
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
              com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
              data__ = input.readMessage(
                  DataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableData().getMutableMap().put(
                  data__.getKey(), data__.getValue());
              break;
            } // case 10
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
        java.lang.String, java.lang.Long> data_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
    internalGetData() {
      if (data_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            DataDefaultEntryHolder.defaultEntry);
      }
      return data_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
    internalGetMutableData() {
      onChanged();;
      if (data_ == null) {
        data_ = com.google.protobuf.MapField.newMapField(
            DataDefaultEntryHolder.defaultEntry);
      }
      if (!data_.isMutable()) {
        data_ = data_.copy();
      }
      return data_;
    }

    public int getDataCount() {
      return internalGetData().getMap().size();
    }
    /**
     * <code>map&lt;string, int64&gt; data = 1;</code>
     */

    @java.lang.Override
    public boolean containsData(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetData().getMap().containsKey(key);
    }
    /**
     * Use {@link #getDataMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getData() {
      return getDataMap();
    }
    /**
     * <code>map&lt;string, int64&gt; data = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.Long> getDataMap() {
      return internalGetData().getMap();
    }
    /**
     * <code>map&lt;string, int64&gt; data = 1;</code>
     */
    @java.lang.Override

    public long getDataOrDefault(
        java.lang.String key,
        long defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetData().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, int64&gt; data = 1;</code>
     */
    @java.lang.Override

    public long getDataOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetData().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearData() {
      internalGetMutableData().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, int64&gt; data = 1;</code>
     */

    public Builder removeData(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableData().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long>
    getMutableData() {
      return internalGetMutableData().getMutableMap();
    }
    /**
     * <code>map&lt;string, int64&gt; data = 1;</code>
     */
    public Builder putData(
        java.lang.String key,
        long value) {
      if (key == null) { throw new NullPointerException("map key"); }
      
      internalGetMutableData().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, int64&gt; data = 1;</code>
     */

    public Builder putAllData(
        java.util.Map<java.lang.String, java.lang.Long> values) {
      internalGetMutableData().getMutableMap()
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


    // @@protoc_insertion_point(builder_scope:ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap)
  }

  // @@protoc_insertion_point(class_scope:ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap)
  private static final ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap();
  }

  public static ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimeBasedMetricMap>
      PARSER = new com.google.protobuf.AbstractParser<TimeBasedMetricMap>() {
    @java.lang.Override
    public TimeBasedMetricMap parsePartialFrom(
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

  public static com.google.protobuf.Parser<TimeBasedMetricMap> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimeBasedMetricMap> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ru.develonica.load.testing.common.model.generated.TimeBasedMetricMap getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

