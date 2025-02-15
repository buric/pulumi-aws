// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigIncrementalPullConfig;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigSourceConnectorProperties;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowSourceFlowConfig {
    /**
     * @return The API version that the destination connector uses.
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * @return The name of the connector profile. This name must be unique for each connector profile in the AWS account.
     * 
     */
    private final @Nullable String connectorProfileName;
    /**
     * @return The type of connector, such as Salesforce, Amplitude, and so on. Valid values are `Salesforce`, `Singular`, `Slack`, `Redshift`, `S3`, `Marketo`, `Googleanalytics`, `Zendesk`, `Servicenow`, `Datadog`, `Trendmicro`, `Snowflake`, `Dynatrace`, `Infornexus`, `Amplitude`, `Veeva`, `EventBridge`, `LookoutMetrics`, `Upsolver`, `Honeycode`, `CustomerProfiles`, `SAPOData`, and `CustomConnector`.
     * 
     */
    private final String connectorType;
    /**
     * @return Defines the configuration for a scheduled incremental data pull. If a valid configuration is provided, the fields specified in the configuration are used when querying for the incremental data pull. See Incremental Pull Config for more details.
     * 
     */
    private final @Nullable FlowSourceFlowConfigIncrementalPullConfig incrementalPullConfig;
    /**
     * @return Specifies the information that is required to query a particular source connector. See Source Connector Properties for details.
     * 
     */
    private final FlowSourceFlowConfigSourceConnectorProperties sourceConnectorProperties;

    @CustomType.Constructor
    private FlowSourceFlowConfig(
        @CustomType.Parameter("apiVersion") @Nullable String apiVersion,
        @CustomType.Parameter("connectorProfileName") @Nullable String connectorProfileName,
        @CustomType.Parameter("connectorType") String connectorType,
        @CustomType.Parameter("incrementalPullConfig") @Nullable FlowSourceFlowConfigIncrementalPullConfig incrementalPullConfig,
        @CustomType.Parameter("sourceConnectorProperties") FlowSourceFlowConfigSourceConnectorProperties sourceConnectorProperties) {
        this.apiVersion = apiVersion;
        this.connectorProfileName = connectorProfileName;
        this.connectorType = connectorType;
        this.incrementalPullConfig = incrementalPullConfig;
        this.sourceConnectorProperties = sourceConnectorProperties;
    }

    /**
     * @return The API version that the destination connector uses.
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return The name of the connector profile. This name must be unique for each connector profile in the AWS account.
     * 
     */
    public Optional<String> connectorProfileName() {
        return Optional.ofNullable(this.connectorProfileName);
    }
    /**
     * @return The type of connector, such as Salesforce, Amplitude, and so on. Valid values are `Salesforce`, `Singular`, `Slack`, `Redshift`, `S3`, `Marketo`, `Googleanalytics`, `Zendesk`, `Servicenow`, `Datadog`, `Trendmicro`, `Snowflake`, `Dynatrace`, `Infornexus`, `Amplitude`, `Veeva`, `EventBridge`, `LookoutMetrics`, `Upsolver`, `Honeycode`, `CustomerProfiles`, `SAPOData`, and `CustomConnector`.
     * 
     */
    public String connectorType() {
        return this.connectorType;
    }
    /**
     * @return Defines the configuration for a scheduled incremental data pull. If a valid configuration is provided, the fields specified in the configuration are used when querying for the incremental data pull. See Incremental Pull Config for more details.
     * 
     */
    public Optional<FlowSourceFlowConfigIncrementalPullConfig> incrementalPullConfig() {
        return Optional.ofNullable(this.incrementalPullConfig);
    }
    /**
     * @return Specifies the information that is required to query a particular source connector. See Source Connector Properties for details.
     * 
     */
    public FlowSourceFlowConfigSourceConnectorProperties sourceConnectorProperties() {
        return this.sourceConnectorProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSourceFlowConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String connectorProfileName;
        private String connectorType;
        private @Nullable FlowSourceFlowConfigIncrementalPullConfig incrementalPullConfig;
        private FlowSourceFlowConfigSourceConnectorProperties sourceConnectorProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSourceFlowConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.connectorProfileName = defaults.connectorProfileName;
    	      this.connectorType = defaults.connectorType;
    	      this.incrementalPullConfig = defaults.incrementalPullConfig;
    	      this.sourceConnectorProperties = defaults.sourceConnectorProperties;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder connectorProfileName(@Nullable String connectorProfileName) {
            this.connectorProfileName = connectorProfileName;
            return this;
        }
        public Builder connectorType(String connectorType) {
            this.connectorType = Objects.requireNonNull(connectorType);
            return this;
        }
        public Builder incrementalPullConfig(@Nullable FlowSourceFlowConfigIncrementalPullConfig incrementalPullConfig) {
            this.incrementalPullConfig = incrementalPullConfig;
            return this;
        }
        public Builder sourceConnectorProperties(FlowSourceFlowConfigSourceConnectorProperties sourceConnectorProperties) {
            this.sourceConnectorProperties = Objects.requireNonNull(sourceConnectorProperties);
            return this;
        }        public FlowSourceFlowConfig build() {
            return new FlowSourceFlowConfig(apiVersion, connectorProfileName, connectorType, incrementalPullConfig, sourceConnectorProperties);
        }
    }
}
