// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPermissionsLfTagPolicyExpression {
    /**
     * @return The key-name of an LF-Tag.
     * 
     */
    private final String key;
    /**
     * @return A list of possible values of an LF-Tag.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private GetPermissionsLfTagPolicyExpression(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("values") List<String> values) {
        this.key = key;
        this.values = values;
    }

    /**
     * @return The key-name of an LF-Tag.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return A list of possible values of an LF-Tag.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionsLfTagPolicyExpression defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPermissionsLfTagPolicyExpression defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetPermissionsLfTagPolicyExpression build() {
            return new GetPermissionsLfTagPolicyExpression(key, values);
        }
    }
}
