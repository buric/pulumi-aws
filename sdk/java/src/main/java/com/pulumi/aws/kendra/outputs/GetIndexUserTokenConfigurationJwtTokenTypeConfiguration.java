// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIndexUserTokenConfigurationJwtTokenTypeConfiguration {
    /**
     * @return The regular expression that identifies the claim.
     * 
     */
    private final String claimRegex;
    /**
     * @return The group attribute field.
     * 
     */
    private final String groupAttributeField;
    /**
     * @return The issuer of the token.
     * 
     */
    private final String issuer;
    /**
     * @return The location of the key. Valid values are `URL` or `SECRET_MANAGER`
     * 
     */
    private final String keyLocation;
    /**
     * @return The Amazon Resource Name (ARN) of the secret.
     * 
     */
    private final String secretsManagerArn;
    /**
     * @return The signing key URL.
     * 
     */
    private final String url;
    /**
     * @return The user name attribute field.
     * 
     */
    private final String userNameAttributeField;

    @CustomType.Constructor
    private GetIndexUserTokenConfigurationJwtTokenTypeConfiguration(
        @CustomType.Parameter("claimRegex") String claimRegex,
        @CustomType.Parameter("groupAttributeField") String groupAttributeField,
        @CustomType.Parameter("issuer") String issuer,
        @CustomType.Parameter("keyLocation") String keyLocation,
        @CustomType.Parameter("secretsManagerArn") String secretsManagerArn,
        @CustomType.Parameter("url") String url,
        @CustomType.Parameter("userNameAttributeField") String userNameAttributeField) {
        this.claimRegex = claimRegex;
        this.groupAttributeField = groupAttributeField;
        this.issuer = issuer;
        this.keyLocation = keyLocation;
        this.secretsManagerArn = secretsManagerArn;
        this.url = url;
        this.userNameAttributeField = userNameAttributeField;
    }

    /**
     * @return The regular expression that identifies the claim.
     * 
     */
    public String claimRegex() {
        return this.claimRegex;
    }
    /**
     * @return The group attribute field.
     * 
     */
    public String groupAttributeField() {
        return this.groupAttributeField;
    }
    /**
     * @return The issuer of the token.
     * 
     */
    public String issuer() {
        return this.issuer;
    }
    /**
     * @return The location of the key. Valid values are `URL` or `SECRET_MANAGER`
     * 
     */
    public String keyLocation() {
        return this.keyLocation;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the secret.
     * 
     */
    public String secretsManagerArn() {
        return this.secretsManagerArn;
    }
    /**
     * @return The signing key URL.
     * 
     */
    public String url() {
        return this.url;
    }
    /**
     * @return The user name attribute field.
     * 
     */
    public String userNameAttributeField() {
        return this.userNameAttributeField;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIndexUserTokenConfigurationJwtTokenTypeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String claimRegex;
        private String groupAttributeField;
        private String issuer;
        private String keyLocation;
        private String secretsManagerArn;
        private String url;
        private String userNameAttributeField;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIndexUserTokenConfigurationJwtTokenTypeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claimRegex = defaults.claimRegex;
    	      this.groupAttributeField = defaults.groupAttributeField;
    	      this.issuer = defaults.issuer;
    	      this.keyLocation = defaults.keyLocation;
    	      this.secretsManagerArn = defaults.secretsManagerArn;
    	      this.url = defaults.url;
    	      this.userNameAttributeField = defaults.userNameAttributeField;
        }

        public Builder claimRegex(String claimRegex) {
            this.claimRegex = Objects.requireNonNull(claimRegex);
            return this;
        }
        public Builder groupAttributeField(String groupAttributeField) {
            this.groupAttributeField = Objects.requireNonNull(groupAttributeField);
            return this;
        }
        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public Builder keyLocation(String keyLocation) {
            this.keyLocation = Objects.requireNonNull(keyLocation);
            return this;
        }
        public Builder secretsManagerArn(String secretsManagerArn) {
            this.secretsManagerArn = Objects.requireNonNull(secretsManagerArn);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder userNameAttributeField(String userNameAttributeField) {
            this.userNameAttributeField = Objects.requireNonNull(userNameAttributeField);
            return this;
        }        public GetIndexUserTokenConfigurationJwtTokenTypeConfiguration build() {
            return new GetIndexUserTokenConfigurationJwtTokenTypeConfiguration(claimRegex, groupAttributeField, issuer, keyLocation, secretsManagerArn, url, userNameAttributeField);
        }
    }
}
