// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dlm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LifecyclePolicyPolicyDetailsScheduleFastRestoreRule {
    /**
     * @return The Availability Zones in which to enable fast snapshot restore.
     * 
     */
    private final List<String> availabilityZones;
    /**
     * @return How many snapshots to keep. Must be an integer between `1` and `1000`.
     * 
     */
    private final @Nullable Integer count;
    /**
     * @return The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     * 
     */
    private final @Nullable Integer interval;
    /**
     * @return The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     * 
     */
    private final @Nullable String intervalUnit;

    @CustomType.Constructor
    private LifecyclePolicyPolicyDetailsScheduleFastRestoreRule(
        @CustomType.Parameter("availabilityZones") List<String> availabilityZones,
        @CustomType.Parameter("count") @Nullable Integer count,
        @CustomType.Parameter("interval") @Nullable Integer interval,
        @CustomType.Parameter("intervalUnit") @Nullable String intervalUnit) {
        this.availabilityZones = availabilityZones;
        this.count = count;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
    }

    /**
     * @return The Availability Zones in which to enable fast snapshot restore.
     * 
     */
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }
    /**
     * @return How many snapshots to keep. Must be an integer between `1` and `1000`.
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    /**
     * @return The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     * 
     */
    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * @return The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     * 
     */
    public Optional<String> intervalUnit() {
        return Optional.ofNullable(this.intervalUnit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsScheduleFastRestoreRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> availabilityZones;
        private @Nullable Integer count;
        private @Nullable Integer interval;
        private @Nullable String intervalUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyPolicyDetailsScheduleFastRestoreRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.count = defaults.count;
    	      this.interval = defaults.interval;
    	      this.intervalUnit = defaults.intervalUnit;
        }

        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        public Builder interval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }
        public Builder intervalUnit(@Nullable String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }        public LifecyclePolicyPolicyDetailsScheduleFastRestoreRule build() {
            return new LifecyclePolicyPolicyDetailsScheduleFastRestoreRule(availabilityZones, count, interval, intervalUnit);
        }
    }
}
