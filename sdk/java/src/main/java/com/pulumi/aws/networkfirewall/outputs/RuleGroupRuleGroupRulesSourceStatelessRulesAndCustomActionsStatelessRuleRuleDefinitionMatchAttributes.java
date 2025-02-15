// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination;
import com.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort;
import com.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource;
import com.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort;
import com.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes {
    /**
     * @return Set of configuration blocks describing the destination ports to inspect for. If not specified, this matches with any destination port. See Destination Port below for details.
     * 
     */
    private final @Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort> destinationPorts;
    /**
     * @return Set of configuration blocks describing the destination IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any destination address. See Destination below for details.
     * 
     */
    private final @Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination> destinations;
    /**
     * @return Set of protocols to inspect for, specified using the protocol&#39;s assigned internet protocol number (IANA). If not specified, this matches with any protocol.
     * 
     */
    private final @Nullable List<Integer> protocols;
    /**
     * @return Set of configuration blocks describing the source ports to inspect for. If not specified, this matches with any source port. See Source Port below for details.
     * 
     */
    private final @Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort> sourcePorts;
    /**
     * @return Set of configuration blocks describing the source IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any source address. See Source below for details.
     * 
     */
    private final @Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource> sources;
    /**
     * @return Set of configuration blocks containing the TCP flags and masks to inspect for. If not specified, this matches with any settings.
     * 
     */
    private final @Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag> tcpFlags;

    @CustomType.Constructor
    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes(
        @CustomType.Parameter("destinationPorts") @Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort> destinationPorts,
        @CustomType.Parameter("destinations") @Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination> destinations,
        @CustomType.Parameter("protocols") @Nullable List<Integer> protocols,
        @CustomType.Parameter("sourcePorts") @Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort> sourcePorts,
        @CustomType.Parameter("sources") @Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource> sources,
        @CustomType.Parameter("tcpFlags") @Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag> tcpFlags) {
        this.destinationPorts = destinationPorts;
        this.destinations = destinations;
        this.protocols = protocols;
        this.sourcePorts = sourcePorts;
        this.sources = sources;
        this.tcpFlags = tcpFlags;
    }

    /**
     * @return Set of configuration blocks describing the destination ports to inspect for. If not specified, this matches with any destination port. See Destination Port below for details.
     * 
     */
    public List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort> destinationPorts() {
        return this.destinationPorts == null ? List.of() : this.destinationPorts;
    }
    /**
     * @return Set of configuration blocks describing the destination IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any destination address. See Destination below for details.
     * 
     */
    public List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination> destinations() {
        return this.destinations == null ? List.of() : this.destinations;
    }
    /**
     * @return Set of protocols to inspect for, specified using the protocol&#39;s assigned internet protocol number (IANA). If not specified, this matches with any protocol.
     * 
     */
    public List<Integer> protocols() {
        return this.protocols == null ? List.of() : this.protocols;
    }
    /**
     * @return Set of configuration blocks describing the source ports to inspect for. If not specified, this matches with any source port. See Source Port below for details.
     * 
     */
    public List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort> sourcePorts() {
        return this.sourcePorts == null ? List.of() : this.sourcePorts;
    }
    /**
     * @return Set of configuration blocks describing the source IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any source address. See Source below for details.
     * 
     */
    public List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource> sources() {
        return this.sources == null ? List.of() : this.sources;
    }
    /**
     * @return Set of configuration blocks containing the TCP flags and masks to inspect for. If not specified, this matches with any settings.
     * 
     */
    public List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag> tcpFlags() {
        return this.tcpFlags == null ? List.of() : this.tcpFlags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort> destinationPorts;
        private @Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination> destinations;
        private @Nullable List<Integer> protocols;
        private @Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort> sourcePorts;
        private @Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource> sources;
        private @Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag> tcpFlags;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.destinations = defaults.destinations;
    	      this.protocols = defaults.protocols;
    	      this.sourcePorts = defaults.sourcePorts;
    	      this.sources = defaults.sources;
    	      this.tcpFlags = defaults.tcpFlags;
        }

        public Builder destinationPorts(@Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }
        public Builder destinationPorts(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }
        public Builder destinations(@Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination> destinations) {
            this.destinations = destinations;
            return this;
        }
        public Builder destinations(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestination... destinations) {
            return destinations(List.of(destinations));
        }
        public Builder protocols(@Nullable List<Integer> protocols) {
            this.protocols = protocols;
            return this;
        }
        public Builder protocols(Integer... protocols) {
            return protocols(List.of(protocols));
        }
        public Builder sourcePorts(@Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort> sourcePorts) {
            this.sourcePorts = sourcePorts;
            return this;
        }
        public Builder sourcePorts(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort... sourcePorts) {
            return sourcePorts(List.of(sourcePorts));
        }
        public Builder sources(@Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource> sources) {
            this.sources = sources;
            return this;
        }
        public Builder sources(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSource... sources) {
            return sources(List.of(sources));
        }
        public Builder tcpFlags(@Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag> tcpFlags) {
            this.tcpFlags = tcpFlags;
            return this;
        }
        public Builder tcpFlags(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlag... tcpFlags) {
            return tcpFlags(List.of(tcpFlags));
        }        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes(destinationPorts, destinations, protocols, sourcePorts, sources, tcpFlags);
        }
    }
}
