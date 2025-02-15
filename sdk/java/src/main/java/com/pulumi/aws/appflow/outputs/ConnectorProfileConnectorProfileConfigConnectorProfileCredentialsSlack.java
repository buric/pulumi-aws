// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackOauthRequest;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlack {
    /**
     * @return The credentials used to access protected Zendesk resources.
     * 
     */
    private final @Nullable String accessToken;
    /**
     * @return The identifier for the desired client.
     * 
     */
    private final String clientId;
    /**
     * @return The client secret used by the OAuth client to authenticate to the authorization server.
     * 
     */
    private final String clientSecret;
    /**
     * @return The OAuth requirement needed to request security tokens from the connector endpoint. See OAuth Request for more details.
     * 
     */
    private final @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackOauthRequest oauthRequest;

    @CustomType.Constructor
    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlack(
        @CustomType.Parameter("accessToken") @Nullable String accessToken,
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("clientSecret") String clientSecret,
        @CustomType.Parameter("oauthRequest") @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackOauthRequest oauthRequest) {
        this.accessToken = accessToken;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.oauthRequest = oauthRequest;
    }

    /**
     * @return The credentials used to access protected Zendesk resources.
     * 
     */
    public Optional<String> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * @return The identifier for the desired client.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The client secret used by the OAuth client to authenticate to the authorization server.
     * 
     */
    public String clientSecret() {
        return this.clientSecret;
    }
    /**
     * @return The OAuth requirement needed to request security tokens from the connector endpoint. See OAuth Request for more details.
     * 
     */
    public Optional<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackOauthRequest> oauthRequest() {
        return Optional.ofNullable(this.oauthRequest);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlack defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessToken;
        private String clientId;
        private String clientSecret;
        private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackOauthRequest oauthRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlack defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.oauthRequest = defaults.oauthRequest;
        }

        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        public Builder oauthRequest(@Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlackOauthRequest oauthRequest) {
            this.oauthRequest = oauthRequest;
            return this;
        }        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlack build() {
            return new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSlack(accessToken, clientId, clientSecret, oauthRequest);
        }
    }
}
