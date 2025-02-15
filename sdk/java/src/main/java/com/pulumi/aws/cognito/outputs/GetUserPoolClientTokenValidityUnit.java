// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUserPoolClientTokenValidityUnit {
    /**
     * @return (Optional) Time unit in for the value in `access_token_validity`, defaults to `hours`.
     * 
     */
    private final String accessToken;
    /**
     * @return (Optional) Time unit in for the value in `id_token_validity`, defaults to `hours`.
     * 
     */
    private final String idToken;
    /**
     * @return (Optional) Time unit in for the value in `refresh_token_validity`, defaults to `days`.
     * 
     */
    private final String refreshToken;

    @CustomType.Constructor
    private GetUserPoolClientTokenValidityUnit(
        @CustomType.Parameter("accessToken") String accessToken,
        @CustomType.Parameter("idToken") String idToken,
        @CustomType.Parameter("refreshToken") String refreshToken) {
        this.accessToken = accessToken;
        this.idToken = idToken;
        this.refreshToken = refreshToken;
    }

    /**
     * @return (Optional) Time unit in for the value in `access_token_validity`, defaults to `hours`.
     * 
     */
    public String accessToken() {
        return this.accessToken;
    }
    /**
     * @return (Optional) Time unit in for the value in `id_token_validity`, defaults to `hours`.
     * 
     */
    public String idToken() {
        return this.idToken;
    }
    /**
     * @return (Optional) Time unit in for the value in `refresh_token_validity`, defaults to `days`.
     * 
     */
    public String refreshToken() {
        return this.refreshToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserPoolClientTokenValidityUnit defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessToken;
        private String idToken;
        private String refreshToken;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserPoolClientTokenValidityUnit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.idToken = defaults.idToken;
    	      this.refreshToken = defaults.refreshToken;
        }

        public Builder accessToken(String accessToken) {
            this.accessToken = Objects.requireNonNull(accessToken);
            return this;
        }
        public Builder idToken(String idToken) {
            this.idToken = Objects.requireNonNull(idToken);
            return this;
        }
        public Builder refreshToken(String refreshToken) {
            this.refreshToken = Objects.requireNonNull(refreshToken);
            return this;
        }        public GetUserPoolClientTokenValidityUnit build() {
            return new GetUserPoolClientTokenValidityUnit(accessToken, idToken, refreshToken);
        }
    }
}
