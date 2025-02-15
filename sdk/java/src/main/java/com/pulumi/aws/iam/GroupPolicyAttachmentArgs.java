// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GroupPolicyAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupPolicyAttachmentArgs Empty = new GroupPolicyAttachmentArgs();

    /**
     * The group the policy should be applied to
     * 
     */
    @Import(name="group", required=true)
    private Output<String> group;

    /**
     * @return The group the policy should be applied to
     * 
     */
    public Output<String> group() {
        return this.group;
    }

    /**
     * The ARN of the policy you want to apply
     * 
     */
    @Import(name="policyArn", required=true)
    private Output<String> policyArn;

    /**
     * @return The ARN of the policy you want to apply
     * 
     */
    public Output<String> policyArn() {
        return this.policyArn;
    }

    private GroupPolicyAttachmentArgs() {}

    private GroupPolicyAttachmentArgs(GroupPolicyAttachmentArgs $) {
        this.group = $.group;
        this.policyArn = $.policyArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupPolicyAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupPolicyAttachmentArgs $;

        public Builder() {
            $ = new GroupPolicyAttachmentArgs();
        }

        public Builder(GroupPolicyAttachmentArgs defaults) {
            $ = new GroupPolicyAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param group The group the policy should be applied to
         * 
         * @return builder
         * 
         */
        public Builder group(Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group The group the policy should be applied to
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param policyArn The ARN of the policy you want to apply
         * 
         * @return builder
         * 
         */
        public Builder policyArn(Output<String> policyArn) {
            $.policyArn = policyArn;
            return this;
        }

        /**
         * @param policyArn The ARN of the policy you want to apply
         * 
         * @return builder
         * 
         */
        public Builder policyArn(String policyArn) {
            return policyArn(Output.of(policyArn));
        }

        public GroupPolicyAttachmentArgs build() {
            $.group = Objects.requireNonNull($.group, "expected parameter 'group' to be non-null");
            $.policyArn = Objects.requireNonNull($.policyArn, "expected parameter 'policyArn' to be non-null");
            return $;
        }
    }

}
