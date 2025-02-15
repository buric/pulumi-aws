// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleStatementNotStatement {
    /**
     * @return The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    private final List<RuleGroupRuleStatementNotStatementStatement> statements;

    @CustomType.Constructor
    private RuleGroupRuleStatementNotStatement(@CustomType.Parameter("statements") List<RuleGroupRuleStatementNotStatementStatement> statements) {
        this.statements = statements;
    }

    /**
     * @return The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    public List<RuleGroupRuleStatementNotStatementStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupRuleStatementNotStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(List<RuleGroupRuleStatementNotStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(RuleGroupRuleStatementNotStatementStatement... statements) {
            return statements(List.of(statements));
        }        public RuleGroupRuleStatementNotStatement build() {
            return new RuleGroupRuleStatementNotStatement(statements);
        }
    }
}
