// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrafficMirrorSessionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrafficMirrorSessionArgs Empty = new TrafficMirrorSessionArgs();

    /**
     * A description of the traffic mirror session.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the traffic mirror session.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * ID of the source network interface. Not all network interfaces are eligible as mirror sources. On EC2 instances only nitro based instances support mirroring.
     * 
     */
    @Import(name="networkInterfaceId", required=true)
    private Output<String> networkInterfaceId;

    /**
     * @return ID of the source network interface. Not all network interfaces are eligible as mirror sources. On EC2 instances only nitro based instances support mirroring.
     * 
     */
    public Output<String> networkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror.
     * 
     */
    @Import(name="packetLength")
    private @Nullable Output<Integer> packetLength;

    /**
     * @return The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror.
     * 
     */
    public Optional<Output<Integer>> packetLength() {
        return Optional.ofNullable(this.packetLength);
    }

    /**
     * - The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets.
     * 
     */
    @Import(name="sessionNumber", required=true)
    private Output<Integer> sessionNumber;

    /**
     * @return - The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets.
     * 
     */
    public Output<Integer> sessionNumber() {
        return this.sessionNumber;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * ID of the traffic mirror filter to be used
     * 
     */
    @Import(name="trafficMirrorFilterId", required=true)
    private Output<String> trafficMirrorFilterId;

    /**
     * @return ID of the traffic mirror filter to be used
     * 
     */
    public Output<String> trafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    /**
     * ID of the traffic mirror target to be used
     * 
     */
    @Import(name="trafficMirrorTargetId", required=true)
    private Output<String> trafficMirrorTargetId;

    /**
     * @return ID of the traffic mirror target to be used
     * 
     */
    public Output<String> trafficMirrorTargetId() {
        return this.trafficMirrorTargetId;
    }

    /**
     * - The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
     * 
     */
    @Import(name="virtualNetworkId")
    private @Nullable Output<Integer> virtualNetworkId;

    /**
     * @return - The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
     * 
     */
    public Optional<Output<Integer>> virtualNetworkId() {
        return Optional.ofNullable(this.virtualNetworkId);
    }

    private TrafficMirrorSessionArgs() {}

    private TrafficMirrorSessionArgs(TrafficMirrorSessionArgs $) {
        this.description = $.description;
        this.networkInterfaceId = $.networkInterfaceId;
        this.packetLength = $.packetLength;
        this.sessionNumber = $.sessionNumber;
        this.tags = $.tags;
        this.trafficMirrorFilterId = $.trafficMirrorFilterId;
        this.trafficMirrorTargetId = $.trafficMirrorTargetId;
        this.virtualNetworkId = $.virtualNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrafficMirrorSessionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrafficMirrorSessionArgs $;

        public Builder() {
            $ = new TrafficMirrorSessionArgs();
        }

        public Builder(TrafficMirrorSessionArgs defaults) {
            $ = new TrafficMirrorSessionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the traffic mirror session.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the traffic mirror session.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param networkInterfaceId ID of the source network interface. Not all network interfaces are eligible as mirror sources. On EC2 instances only nitro based instances support mirroring.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceId(Output<String> networkInterfaceId) {
            $.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * @param networkInterfaceId ID of the source network interface. Not all network interfaces are eligible as mirror sources. On EC2 instances only nitro based instances support mirroring.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            return networkInterfaceId(Output.of(networkInterfaceId));
        }

        /**
         * @param packetLength The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror.
         * 
         * @return builder
         * 
         */
        public Builder packetLength(@Nullable Output<Integer> packetLength) {
            $.packetLength = packetLength;
            return this;
        }

        /**
         * @param packetLength The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror.
         * 
         * @return builder
         * 
         */
        public Builder packetLength(Integer packetLength) {
            return packetLength(Output.of(packetLength));
        }

        /**
         * @param sessionNumber - The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets.
         * 
         * @return builder
         * 
         */
        public Builder sessionNumber(Output<Integer> sessionNumber) {
            $.sessionNumber = sessionNumber;
            return this;
        }

        /**
         * @param sessionNumber - The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets.
         * 
         * @return builder
         * 
         */
        public Builder sessionNumber(Integer sessionNumber) {
            return sessionNumber(Output.of(sessionNumber));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param trafficMirrorFilterId ID of the traffic mirror filter to be used
         * 
         * @return builder
         * 
         */
        public Builder trafficMirrorFilterId(Output<String> trafficMirrorFilterId) {
            $.trafficMirrorFilterId = trafficMirrorFilterId;
            return this;
        }

        /**
         * @param trafficMirrorFilterId ID of the traffic mirror filter to be used
         * 
         * @return builder
         * 
         */
        public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
            return trafficMirrorFilterId(Output.of(trafficMirrorFilterId));
        }

        /**
         * @param trafficMirrorTargetId ID of the traffic mirror target to be used
         * 
         * @return builder
         * 
         */
        public Builder trafficMirrorTargetId(Output<String> trafficMirrorTargetId) {
            $.trafficMirrorTargetId = trafficMirrorTargetId;
            return this;
        }

        /**
         * @param trafficMirrorTargetId ID of the traffic mirror target to be used
         * 
         * @return builder
         * 
         */
        public Builder trafficMirrorTargetId(String trafficMirrorTargetId) {
            return trafficMirrorTargetId(Output.of(trafficMirrorTargetId));
        }

        /**
         * @param virtualNetworkId - The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkId(@Nullable Output<Integer> virtualNetworkId) {
            $.virtualNetworkId = virtualNetworkId;
            return this;
        }

        /**
         * @param virtualNetworkId - The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkId(Integer virtualNetworkId) {
            return virtualNetworkId(Output.of(virtualNetworkId));
        }

        public TrafficMirrorSessionArgs build() {
            $.networkInterfaceId = Objects.requireNonNull($.networkInterfaceId, "expected parameter 'networkInterfaceId' to be non-null");
            $.sessionNumber = Objects.requireNonNull($.sessionNumber, "expected parameter 'sessionNumber' to be non-null");
            $.trafficMirrorFilterId = Objects.requireNonNull($.trafficMirrorFilterId, "expected parameter 'trafficMirrorFilterId' to be non-null");
            $.trafficMirrorTargetId = Objects.requireNonNull($.trafficMirrorTargetId, "expected parameter 'trafficMirrorTargetId' to be non-null");
            return $;
        }
    }

}
