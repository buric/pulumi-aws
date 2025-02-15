// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceHttpConfigAuthorizationConfigAwsIamConfig {
    /**
     * @return The signing Amazon Web Services Region for IAM authorization.
     * 
     */
    private final @Nullable String signingRegion;
    /**
     * @return The signing service name for IAM authorization.
     * 
     */
    private final @Nullable String signingServiceName;

    @CustomType.Constructor
    private DataSourceHttpConfigAuthorizationConfigAwsIamConfig(
        @CustomType.Parameter("signingRegion") @Nullable String signingRegion,
        @CustomType.Parameter("signingServiceName") @Nullable String signingServiceName) {
        this.signingRegion = signingRegion;
        this.signingServiceName = signingServiceName;
    }

    /**
     * @return The signing Amazon Web Services Region for IAM authorization.
     * 
     */
    public Optional<String> signingRegion() {
        return Optional.ofNullable(this.signingRegion);
    }
    /**
     * @return The signing service name for IAM authorization.
     * 
     */
    public Optional<String> signingServiceName() {
        return Optional.ofNullable(this.signingServiceName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceHttpConfigAuthorizationConfigAwsIamConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String signingRegion;
        private @Nullable String signingServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceHttpConfigAuthorizationConfigAwsIamConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.signingRegion = defaults.signingRegion;
    	      this.signingServiceName = defaults.signingServiceName;
        }

        public Builder signingRegion(@Nullable String signingRegion) {
            this.signingRegion = signingRegion;
            return this;
        }
        public Builder signingServiceName(@Nullable String signingServiceName) {
            this.signingServiceName = signingServiceName;
            return this;
        }        public DataSourceHttpConfigAuthorizationConfigAwsIamConfig build() {
            return new DataSourceHttpConfigAuthorizationConfigAwsIamConfig(signingRegion, signingServiceName);
        }
    }
}
