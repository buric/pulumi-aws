// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.OriginRequestPolicyQueryStringsConfigQueryStrings;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OriginRequestPolicyQueryStringsConfig {
    private final String queryStringBehavior;
    private final @Nullable OriginRequestPolicyQueryStringsConfigQueryStrings queryStrings;

    @CustomType.Constructor
    private OriginRequestPolicyQueryStringsConfig(
        @CustomType.Parameter("queryStringBehavior") String queryStringBehavior,
        @CustomType.Parameter("queryStrings") @Nullable OriginRequestPolicyQueryStringsConfigQueryStrings queryStrings) {
        this.queryStringBehavior = queryStringBehavior;
        this.queryStrings = queryStrings;
    }

    public String queryStringBehavior() {
        return this.queryStringBehavior;
    }
    public Optional<OriginRequestPolicyQueryStringsConfigQueryStrings> queryStrings() {
        return Optional.ofNullable(this.queryStrings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginRequestPolicyQueryStringsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String queryStringBehavior;
        private @Nullable OriginRequestPolicyQueryStringsConfigQueryStrings queryStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginRequestPolicyQueryStringsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryStringBehavior = defaults.queryStringBehavior;
    	      this.queryStrings = defaults.queryStrings;
        }

        public Builder queryStringBehavior(String queryStringBehavior) {
            this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
            return this;
        }
        public Builder queryStrings(@Nullable OriginRequestPolicyQueryStringsConfigQueryStrings queryStrings) {
            this.queryStrings = queryStrings;
            return this;
        }        public OriginRequestPolicyQueryStringsConfig build() {
            return new OriginRequestPolicyQueryStringsConfig(queryStringBehavior, queryStrings);
        }
    }
}
