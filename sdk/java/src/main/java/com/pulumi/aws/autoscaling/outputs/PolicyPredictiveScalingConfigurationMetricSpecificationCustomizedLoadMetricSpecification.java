// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.outputs;

import com.pulumi.aws.autoscaling.outputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQuery;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecification {
    /**
     * @return A list of up to 10 structures that defines custom capacity metric in predictive scaling policy
     * 
     */
    private final List<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQuery> metricDataQueries;

    @CustomType.Constructor
    private PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecification(@CustomType.Parameter("metricDataQueries") List<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQuery> metricDataQueries) {
        this.metricDataQueries = metricDataQueries;
    }

    /**
     * @return A list of up to 10 structures that defines custom capacity metric in predictive scaling policy
     * 
     */
    public List<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQuery> metricDataQueries() {
        return this.metricDataQueries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQuery> metricDataQueries;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricDataQueries = defaults.metricDataQueries;
        }

        public Builder metricDataQueries(List<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQuery> metricDataQueries) {
            this.metricDataQueries = Objects.requireNonNull(metricDataQueries);
            return this;
        }
        public Builder metricDataQueries(PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationMetricDataQuery... metricDataQueries) {
            return metricDataQueries(List.of(metricDataQueries));
        }        public PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecification build() {
            return new PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecification(metricDataQueries);
        }
    }
}
