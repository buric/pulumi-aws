// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentials;
import com.pulumi.aws.appflow.outputs.ConnectorProfileConnectorProfileConfigConnectorProfileProperties;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ConnectorProfileConnectorProfileConfig {
    /**
     * @return The connector-specific credentials required by each connector. See Connector Profile Credentials for more details.
     * 
     */
    private final ConnectorProfileConnectorProfileConfigConnectorProfileCredentials connectorProfileCredentials;
    /**
     * @return The connector-specific properties of the profile configuration. See Connector Profile Properties for more details.
     * 
     */
    private final ConnectorProfileConnectorProfileConfigConnectorProfileProperties connectorProfileProperties;

    @CustomType.Constructor
    private ConnectorProfileConnectorProfileConfig(
        @CustomType.Parameter("connectorProfileCredentials") ConnectorProfileConnectorProfileConfigConnectorProfileCredentials connectorProfileCredentials,
        @CustomType.Parameter("connectorProfileProperties") ConnectorProfileConnectorProfileConfigConnectorProfileProperties connectorProfileProperties) {
        this.connectorProfileCredentials = connectorProfileCredentials;
        this.connectorProfileProperties = connectorProfileProperties;
    }

    /**
     * @return The connector-specific credentials required by each connector. See Connector Profile Credentials for more details.
     * 
     */
    public ConnectorProfileConnectorProfileConfigConnectorProfileCredentials connectorProfileCredentials() {
        return this.connectorProfileCredentials;
    }
    /**
     * @return The connector-specific properties of the profile configuration. See Connector Profile Properties for more details.
     * 
     */
    public ConnectorProfileConnectorProfileConfigConnectorProfileProperties connectorProfileProperties() {
        return this.connectorProfileProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileConnectorProfileConfigConnectorProfileCredentials connectorProfileCredentials;
        private ConnectorProfileConnectorProfileConfigConnectorProfileProperties connectorProfileProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileConnectorProfileConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorProfileCredentials = defaults.connectorProfileCredentials;
    	      this.connectorProfileProperties = defaults.connectorProfileProperties;
        }

        public Builder connectorProfileCredentials(ConnectorProfileConnectorProfileConfigConnectorProfileCredentials connectorProfileCredentials) {
            this.connectorProfileCredentials = Objects.requireNonNull(connectorProfileCredentials);
            return this;
        }
        public Builder connectorProfileProperties(ConnectorProfileConnectorProfileConfigConnectorProfileProperties connectorProfileProperties) {
            this.connectorProfileProperties = Objects.requireNonNull(connectorProfileProperties);
            return this;
        }        public ConnectorProfileConnectorProfileConfig build() {
            return new ConnectorProfileConnectorProfileConfig(connectorProfileCredentials, connectorProfileProperties);
        }
    }
}
