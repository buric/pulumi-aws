// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigAggregationConfig;
import com.pulumi.aws.appflow.outputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfig {
    /**
     * @return The aggregation settings that you can use to customize the output format of your flow data. See Aggregation Config for more details.
     * 
     */
    private final @Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigAggregationConfig aggregationConfig;
    /**
     * @return Indicates the file type that Amazon AppFlow places in the Upsolver Amazon S3 bucket. Valid values are `CSV`, `JSON`, and `PARQUET`.
     * 
     */
    private final @Nullable String fileType;
    /**
     * @return Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name folders according to the flow frequency and date. See Prefix Config for more details.
     * 
     */
    private final FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfig prefixConfig;

    @CustomType.Constructor
    private FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfig(
        @CustomType.Parameter("aggregationConfig") @Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigAggregationConfig aggregationConfig,
        @CustomType.Parameter("fileType") @Nullable String fileType,
        @CustomType.Parameter("prefixConfig") FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfig prefixConfig) {
        this.aggregationConfig = aggregationConfig;
        this.fileType = fileType;
        this.prefixConfig = prefixConfig;
    }

    /**
     * @return The aggregation settings that you can use to customize the output format of your flow data. See Aggregation Config for more details.
     * 
     */
    public Optional<FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigAggregationConfig> aggregationConfig() {
        return Optional.ofNullable(this.aggregationConfig);
    }
    /**
     * @return Indicates the file type that Amazon AppFlow places in the Upsolver Amazon S3 bucket. Valid values are `CSV`, `JSON`, and `PARQUET`.
     * 
     */
    public Optional<String> fileType() {
        return Optional.ofNullable(this.fileType);
    }
    /**
     * @return Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name folders according to the flow frequency and date. See Prefix Config for more details.
     * 
     */
    public FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfig prefixConfig() {
        return this.prefixConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigAggregationConfig aggregationConfig;
        private @Nullable String fileType;
        private FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfig prefixConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationConfig = defaults.aggregationConfig;
    	      this.fileType = defaults.fileType;
    	      this.prefixConfig = defaults.prefixConfig;
        }

        public Builder aggregationConfig(@Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigAggregationConfig aggregationConfig) {
            this.aggregationConfig = aggregationConfig;
            return this;
        }
        public Builder fileType(@Nullable String fileType) {
            this.fileType = fileType;
            return this;
        }
        public Builder prefixConfig(FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfig prefixConfig) {
            this.prefixConfig = Objects.requireNonNull(prefixConfig);
            return this;
        }        public FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfig build() {
            return new FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfig(aggregationConfig, fileType, prefixConfig);
        }
    }
}
