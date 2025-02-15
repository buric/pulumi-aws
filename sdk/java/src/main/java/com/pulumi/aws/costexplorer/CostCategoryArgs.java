// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer;

import com.pulumi.aws.costexplorer.inputs.CostCategoryRuleArgs;
import com.pulumi.aws.costexplorer.inputs.CostCategorySplitChargeRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CostCategoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final CostCategoryArgs Empty = new CostCategoryArgs();

    /**
     * Default value for the cost category.
     * 
     */
    @Import(name="defaultValue")
    private @Nullable Output<String> defaultValue;

    /**
     * @return Default value for the cost category.
     * 
     */
    public Optional<Output<String>> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    /**
     * Unique name for the Cost Category.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique name for the Cost Category.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Rule schema version in this particular Cost Category.
     * 
     */
    @Import(name="ruleVersion", required=true)
    private Output<String> ruleVersion;

    /**
     * @return Rule schema version in this particular Cost Category.
     * 
     */
    public Output<String> ruleVersion() {
        return this.ruleVersion;
    }

    /**
     * Configuration block for the `Expression` object used to categorize costs. See below.
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<CostCategoryRuleArgs>> rules;

    /**
     * @return Configuration block for the `Expression` object used to categorize costs. See below.
     * 
     */
    public Output<List<CostCategoryRuleArgs>> rules() {
        return this.rules;
    }

    /**
     * Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
     * 
     */
    @Import(name="splitChargeRules")
    private @Nullable Output<List<CostCategorySplitChargeRuleArgs>> splitChargeRules;

    /**
     * @return Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
     * 
     */
    public Optional<Output<List<CostCategorySplitChargeRuleArgs>>> splitChargeRules() {
        return Optional.ofNullable(this.splitChargeRules);
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private CostCategoryArgs() {}

    private CostCategoryArgs(CostCategoryArgs $) {
        this.defaultValue = $.defaultValue;
        this.name = $.name;
        this.ruleVersion = $.ruleVersion;
        this.rules = $.rules;
        this.splitChargeRules = $.splitChargeRules;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CostCategoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CostCategoryArgs $;

        public Builder() {
            $ = new CostCategoryArgs();
        }

        public Builder(CostCategoryArgs defaults) {
            $ = new CostCategoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultValue Default value for the cost category.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(@Nullable Output<String> defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        /**
         * @param defaultValue Default value for the cost category.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(String defaultValue) {
            return defaultValue(Output.of(defaultValue));
        }

        /**
         * @param name Unique name for the Cost Category.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique name for the Cost Category.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ruleVersion Rule schema version in this particular Cost Category.
         * 
         * @return builder
         * 
         */
        public Builder ruleVersion(Output<String> ruleVersion) {
            $.ruleVersion = ruleVersion;
            return this;
        }

        /**
         * @param ruleVersion Rule schema version in this particular Cost Category.
         * 
         * @return builder
         * 
         */
        public Builder ruleVersion(String ruleVersion) {
            return ruleVersion(Output.of(ruleVersion));
        }

        /**
         * @param rules Configuration block for the `Expression` object used to categorize costs. See below.
         * 
         * @return builder
         * 
         */
        public Builder rules(Output<List<CostCategoryRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Configuration block for the `Expression` object used to categorize costs. See below.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<CostCategoryRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules Configuration block for the `Expression` object used to categorize costs. See below.
         * 
         * @return builder
         * 
         */
        public Builder rules(CostCategoryRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param splitChargeRules Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
         * 
         * @return builder
         * 
         */
        public Builder splitChargeRules(@Nullable Output<List<CostCategorySplitChargeRuleArgs>> splitChargeRules) {
            $.splitChargeRules = splitChargeRules;
            return this;
        }

        /**
         * @param splitChargeRules Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
         * 
         * @return builder
         * 
         */
        public Builder splitChargeRules(List<CostCategorySplitChargeRuleArgs> splitChargeRules) {
            return splitChargeRules(Output.of(splitChargeRules));
        }

        /**
         * @param splitChargeRules Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
         * 
         * @return builder
         * 
         */
        public Builder splitChargeRules(CostCategorySplitChargeRuleArgs... splitChargeRules) {
            return splitChargeRules(List.of(splitChargeRules));
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public CostCategoryArgs build() {
            $.ruleVersion = Objects.requireNonNull($.ruleVersion, "expected parameter 'ruleVersion' to be non-null");
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}
