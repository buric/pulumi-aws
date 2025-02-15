// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inputs;

import com.pulumi.aws.inputs.GetAvailabilityZoneFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAvailabilityZoneArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAvailabilityZoneArgs Empty = new GetAvailabilityZoneArgs();

    /**
     * Set to `true` to include all Availability Zones and Local Zones regardless of your opt in status.
     * 
     */
    @Import(name="allAvailabilityZones")
    private @Nullable Output<Boolean> allAvailabilityZones;

    /**
     * @return Set to `true` to include all Availability Zones and Local Zones regardless of your opt in status.
     * 
     */
    public Optional<Output<Boolean>> allAvailabilityZones() {
        return Optional.ofNullable(this.allAvailabilityZones);
    }

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetAvailabilityZoneFilterArgs>> filters;

    /**
     * @return Configuration block(s) for filtering. Detailed below.
     * 
     */
    public Optional<Output<List<GetAvailabilityZoneFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The name of the filter field. Valid values can be found in the [EC2 DescribeAvailabilityZones API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the filter field. Valid values can be found in the [EC2 DescribeAvailabilityZones API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A specific availability zone state to require. May be any of `&#34;available&#34;`, `&#34;information&#34;` or `&#34;impaired&#34;`.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return A specific availability zone state to require. May be any of `&#34;available&#34;`, `&#34;information&#34;` or `&#34;impaired&#34;`.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The zone ID of the availability zone to select.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone ID of the availability zone to select.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private GetAvailabilityZoneArgs() {}

    private GetAvailabilityZoneArgs(GetAvailabilityZoneArgs $) {
        this.allAvailabilityZones = $.allAvailabilityZones;
        this.filters = $.filters;
        this.name = $.name;
        this.state = $.state;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAvailabilityZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAvailabilityZoneArgs $;

        public Builder() {
            $ = new GetAvailabilityZoneArgs();
        }

        public Builder(GetAvailabilityZoneArgs defaults) {
            $ = new GetAvailabilityZoneArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allAvailabilityZones Set to `true` to include all Availability Zones and Local Zones regardless of your opt in status.
         * 
         * @return builder
         * 
         */
        public Builder allAvailabilityZones(@Nullable Output<Boolean> allAvailabilityZones) {
            $.allAvailabilityZones = allAvailabilityZones;
            return this;
        }

        /**
         * @param allAvailabilityZones Set to `true` to include all Availability Zones and Local Zones regardless of your opt in status.
         * 
         * @return builder
         * 
         */
        public Builder allAvailabilityZones(Boolean allAvailabilityZones) {
            return allAvailabilityZones(Output.of(allAvailabilityZones));
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetAvailabilityZoneFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetAvailabilityZoneFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetAvailabilityZoneFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param name The name of the filter field. Valid values can be found in the [EC2 DescribeAvailabilityZones API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the filter field. Valid values can be found in the [EC2 DescribeAvailabilityZones API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param state A specific availability zone state to require. May be any of `&#34;available&#34;`, `&#34;information&#34;` or `&#34;impaired&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state A specific availability zone state to require. May be any of `&#34;available&#34;`, `&#34;information&#34;` or `&#34;impaired&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param zoneId The zone ID of the availability zone to select.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone ID of the availability zone to select.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public GetAvailabilityZoneArgs build() {
            return $;
        }
    }

}
