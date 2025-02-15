// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PolicyAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyAttachmentArgs Empty = new PolicyAttachmentArgs();

    /**
     * The unique identifier (ID) of the policy that you want to attach to the target.
     * 
     */
    @Import(name="policyId", required=true)
    private Output<String> policyId;

    /**
     * @return The unique identifier (ID) of the policy that you want to attach to the target.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }

    /**
     * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
     * 
     */
    @Import(name="targetId", required=true)
    private Output<String> targetId;

    /**
     * @return The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
     * 
     */
    public Output<String> targetId() {
        return this.targetId;
    }

    private PolicyAttachmentArgs() {}

    private PolicyAttachmentArgs(PolicyAttachmentArgs $) {
        this.policyId = $.policyId;
        this.targetId = $.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyAttachmentArgs $;

        public Builder() {
            $ = new PolicyAttachmentArgs();
        }

        public Builder(PolicyAttachmentArgs defaults) {
            $ = new PolicyAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyId The unique identifier (ID) of the policy that you want to attach to the target.
         * 
         * @return builder
         * 
         */
        public Builder policyId(Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The unique identifier (ID) of the policy that you want to attach to the target.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        /**
         * @param targetId The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
         * 
         * @return builder
         * 
         */
        public Builder targetId(Output<String> targetId) {
            $.targetId = targetId;
            return this;
        }

        /**
         * @param targetId The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
         * 
         * @return builder
         * 
         */
        public Builder targetId(String targetId) {
            return targetId(Output.of(targetId));
        }

        public PolicyAttachmentArgs build() {
            $.policyId = Objects.requireNonNull($.policyId, "expected parameter 'policyId' to be non-null");
            $.targetId = Objects.requireNonNull($.targetId, "expected parameter 'targetId' to be non-null");
            return $;
        }
    }

}
