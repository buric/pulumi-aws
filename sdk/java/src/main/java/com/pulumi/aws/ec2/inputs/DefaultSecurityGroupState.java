// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.DefaultSecurityGroupEgressArgs;
import com.pulumi.aws.ec2.inputs.DefaultSecurityGroupIngressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultSecurityGroupState extends com.pulumi.resources.ResourceArgs {

    public static final DefaultSecurityGroupState Empty = new DefaultSecurityGroupState();

    /**
     * ARN of the security group.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN of the security group.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Description of this rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of this rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="egress")
    private @Nullable Output<List<DefaultSecurityGroupEgressArgs>> egress;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Optional<Output<List<DefaultSecurityGroupEgressArgs>>> egress() {
        return Optional.ofNullable(this.egress);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="ingress")
    private @Nullable Output<List<DefaultSecurityGroupIngressArgs>> ingress;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Optional<Output<List<DefaultSecurityGroupIngressArgs>>> ingress() {
        return Optional.ofNullable(this.ingress);
    }

    /**
     * Name of the security group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the security group.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Owner ID.
     * 
     */
    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    /**
     * @return Owner ID.
     * 
     */
    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    @Import(name="revokeRulesOnDelete")
    private @Nullable Output<Boolean> revokeRulesOnDelete;

    public Optional<Output<Boolean>> revokeRulesOnDelete() {
        return Optional.ofNullable(this.revokeRulesOnDelete);
    }

    /**
     * Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * VPC ID. **Note that changing the `vpc_id` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return VPC ID. **Note that changing the `vpc_id` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private DefaultSecurityGroupState() {}

    private DefaultSecurityGroupState(DefaultSecurityGroupState $) {
        this.arn = $.arn;
        this.description = $.description;
        this.egress = $.egress;
        this.ingress = $.ingress;
        this.name = $.name;
        this.ownerId = $.ownerId;
        this.revokeRulesOnDelete = $.revokeRulesOnDelete;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultSecurityGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultSecurityGroupState $;

        public Builder() {
            $ = new DefaultSecurityGroupState();
        }

        public Builder(DefaultSecurityGroupState defaults) {
            $ = new DefaultSecurityGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of the security group.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN of the security group.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param description Description of this rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of this rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param egress Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder egress(@Nullable Output<List<DefaultSecurityGroupEgressArgs>> egress) {
            $.egress = egress;
            return this;
        }

        /**
         * @param egress Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder egress(List<DefaultSecurityGroupEgressArgs> egress) {
            return egress(Output.of(egress));
        }

        /**
         * @param egress Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder egress(DefaultSecurityGroupEgressArgs... egress) {
            return egress(List.of(egress));
        }

        /**
         * @param ingress Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder ingress(@Nullable Output<List<DefaultSecurityGroupIngressArgs>> ingress) {
            $.ingress = ingress;
            return this;
        }

        /**
         * @param ingress Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder ingress(List<DefaultSecurityGroupIngressArgs> ingress) {
            return ingress(Output.of(ingress));
        }

        /**
         * @param ingress Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder ingress(DefaultSecurityGroupIngressArgs... ingress) {
            return ingress(List.of(ingress));
        }

        /**
         * @param name Name of the security group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the security group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ownerId Owner ID.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        /**
         * @param ownerId Owner ID.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        public Builder revokeRulesOnDelete(@Nullable Output<Boolean> revokeRulesOnDelete) {
            $.revokeRulesOnDelete = revokeRulesOnDelete;
            return this;
        }

        public Builder revokeRulesOnDelete(Boolean revokeRulesOnDelete) {
            return revokeRulesOnDelete(Output.of(revokeRulesOnDelete));
        }

        /**
         * @param tags Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param vpcId VPC ID. **Note that changing the `vpc_id` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId VPC ID. **Note that changing the `vpc_id` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public DefaultSecurityGroupState build() {
            return $;
        }
    }

}
