// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./delegationSet";
export * from "./getDelegationSet";
export * from "./getResolverEndpoint";
export * from "./getResolverRule";
export * from "./getResolverRules";
export * from "./getTrafficPolicyDocument";
export * from "./getZone";
export * from "./healthCheck";
export * from "./hostedZoneDnsSec";
export * from "./keySigningKey";
export * from "./queryLog";
export * from "./record";
export * from "./recordType";
export * from "./resolverDnsSecConfig";
export * from "./resolverEndpoint";
export * from "./resolverFirewallConfig";
export * from "./resolverFirewallDomainList";
export * from "./resolverFirewallRule";
export * from "./resolverFirewallRuleGroup";
export * from "./resolverFirewallRuleGroupAssociation";
export * from "./resolverQueryLogConfig";
export * from "./resolverQueryLogConfigAssociation";
export * from "./resolverRule";
export * from "./resolverRuleAssociation";
export * from "./trafficPolicy";
export * from "./trafficPolicyInstance";
export * from "./vpcAssociationAuthorization";
export * from "./zone";
export * from "./zoneAssociation";

// Export enums:
export * from "../types/enums/route53";

// Import resources to register:
import { DelegationSet } from "./delegationSet";
import { HealthCheck } from "./healthCheck";
import { HostedZoneDnsSec } from "./hostedZoneDnsSec";
import { KeySigningKey } from "./keySigningKey";
import { QueryLog } from "./queryLog";
import { Record } from "./record";
import { ResolverDnsSecConfig } from "./resolverDnsSecConfig";
import { ResolverEndpoint } from "./resolverEndpoint";
import { ResolverFirewallConfig } from "./resolverFirewallConfig";
import { ResolverFirewallDomainList } from "./resolverFirewallDomainList";
import { ResolverFirewallRule } from "./resolverFirewallRule";
import { ResolverFirewallRuleGroup } from "./resolverFirewallRuleGroup";
import { ResolverFirewallRuleGroupAssociation } from "./resolverFirewallRuleGroupAssociation";
import { ResolverQueryLogConfig } from "./resolverQueryLogConfig";
import { ResolverQueryLogConfigAssociation } from "./resolverQueryLogConfigAssociation";
import { ResolverRule } from "./resolverRule";
import { ResolverRuleAssociation } from "./resolverRuleAssociation";
import { TrafficPolicy } from "./trafficPolicy";
import { TrafficPolicyInstance } from "./trafficPolicyInstance";
import { VpcAssociationAuthorization } from "./vpcAssociationAuthorization";
import { Zone } from "./zone";
import { ZoneAssociation } from "./zoneAssociation";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:route53/delegationSet:DelegationSet":
                return new DelegationSet(name, <any>undefined, { urn })
            case "aws:route53/healthCheck:HealthCheck":
                return new HealthCheck(name, <any>undefined, { urn })
            case "aws:route53/hostedZoneDnsSec:HostedZoneDnsSec":
                return new HostedZoneDnsSec(name, <any>undefined, { urn })
            case "aws:route53/keySigningKey:KeySigningKey":
                return new KeySigningKey(name, <any>undefined, { urn })
            case "aws:route53/queryLog:QueryLog":
                return new QueryLog(name, <any>undefined, { urn })
            case "aws:route53/record:Record":
                return new Record(name, <any>undefined, { urn })
            case "aws:route53/resolverDnsSecConfig:ResolverDnsSecConfig":
                return new ResolverDnsSecConfig(name, <any>undefined, { urn })
            case "aws:route53/resolverEndpoint:ResolverEndpoint":
                return new ResolverEndpoint(name, <any>undefined, { urn })
            case "aws:route53/resolverFirewallConfig:ResolverFirewallConfig":
                return new ResolverFirewallConfig(name, <any>undefined, { urn })
            case "aws:route53/resolverFirewallDomainList:ResolverFirewallDomainList":
                return new ResolverFirewallDomainList(name, <any>undefined, { urn })
            case "aws:route53/resolverFirewallRule:ResolverFirewallRule":
                return new ResolverFirewallRule(name, <any>undefined, { urn })
            case "aws:route53/resolverFirewallRuleGroup:ResolverFirewallRuleGroup":
                return new ResolverFirewallRuleGroup(name, <any>undefined, { urn })
            case "aws:route53/resolverFirewallRuleGroupAssociation:ResolverFirewallRuleGroupAssociation":
                return new ResolverFirewallRuleGroupAssociation(name, <any>undefined, { urn })
            case "aws:route53/resolverQueryLogConfig:ResolverQueryLogConfig":
                return new ResolverQueryLogConfig(name, <any>undefined, { urn })
            case "aws:route53/resolverQueryLogConfigAssociation:ResolverQueryLogConfigAssociation":
                return new ResolverQueryLogConfigAssociation(name, <any>undefined, { urn })
            case "aws:route53/resolverRule:ResolverRule":
                return new ResolverRule(name, <any>undefined, { urn })
            case "aws:route53/resolverRuleAssociation:ResolverRuleAssociation":
                return new ResolverRuleAssociation(name, <any>undefined, { urn })
            case "aws:route53/trafficPolicy:TrafficPolicy":
                return new TrafficPolicy(name, <any>undefined, { urn })
            case "aws:route53/trafficPolicyInstance:TrafficPolicyInstance":
                return new TrafficPolicyInstance(name, <any>undefined, { urn })
            case "aws:route53/vpcAssociationAuthorization:VpcAssociationAuthorization":
                return new VpcAssociationAuthorization(name, <any>undefined, { urn })
            case "aws:route53/zone:Zone":
                return new Zone(name, <any>undefined, { urn })
            case "aws:route53/zoneAssociation:ZoneAssociation":
                return new ZoneAssociation(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "route53/delegationSet", _module)
pulumi.runtime.registerResourceModule("aws", "route53/healthCheck", _module)
pulumi.runtime.registerResourceModule("aws", "route53/hostedZoneDnsSec", _module)
pulumi.runtime.registerResourceModule("aws", "route53/keySigningKey", _module)
pulumi.runtime.registerResourceModule("aws", "route53/queryLog", _module)
pulumi.runtime.registerResourceModule("aws", "route53/record", _module)
pulumi.runtime.registerResourceModule("aws", "route53/resolverDnsSecConfig", _module)
pulumi.runtime.registerResourceModule("aws", "route53/resolverEndpoint", _module)
pulumi.runtime.registerResourceModule("aws", "route53/resolverFirewallConfig", _module)
pulumi.runtime.registerResourceModule("aws", "route53/resolverFirewallDomainList", _module)
pulumi.runtime.registerResourceModule("aws", "route53/resolverFirewallRule", _module)
pulumi.runtime.registerResourceModule("aws", "route53/resolverFirewallRuleGroup", _module)
pulumi.runtime.registerResourceModule("aws", "route53/resolverFirewallRuleGroupAssociation", _module)
pulumi.runtime.registerResourceModule("aws", "route53/resolverQueryLogConfig", _module)
pulumi.runtime.registerResourceModule("aws", "route53/resolverQueryLogConfigAssociation", _module)
pulumi.runtime.registerResourceModule("aws", "route53/resolverRule", _module)
pulumi.runtime.registerResourceModule("aws", "route53/resolverRuleAssociation", _module)
pulumi.runtime.registerResourceModule("aws", "route53/trafficPolicy", _module)
pulumi.runtime.registerResourceModule("aws", "route53/trafficPolicyInstance", _module)
pulumi.runtime.registerResourceModule("aws", "route53/vpcAssociationAuthorization", _module)
pulumi.runtime.registerResourceModule("aws", "route53/zone", _module)
pulumi.runtime.registerResourceModule("aws", "route53/zoneAssociation", _module)
