// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs Empty = new RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs();

    /**
     * The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
     * 
     */
    @Import(name="comparisonOperator", required=true)
    private Output<String> comparisonOperator;

    /**
     * @return The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
     * 
     */
    public Output<String> comparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs> fieldToMatch;

    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
     * 
     */
    @Import(name="size", required=true)
    private Output<Integer> size;

    /**
     * @return The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementTextTransformationArgs>> textTransformations;

    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    public Output<List<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs() {}

    private RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs(RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs $) {
        this.comparisonOperator = $.comparisonOperator;
        this.fieldToMatch = $.fieldToMatch;
        this.size = $.size;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs();
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs defaults) {
            $ = new RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comparisonOperator The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
         * 
         * @return builder
         * 
         */
        public Builder comparisonOperator(Output<String> comparisonOperator) {
            $.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * @param comparisonOperator The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
         * 
         * @return builder
         * 
         */
        public Builder comparisonOperator(String comparisonOperator) {
            return comparisonOperator(Output.of(comparisonOperator));
        }

        /**
         * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(@Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        /**
         * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        /**
         * @param size The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder size(Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(Output<List<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(List<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs build() {
            $.comparisonOperator = Objects.requireNonNull($.comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
            $.size = Objects.requireNonNull($.size, "expected parameter 'size' to be non-null");
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}
