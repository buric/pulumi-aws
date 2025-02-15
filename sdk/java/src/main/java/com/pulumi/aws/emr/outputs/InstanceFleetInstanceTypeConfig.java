// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.outputs;

import com.pulumi.aws.emr.outputs.InstanceFleetInstanceTypeConfigConfiguration;
import com.pulumi.aws.emr.outputs.InstanceFleetInstanceTypeConfigEbsConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceFleetInstanceTypeConfig {
    /**
     * @return The bid price for each EC2 Spot instance type as defined by `instance_type`. Expressed in USD. If neither `bid_price` nor `bid_price_as_percentage_of_on_demand_price` is provided, `bid_price_as_percentage_of_on_demand_price` defaults to 100%.
     * 
     */
    private final @Nullable String bidPrice;
    /**
     * @return The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by `instance_type`. Expressed as a number (for example, 20 specifies 20%). If neither `bid_price` nor `bid_price_as_percentage_of_on_demand_price` is provided, `bid_price_as_percentage_of_on_demand_price` defaults to 100%.
     * 
     */
    private final @Nullable Double bidPriceAsPercentageOfOnDemandPrice;
    /**
     * @return A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
     * 
     */
    private final @Nullable List<InstanceFleetInstanceTypeConfigConfiguration> configurations;
    /**
     * @return Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * 
     */
    private final @Nullable List<InstanceFleetInstanceTypeConfigEbsConfig> ebsConfigs;
    /**
     * @return An EC2 instance type, such as m4.xlarge.
     * 
     */
    private final String instanceType;
    /**
     * @return The number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in `aws.emr.InstanceFleet`.
     * 
     */
    private final @Nullable Integer weightedCapacity;

    @CustomType.Constructor
    private InstanceFleetInstanceTypeConfig(
        @CustomType.Parameter("bidPrice") @Nullable String bidPrice,
        @CustomType.Parameter("bidPriceAsPercentageOfOnDemandPrice") @Nullable Double bidPriceAsPercentageOfOnDemandPrice,
        @CustomType.Parameter("configurations") @Nullable List<InstanceFleetInstanceTypeConfigConfiguration> configurations,
        @CustomType.Parameter("ebsConfigs") @Nullable List<InstanceFleetInstanceTypeConfigEbsConfig> ebsConfigs,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("weightedCapacity") @Nullable Integer weightedCapacity) {
        this.bidPrice = bidPrice;
        this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
        this.configurations = configurations;
        this.ebsConfigs = ebsConfigs;
        this.instanceType = instanceType;
        this.weightedCapacity = weightedCapacity;
    }

    /**
     * @return The bid price for each EC2 Spot instance type as defined by `instance_type`. Expressed in USD. If neither `bid_price` nor `bid_price_as_percentage_of_on_demand_price` is provided, `bid_price_as_percentage_of_on_demand_price` defaults to 100%.
     * 
     */
    public Optional<String> bidPrice() {
        return Optional.ofNullable(this.bidPrice);
    }
    /**
     * @return The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by `instance_type`. Expressed as a number (for example, 20 specifies 20%). If neither `bid_price` nor `bid_price_as_percentage_of_on_demand_price` is provided, `bid_price_as_percentage_of_on_demand_price` defaults to 100%.
     * 
     */
    public Optional<Double> bidPriceAsPercentageOfOnDemandPrice() {
        return Optional.ofNullable(this.bidPriceAsPercentageOfOnDemandPrice);
    }
    /**
     * @return A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
     * 
     */
    public List<InstanceFleetInstanceTypeConfigConfiguration> configurations() {
        return this.configurations == null ? List.of() : this.configurations;
    }
    /**
     * @return Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * 
     */
    public List<InstanceFleetInstanceTypeConfigEbsConfig> ebsConfigs() {
        return this.ebsConfigs == null ? List.of() : this.ebsConfigs;
    }
    /**
     * @return An EC2 instance type, such as m4.xlarge.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return The number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in `aws.emr.InstanceFleet`.
     * 
     */
    public Optional<Integer> weightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFleetInstanceTypeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bidPrice;
        private @Nullable Double bidPriceAsPercentageOfOnDemandPrice;
        private @Nullable List<InstanceFleetInstanceTypeConfigConfiguration> configurations;
        private @Nullable List<InstanceFleetInstanceTypeConfigEbsConfig> ebsConfigs;
        private String instanceType;
        private @Nullable Integer weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFleetInstanceTypeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bidPrice = defaults.bidPrice;
    	      this.bidPriceAsPercentageOfOnDemandPrice = defaults.bidPriceAsPercentageOfOnDemandPrice;
    	      this.configurations = defaults.configurations;
    	      this.ebsConfigs = defaults.ebsConfigs;
    	      this.instanceType = defaults.instanceType;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder bidPrice(@Nullable String bidPrice) {
            this.bidPrice = bidPrice;
            return this;
        }
        public Builder bidPriceAsPercentageOfOnDemandPrice(@Nullable Double bidPriceAsPercentageOfOnDemandPrice) {
            this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
            return this;
        }
        public Builder configurations(@Nullable List<InstanceFleetInstanceTypeConfigConfiguration> configurations) {
            this.configurations = configurations;
            return this;
        }
        public Builder configurations(InstanceFleetInstanceTypeConfigConfiguration... configurations) {
            return configurations(List.of(configurations));
        }
        public Builder ebsConfigs(@Nullable List<InstanceFleetInstanceTypeConfigEbsConfig> ebsConfigs) {
            this.ebsConfigs = ebsConfigs;
            return this;
        }
        public Builder ebsConfigs(InstanceFleetInstanceTypeConfigEbsConfig... ebsConfigs) {
            return ebsConfigs(List.of(ebsConfigs));
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder weightedCapacity(@Nullable Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }        public InstanceFleetInstanceTypeConfig build() {
            return new InstanceFleetInstanceTypeConfig(bidPrice, bidPriceAsPercentageOfOnDemandPrice, configurations, ebsConfigs, instanceType, weightedCapacity);
        }
    }
}
