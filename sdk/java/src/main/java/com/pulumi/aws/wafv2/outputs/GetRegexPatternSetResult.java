// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.GetRegexPatternSetRegularExpression;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRegexPatternSetResult {
    /**
     * @return The Amazon Resource Name (ARN) of the entity.
     * 
     */
    private final String arn;
    /**
     * @return The description of the set that helps with identification.
     * 
     */
    private final String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * @return One or more blocks of regular expression patterns that AWS WAF is searching for. See Regular Expression below for details.
     * 
     */
    private final List<GetRegexPatternSetRegularExpression> regularExpressions;
    private final String scope;

    @CustomType.Constructor
    private GetRegexPatternSetResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("regularExpressions") List<GetRegexPatternSetRegularExpression> regularExpressions,
        @CustomType.Parameter("scope") String scope) {
        this.arn = arn;
        this.description = description;
        this.id = id;
        this.name = name;
        this.regularExpressions = regularExpressions;
        this.scope = scope;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the entity.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The description of the set that helps with identification.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return One or more blocks of regular expression patterns that AWS WAF is searching for. See Regular Expression below for details.
     * 
     */
    public List<GetRegexPatternSetRegularExpression> regularExpressions() {
        return this.regularExpressions;
    }
    public String scope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegexPatternSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String description;
        private String id;
        private String name;
        private List<GetRegexPatternSetRegularExpression> regularExpressions;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegexPatternSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.regularExpressions = defaults.regularExpressions;
    	      this.scope = defaults.scope;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder regularExpressions(List<GetRegexPatternSetRegularExpression> regularExpressions) {
            this.regularExpressions = Objects.requireNonNull(regularExpressions);
            return this;
        }
        public Builder regularExpressions(GetRegexPatternSetRegularExpression... regularExpressions) {
            return regularExpressions(List.of(regularExpressions));
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }        public GetRegexPatternSetResult build() {
            return new GetRegexPatternSetResult(arn, description, id, name, regularExpressions, scope);
        }
    }
}
