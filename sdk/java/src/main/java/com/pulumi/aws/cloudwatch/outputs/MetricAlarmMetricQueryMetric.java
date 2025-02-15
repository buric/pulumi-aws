// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricAlarmMetricQueryMetric {
    /**
     * @return The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    private final @Nullable Map<String,String> dimensions;
    /**
     * @return The name for this metric.
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    private final String metricName;
    /**
     * @return The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    private final @Nullable String namespace;
    /**
     * @return The period in seconds over which the specified `stat` is applied.
     * 
     */
    private final Integer period;
    /**
     * @return The statistic to apply to this metric.
     * See docs for [supported statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html).
     * 
     */
    private final String stat;
    /**
     * @return The unit for this metric.
     * 
     */
    private final @Nullable String unit;

    @CustomType.Constructor
    private MetricAlarmMetricQueryMetric(
        @CustomType.Parameter("dimensions") @Nullable Map<String,String> dimensions,
        @CustomType.Parameter("metricName") String metricName,
        @CustomType.Parameter("namespace") @Nullable String namespace,
        @CustomType.Parameter("period") Integer period,
        @CustomType.Parameter("stat") String stat,
        @CustomType.Parameter("unit") @Nullable String unit) {
        this.dimensions = dimensions;
        this.metricName = metricName;
        this.namespace = namespace;
        this.period = period;
        this.stat = stat;
        this.unit = unit;
    }

    /**
     * @return The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    public Map<String,String> dimensions() {
        return this.dimensions == null ? Map.of() : this.dimensions;
    }
    /**
     * @return The name for this metric.
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return The period in seconds over which the specified `stat` is applied.
     * 
     */
    public Integer period() {
        return this.period;
    }
    /**
     * @return The statistic to apply to this metric.
     * See docs for [supported statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html).
     * 
     */
    public String stat() {
        return this.stat;
    }
    /**
     * @return The unit for this metric.
     * 
     */
    public Optional<String> unit() {
        return Optional.ofNullable(this.unit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlarmMetricQueryMetric defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> dimensions;
        private String metricName;
        private @Nullable String namespace;
        private Integer period;
        private String stat;
        private @Nullable String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlarmMetricQueryMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
    	      this.period = defaults.period;
    	      this.stat = defaults.stat;
    	      this.unit = defaults.unit;
        }

        public Builder dimensions(@Nullable Map<String,String> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder period(Integer period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }
        public Builder stat(String stat) {
            this.stat = Objects.requireNonNull(stat);
            return this;
        }
        public Builder unit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }        public MetricAlarmMetricQueryMetric build() {
            return new MetricAlarmMetricQueryMetric(dimensions, metricName, namespace, period, stat, unit);
        }
    }
}
