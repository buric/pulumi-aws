// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequest;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycode {
    /**
     * @return The credentials used to access protected Zendesk resources.
     * 
     */
    private final @Nullable String accessToken;
    /**
     * @return The OAuth requirement needed to request security tokens from the connector endpoint. See OAuth Request for more details.
     * 
     */
    private final @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequest oauthRequest;
    /**
     * @return The refresh token used to refresh expired access token.
     * 
     */
    private final @Nullable String refreshToken;

    @CustomType.Constructor
    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycode(
        @CustomType.Parameter("accessToken") @Nullable String accessToken,
        @CustomType.Parameter("oauthRequest") @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequest oauthRequest,
        @CustomType.Parameter("refreshToken") @Nullable String refreshToken) {
        this.accessToken = accessToken;
        this.oauthRequest = oauthRequest;
        this.refreshToken = refreshToken;
    }

    /**
     * @return The credentials used to access protected Zendesk resources.
     * 
     */
    public Optional<String> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * @return The OAuth requirement needed to request security tokens from the connector endpoint. See OAuth Request for more details.
     * 
     */
    public Optional<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequest> oauthRequest() {
        return Optional.ofNullable(this.oauthRequest);
    }
    /**
     * @return The refresh token used to refresh expired access token.
     * 
     */
    public Optional<String> refreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessToken;
        private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequest oauthRequest;
        private @Nullable String refreshToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.oauthRequest = defaults.oauthRequest;
    	      this.refreshToken = defaults.refreshToken;
        }

        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder oauthRequest(@Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequest oauthRequest) {
            this.oauthRequest = oauthRequest;
            return this;
        }
        public Builder refreshToken(@Nullable String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycode build() {
            return new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycode(accessToken, oauthRequest, refreshToken);
        }
    }
}
