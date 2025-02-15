// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointMongodbSettings {
    /**
     * @return Authentication mechanism to access the MongoDB source endpoint. Default is `default`.
     * 
     */
    private final @Nullable String authMechanism;
    /**
     * @return Authentication database name. Not used when `auth_type` is `no`. Default is `admin`.
     * 
     */
    private final @Nullable String authSource;
    /**
     * @return Authentication type to access the MongoDB source endpoint. Default is `password`.
     * 
     */
    private final @Nullable String authType;
    /**
     * @return Number of documents to preview to determine the document organization. Use this setting when `nesting_level` is set to `one`. Default is `1000`.
     * 
     */
    private final @Nullable String docsToInvestigate;
    /**
     * @return Document ID. Use this setting when `nesting_level` is set to `none`. Default is `false`.
     * 
     */
    private final @Nullable String extractDocId;
    /**
     * @return Specifies either document or table mode. Default is `none`. Valid values are `one` (table mode) and `none` (document mode).
     * 
     */
    private final @Nullable String nestingLevel;

    @CustomType.Constructor
    private EndpointMongodbSettings(
        @CustomType.Parameter("authMechanism") @Nullable String authMechanism,
        @CustomType.Parameter("authSource") @Nullable String authSource,
        @CustomType.Parameter("authType") @Nullable String authType,
        @CustomType.Parameter("docsToInvestigate") @Nullable String docsToInvestigate,
        @CustomType.Parameter("extractDocId") @Nullable String extractDocId,
        @CustomType.Parameter("nestingLevel") @Nullable String nestingLevel) {
        this.authMechanism = authMechanism;
        this.authSource = authSource;
        this.authType = authType;
        this.docsToInvestigate = docsToInvestigate;
        this.extractDocId = extractDocId;
        this.nestingLevel = nestingLevel;
    }

    /**
     * @return Authentication mechanism to access the MongoDB source endpoint. Default is `default`.
     * 
     */
    public Optional<String> authMechanism() {
        return Optional.ofNullable(this.authMechanism);
    }
    /**
     * @return Authentication database name. Not used when `auth_type` is `no`. Default is `admin`.
     * 
     */
    public Optional<String> authSource() {
        return Optional.ofNullable(this.authSource);
    }
    /**
     * @return Authentication type to access the MongoDB source endpoint. Default is `password`.
     * 
     */
    public Optional<String> authType() {
        return Optional.ofNullable(this.authType);
    }
    /**
     * @return Number of documents to preview to determine the document organization. Use this setting when `nesting_level` is set to `one`. Default is `1000`.
     * 
     */
    public Optional<String> docsToInvestigate() {
        return Optional.ofNullable(this.docsToInvestigate);
    }
    /**
     * @return Document ID. Use this setting when `nesting_level` is set to `none`. Default is `false`.
     * 
     */
    public Optional<String> extractDocId() {
        return Optional.ofNullable(this.extractDocId);
    }
    /**
     * @return Specifies either document or table mode. Default is `none`. Valid values are `one` (table mode) and `none` (document mode).
     * 
     */
    public Optional<String> nestingLevel() {
        return Optional.ofNullable(this.nestingLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointMongodbSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authMechanism;
        private @Nullable String authSource;
        private @Nullable String authType;
        private @Nullable String docsToInvestigate;
        private @Nullable String extractDocId;
        private @Nullable String nestingLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointMongodbSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authMechanism = defaults.authMechanism;
    	      this.authSource = defaults.authSource;
    	      this.authType = defaults.authType;
    	      this.docsToInvestigate = defaults.docsToInvestigate;
    	      this.extractDocId = defaults.extractDocId;
    	      this.nestingLevel = defaults.nestingLevel;
        }

        public Builder authMechanism(@Nullable String authMechanism) {
            this.authMechanism = authMechanism;
            return this;
        }
        public Builder authSource(@Nullable String authSource) {
            this.authSource = authSource;
            return this;
        }
        public Builder authType(@Nullable String authType) {
            this.authType = authType;
            return this;
        }
        public Builder docsToInvestigate(@Nullable String docsToInvestigate) {
            this.docsToInvestigate = docsToInvestigate;
            return this;
        }
        public Builder extractDocId(@Nullable String extractDocId) {
            this.extractDocId = extractDocId;
            return this;
        }
        public Builder nestingLevel(@Nullable String nestingLevel) {
            this.nestingLevel = nestingLevel;
            return this;
        }        public EndpointMongodbSettings build() {
            return new EndpointMongodbSettings(authMechanism, authSource, authType, docsToInvestigate, extractDocId, nestingLevel);
        }
    }
}
