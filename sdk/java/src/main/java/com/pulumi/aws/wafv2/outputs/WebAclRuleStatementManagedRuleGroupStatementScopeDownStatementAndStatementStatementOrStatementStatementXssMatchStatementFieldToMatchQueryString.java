// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString {
    @CustomType.Constructor
    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString();
        }
    }
}
