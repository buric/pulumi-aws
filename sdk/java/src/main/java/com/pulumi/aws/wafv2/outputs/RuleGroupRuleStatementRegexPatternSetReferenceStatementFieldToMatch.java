// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchBody;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethod;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchQueryString;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchUriPath;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatch {
    /**
     * @return Inspect all query arguments.
     * 
     */
    private final @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchBody body;
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethod method;
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchQueryString queryString;
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader singleHeader;
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchUriPath uriPath;

    @CustomType.Constructor
    private RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatch(
        @CustomType.Parameter("allQueryArguments") @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments allQueryArguments,
        @CustomType.Parameter("body") @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchBody body,
        @CustomType.Parameter("method") @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethod method,
        @CustomType.Parameter("queryString") @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchQueryString queryString,
        @CustomType.Parameter("singleHeader") @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader singleHeader,
        @CustomType.Parameter("singleQueryArgument") @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @CustomType.Parameter("uriPath") @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchUriPath uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchBody> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethod> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchUriPath> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchBody body;
        private @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethod method;
        private @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchQueryString queryString;
        private @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder body(@Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        public Builder method(@Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        public Builder queryString(@Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder singleHeader(@Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleQueryArgument(@Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder uriPath(@Nullable RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }        public RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatch build() {
            return new RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
