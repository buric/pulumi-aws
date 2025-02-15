// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration {
    /**
     * @return Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
     * 
     */
    private final @Nullable Boolean autoScalingEnabled;
    /**
     * @return Describes whether the application uses the default parallelism for the Kinesis Data Analytics service. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `auto_scaling_enabled`, `parallelism`, or `parallelism_per_kpu` attribute values to be effective.
     * 
     */
    private final String configurationType;
    /**
     * @return Describes the initial number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform.
     * 
     */
    private final @Nullable Integer parallelism;
    /**
     * @return Describes the number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the application.
     * 
     */
    private final @Nullable Integer parallelismPerKpu;

    @CustomType.Constructor
    private ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration(
        @CustomType.Parameter("autoScalingEnabled") @Nullable Boolean autoScalingEnabled,
        @CustomType.Parameter("configurationType") String configurationType,
        @CustomType.Parameter("parallelism") @Nullable Integer parallelism,
        @CustomType.Parameter("parallelismPerKpu") @Nullable Integer parallelismPerKpu) {
        this.autoScalingEnabled = autoScalingEnabled;
        this.configurationType = configurationType;
        this.parallelism = parallelism;
        this.parallelismPerKpu = parallelismPerKpu;
    }

    /**
     * @return Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
     * 
     */
    public Optional<Boolean> autoScalingEnabled() {
        return Optional.ofNullable(this.autoScalingEnabled);
    }
    /**
     * @return Describes whether the application uses the default parallelism for the Kinesis Data Analytics service. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `auto_scaling_enabled`, `parallelism`, or `parallelism_per_kpu` attribute values to be effective.
     * 
     */
    public String configurationType() {
        return this.configurationType;
    }
    /**
     * @return Describes the initial number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform.
     * 
     */
    public Optional<Integer> parallelism() {
        return Optional.ofNullable(this.parallelism);
    }
    /**
     * @return Describes the number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the application.
     * 
     */
    public Optional<Integer> parallelismPerKpu() {
        return Optional.ofNullable(this.parallelismPerKpu);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoScalingEnabled;
        private String configurationType;
        private @Nullable Integer parallelism;
        private @Nullable Integer parallelismPerKpu;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingEnabled = defaults.autoScalingEnabled;
    	      this.configurationType = defaults.configurationType;
    	      this.parallelism = defaults.parallelism;
    	      this.parallelismPerKpu = defaults.parallelismPerKpu;
        }

        public Builder autoScalingEnabled(@Nullable Boolean autoScalingEnabled) {
            this.autoScalingEnabled = autoScalingEnabled;
            return this;
        }
        public Builder configurationType(String configurationType) {
            this.configurationType = Objects.requireNonNull(configurationType);
            return this;
        }
        public Builder parallelism(@Nullable Integer parallelism) {
            this.parallelism = parallelism;
            return this;
        }
        public Builder parallelismPerKpu(@Nullable Integer parallelismPerKpu) {
            this.parallelismPerKpu = parallelismPerKpu;
            return this;
        }        public ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration build() {
            return new ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration(autoScalingEnabled, configurationType, parallelism, parallelismPerKpu);
        }
    }
}
