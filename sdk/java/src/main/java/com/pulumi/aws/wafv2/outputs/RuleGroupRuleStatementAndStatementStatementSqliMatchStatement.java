// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementSqliMatchStatementFieldToMatch;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementSqliMatchStatementTextTransformation;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementAndStatementStatementSqliMatchStatement {
    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementSqliMatchStatementFieldToMatch fieldToMatch;
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<RuleGroupRuleStatementAndStatementStatementSqliMatchStatementTextTransformation> textTransformations;

    @CustomType.Constructor
    private RuleGroupRuleStatementAndStatementStatementSqliMatchStatement(
        @CustomType.Parameter("fieldToMatch") @Nullable RuleGroupRuleStatementAndStatementStatementSqliMatchStatementFieldToMatch fieldToMatch,
        @CustomType.Parameter("textTransformations") List<RuleGroupRuleStatementAndStatementStatementSqliMatchStatementTextTransformation> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = textTransformations;
    }

    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementSqliMatchStatementFieldToMatch> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    public List<RuleGroupRuleStatementAndStatementStatementSqliMatchStatementTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementSqliMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleStatementAndStatementStatementSqliMatchStatementFieldToMatch fieldToMatch;
        private List<RuleGroupRuleStatementAndStatementStatementSqliMatchStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementSqliMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable RuleGroupRuleStatementAndStatementStatementSqliMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder textTransformations(List<RuleGroupRuleStatementAndStatementStatementSqliMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(RuleGroupRuleStatementAndStatementStatementSqliMatchStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public RuleGroupRuleStatementAndStatementStatementSqliMatchStatement build() {
            return new RuleGroupRuleStatementAndStatementStatementSqliMatchStatement(fieldToMatch, textTransformations);
        }
    }
}
