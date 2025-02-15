// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.resourcegroupstaggingapi.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetResourcesTagFilter {
    /**
     * @return One part of a key-value pair that makes up a tag.
     * 
     */
    private final String key;
    /**
     * @return The optional part of a key-value pair that make up a tag.
     * 
     */
    private final @Nullable List<String> values;

    @CustomType.Constructor
    private GetResourcesTagFilter(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("values") @Nullable List<String> values) {
        this.key = key;
        this.values = values;
    }

    /**
     * @return One part of a key-value pair that makes up a tag.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The optional part of a key-value pair that make up a tag.
     * 
     */
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcesTagFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcesTagFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetResourcesTagFilter build() {
            return new GetResourcesTagFilter(key, values);
        }
    }
}
