// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs;
import com.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyTargetTrackingConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyTargetTrackingConfigurationArgs Empty = new PolicyTargetTrackingConfigurationArgs();

    /**
     * A customized metric. Conflicts with `predefined_metric_specification`.
     * 
     */
    @Import(name="customizedMetricSpecification")
    private @Nullable Output<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs> customizedMetricSpecification;

    /**
     * @return A customized metric. Conflicts with `predefined_metric_specification`.
     * 
     */
    public Optional<Output<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs>> customizedMetricSpecification() {
        return Optional.ofNullable(this.customizedMetricSpecification);
    }

    /**
     * Indicates whether scale in by the target tracking policy is disabled.
     * 
     */
    @Import(name="disableScaleIn")
    private @Nullable Output<Boolean> disableScaleIn;

    /**
     * @return Indicates whether scale in by the target tracking policy is disabled.
     * 
     */
    public Optional<Output<Boolean>> disableScaleIn() {
        return Optional.ofNullable(this.disableScaleIn);
    }

    /**
     * A predefined metric. Conflicts with `customized_metric_specification`.
     * 
     */
    @Import(name="predefinedMetricSpecification")
    private @Nullable Output<PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs> predefinedMetricSpecification;

    /**
     * @return A predefined metric. Conflicts with `customized_metric_specification`.
     * 
     */
    public Optional<Output<PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs>> predefinedMetricSpecification() {
        return Optional.ofNullable(this.predefinedMetricSpecification);
    }

    /**
     * The target value for the metric.
     * 
     */
    @Import(name="targetValue", required=true)
    private Output<Double> targetValue;

    /**
     * @return The target value for the metric.
     * 
     */
    public Output<Double> targetValue() {
        return this.targetValue;
    }

    private PolicyTargetTrackingConfigurationArgs() {}

    private PolicyTargetTrackingConfigurationArgs(PolicyTargetTrackingConfigurationArgs $) {
        this.customizedMetricSpecification = $.customizedMetricSpecification;
        this.disableScaleIn = $.disableScaleIn;
        this.predefinedMetricSpecification = $.predefinedMetricSpecification;
        this.targetValue = $.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyTargetTrackingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyTargetTrackingConfigurationArgs $;

        public Builder() {
            $ = new PolicyTargetTrackingConfigurationArgs();
        }

        public Builder(PolicyTargetTrackingConfigurationArgs defaults) {
            $ = new PolicyTargetTrackingConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customizedMetricSpecification A customized metric. Conflicts with `predefined_metric_specification`.
         * 
         * @return builder
         * 
         */
        public Builder customizedMetricSpecification(@Nullable Output<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs> customizedMetricSpecification) {
            $.customizedMetricSpecification = customizedMetricSpecification;
            return this;
        }

        /**
         * @param customizedMetricSpecification A customized metric. Conflicts with `predefined_metric_specification`.
         * 
         * @return builder
         * 
         */
        public Builder customizedMetricSpecification(PolicyTargetTrackingConfigurationCustomizedMetricSpecificationArgs customizedMetricSpecification) {
            return customizedMetricSpecification(Output.of(customizedMetricSpecification));
        }

        /**
         * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
         * 
         * @return builder
         * 
         */
        public Builder disableScaleIn(@Nullable Output<Boolean> disableScaleIn) {
            $.disableScaleIn = disableScaleIn;
            return this;
        }

        /**
         * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
         * 
         * @return builder
         * 
         */
        public Builder disableScaleIn(Boolean disableScaleIn) {
            return disableScaleIn(Output.of(disableScaleIn));
        }

        /**
         * @param predefinedMetricSpecification A predefined metric. Conflicts with `customized_metric_specification`.
         * 
         * @return builder
         * 
         */
        public Builder predefinedMetricSpecification(@Nullable Output<PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs> predefinedMetricSpecification) {
            $.predefinedMetricSpecification = predefinedMetricSpecification;
            return this;
        }

        /**
         * @param predefinedMetricSpecification A predefined metric. Conflicts with `customized_metric_specification`.
         * 
         * @return builder
         * 
         */
        public Builder predefinedMetricSpecification(PolicyTargetTrackingConfigurationPredefinedMetricSpecificationArgs predefinedMetricSpecification) {
            return predefinedMetricSpecification(Output.of(predefinedMetricSpecification));
        }

        /**
         * @param targetValue The target value for the metric.
         * 
         * @return builder
         * 
         */
        public Builder targetValue(Output<Double> targetValue) {
            $.targetValue = targetValue;
            return this;
        }

        /**
         * @param targetValue The target value for the metric.
         * 
         * @return builder
         * 
         */
        public Builder targetValue(Double targetValue) {
            return targetValue(Output.of(targetValue));
        }

        public PolicyTargetTrackingConfigurationArgs build() {
            $.targetValue = Objects.requireNonNull($.targetValue, "expected parameter 'targetValue' to be non-null");
            return $;
        }
    }

}
