// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.outputs;

import com.pulumi.aws.guardduty.outputs.FilterFindingCriteriaCriterion;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class FilterFindingCriteria {
    private final List<FilterFindingCriteriaCriterion> criterions;

    @CustomType.Constructor
    private FilterFindingCriteria(@CustomType.Parameter("criterions") List<FilterFindingCriteriaCriterion> criterions) {
        this.criterions = criterions;
    }

    public List<FilterFindingCriteriaCriterion> criterions() {
        return this.criterions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterFindingCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FilterFindingCriteriaCriterion> criterions;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterFindingCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criterions = defaults.criterions;
        }

        public Builder criterions(List<FilterFindingCriteriaCriterion> criterions) {
            this.criterions = Objects.requireNonNull(criterions);
            return this;
        }
        public Builder criterions(FilterFindingCriteriaCriterion... criterions) {
            return criterions(List.of(criterions));
        }        public FilterFindingCriteria build() {
            return new FilterFindingCriteria(criterions);
        }
    }
}
