// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterAndArgs;
import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketReplicationConfigRuleFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleFilterArgs Empty = new BucketReplicationConfigRuleFilterArgs();

    /**
     * A configuration block for specifying rule filters. This element is required only if you specify more than one filter. See and below for more details.
     * 
     */
    @Import(name="and")
    private @Nullable Output<BucketReplicationConfigRuleFilterAndArgs> and;

    /**
     * @return A configuration block for specifying rule filters. This element is required only if you specify more than one filter. See and below for more details.
     * 
     */
    public Optional<Output<BucketReplicationConfigRuleFilterAndArgs>> and() {
        return Optional.ofNullable(this.and);
    }

    /**
     * An object key name prefix that identifies subset of objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return An object key name prefix that identifies subset of objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * A configuration block for specifying a tag key and value documented below.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<BucketReplicationConfigRuleFilterTagArgs> tag;

    /**
     * @return A configuration block for specifying a tag key and value documented below.
     * 
     */
    public Optional<Output<BucketReplicationConfigRuleFilterTagArgs>> tag() {
        return Optional.ofNullable(this.tag);
    }

    private BucketReplicationConfigRuleFilterArgs() {}

    private BucketReplicationConfigRuleFilterArgs(BucketReplicationConfigRuleFilterArgs $) {
        this.and = $.and;
        this.prefix = $.prefix;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationConfigRuleFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationConfigRuleFilterArgs $;

        public Builder() {
            $ = new BucketReplicationConfigRuleFilterArgs();
        }

        public Builder(BucketReplicationConfigRuleFilterArgs defaults) {
            $ = new BucketReplicationConfigRuleFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param and A configuration block for specifying rule filters. This element is required only if you specify more than one filter. See and below for more details.
         * 
         * @return builder
         * 
         */
        public Builder and(@Nullable Output<BucketReplicationConfigRuleFilterAndArgs> and) {
            $.and = and;
            return this;
        }

        /**
         * @param and A configuration block for specifying rule filters. This element is required only if you specify more than one filter. See and below for more details.
         * 
         * @return builder
         * 
         */
        public Builder and(BucketReplicationConfigRuleFilterAndArgs and) {
            return and(Output.of(and));
        }

        /**
         * @param prefix An object key name prefix that identifies subset of objects to which the rule applies. Must be less than or equal to 1024 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix An object key name prefix that identifies subset of objects to which the rule applies. Must be less than or equal to 1024 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param tag A configuration block for specifying a tag key and value documented below.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<BucketReplicationConfigRuleFilterTagArgs> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag A configuration block for specifying a tag key and value documented below.
         * 
         * @return builder
         * 
         */
        public Builder tag(BucketReplicationConfigRuleFilterTagArgs tag) {
            return tag(Output.of(tag));
        }

        public BucketReplicationConfigRuleFilterArgs build() {
            return $;
        }
    }

}
