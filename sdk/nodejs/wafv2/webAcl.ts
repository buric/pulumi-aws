// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Creates a WAFv2 Web ACL resource.
 *
 * ## Example Usage
 *
 * This resource is based on `aws.wafv2.RuleGroup`, check the documentation of the `aws.wafv2.RuleGroup` resource to see examples of the various available statements.
 * ### Managed Rule
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.wafv2.WebAcl("example", {
 *     defaultAction: {
 *         allow: {},
 *     },
 *     description: "Example of a managed rule.",
 *     rules: [{
 *         name: "rule-1",
 *         overrideAction: {
 *             count: {},
 *         },
 *         priority: 1,
 *         statement: {
 *             managedRuleGroupStatement: {
 *                 excludedRules: [
 *                     {
 *                         name: "SizeRestrictions_QUERYSTRING",
 *                     },
 *                     {
 *                         name: "NoUserAgent_HEADER",
 *                     },
 *                 ],
 *                 name: "AWSManagedRulesCommonRuleSet",
 *                 scopeDownStatement: {
 *                     geoMatchStatement: {
 *                         countryCodes: [
 *                             "US",
 *                             "NL",
 *                         ],
 *                     },
 *                 },
 *                 vendorName: "AWS",
 *             },
 *         },
 *         visibilityConfig: {
 *             cloudwatchMetricsEnabled: false,
 *             metricName: "friendly-rule-metric-name",
 *             sampledRequestsEnabled: false,
 *         },
 *     }],
 *     scope: "REGIONAL",
 *     tags: {
 *         Tag1: "Value1",
 *         Tag2: "Value2",
 *     },
 *     visibilityConfig: {
 *         cloudwatchMetricsEnabled: false,
 *         metricName: "friendly-metric-name",
 *         sampledRequestsEnabled: false,
 *     },
 * });
 * ```
 * ### Rate Based
 * Rate-limit US and NL-based clients to 10,000 requests for every 5 minutes.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.wafv2.WebAcl("example", {
 *     defaultAction: {
 *         allow: {},
 *     },
 *     description: "Example of a Cloudfront rate based statement.",
 *     rules: [{
 *         action: {
 *             block: {},
 *         },
 *         name: "rule-1",
 *         priority: 1,
 *         statement: {
 *             rateBasedStatement: {
 *                 aggregateKeyType: "IP",
 *                 limit: 10000,
 *                 scopeDownStatement: {
 *                     geoMatchStatement: {
 *                         countryCodes: [
 *                             "US",
 *                             "NL",
 *                         ],
 *                     },
 *                 },
 *             },
 *         },
 *         visibilityConfig: {
 *             cloudwatchMetricsEnabled: false,
 *             metricName: "friendly-rule-metric-name",
 *             sampledRequestsEnabled: false,
 *         },
 *     }],
 *     scope: "CLOUDFRONT",
 *     tags: {
 *         Tag1: "Value1",
 *         Tag2: "Value2",
 *     },
 *     visibilityConfig: {
 *         cloudwatchMetricsEnabled: false,
 *         metricName: "friendly-metric-name",
 *         sampledRequestsEnabled: false,
 *     },
 * });
 * ```
 * ### Rule Group Reference
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.wafv2.RuleGroup("example", {
 *     capacity: 10,
 *     scope: "REGIONAL",
 *     rules: [
 *         {
 *             name: "rule-1",
 *             priority: 1,
 *             action: {
 *                 count: {},
 *             },
 *             statement: {
 *                 geoMatchStatement: {
 *                     countryCodes: ["NL"],
 *                 },
 *             },
 *             visibilityConfig: {
 *                 cloudwatchMetricsEnabled: false,
 *                 metricName: "friendly-rule-metric-name",
 *                 sampledRequestsEnabled: false,
 *             },
 *         },
 *         {
 *             name: "rule-to-exclude-a",
 *             priority: 10,
 *             action: {
 *                 allow: {},
 *             },
 *             statement: {
 *                 geoMatchStatement: {
 *                     countryCodes: ["US"],
 *                 },
 *             },
 *             visibilityConfig: {
 *                 cloudwatchMetricsEnabled: false,
 *                 metricName: "friendly-rule-metric-name",
 *                 sampledRequestsEnabled: false,
 *             },
 *         },
 *         {
 *             name: "rule-to-exclude-b",
 *             priority: 15,
 *             action: {
 *                 allow: {},
 *             },
 *             statement: {
 *                 geoMatchStatement: {
 *                     countryCodes: ["GB"],
 *                 },
 *             },
 *             visibilityConfig: {
 *                 cloudwatchMetricsEnabled: false,
 *                 metricName: "friendly-rule-metric-name",
 *                 sampledRequestsEnabled: false,
 *             },
 *         },
 *     ],
 *     visibilityConfig: {
 *         cloudwatchMetricsEnabled: false,
 *         metricName: "friendly-metric-name",
 *         sampledRequestsEnabled: false,
 *     },
 * });
 * const test = new aws.wafv2.WebAcl("test", {
 *     scope: "REGIONAL",
 *     defaultAction: {
 *         block: {},
 *     },
 *     rules: [{
 *         name: "rule-1",
 *         priority: 1,
 *         overrideAction: {
 *             count: {},
 *         },
 *         statement: {
 *             ruleGroupReferenceStatement: {
 *                 arn: example.arn,
 *                 excludedRules: [
 *                     {
 *                         name: "rule-to-exclude-b",
 *                     },
 *                     {
 *                         name: "rule-to-exclude-a",
 *                     },
 *                 ],
 *             },
 *         },
 *         visibilityConfig: {
 *             cloudwatchMetricsEnabled: false,
 *             metricName: "friendly-rule-metric-name",
 *             sampledRequestsEnabled: false,
 *         },
 *     }],
 *     tags: {
 *         Tag1: "Value1",
 *         Tag2: "Value2",
 *     },
 *     visibilityConfig: {
 *         cloudwatchMetricsEnabled: false,
 *         metricName: "friendly-metric-name",
 *         sampledRequestsEnabled: false,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * WAFv2 Web ACLs can be imported using `ID/Name/Scope` e.g.,
 *
 * ```sh
 *  $ pulumi import aws:wafv2/webAcl:WebAcl example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc/example/REGIONAL
 * ```
 */
export class WebAcl extends pulumi.CustomResource {
    /**
     * Get an existing WebAcl resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WebAclState, opts?: pulumi.CustomResourceOptions): WebAcl {
        return new WebAcl(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:wafv2/webAcl:WebAcl';

    /**
     * Returns true if the given object is an instance of WebAcl.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WebAcl {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WebAcl.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Web ACL capacity units (WCUs) currently being used by this web ACL.
     */
    public /*out*/ readonly capacity!: pulumi.Output<number>;
    /**
     * Defines custom response bodies that can be referenced by `customResponse` actions. See Custom Response Body below for details.
     */
    public readonly customResponseBodies!: pulumi.Output<outputs.wafv2.WebAclCustomResponseBody[] | undefined>;
    /**
     * Action to perform if none of the `rules` contained in the WebACL match. See Default Action below for details.
     */
    public readonly defaultAction!: pulumi.Output<outputs.wafv2.WebAclDefaultAction>;
    /**
     * Friendly description of the WebACL.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    public /*out*/ readonly lockToken!: pulumi.Output<string>;
    /**
     * Label string.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
     */
    public readonly rules!: pulumi.Output<outputs.wafv2.WebAclRule[] | undefined>;
    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     */
    public readonly scope!: pulumi.Output<string>;
    /**
     * Map of key-value pairs to associate with the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     */
    public readonly visibilityConfig!: pulumi.Output<outputs.wafv2.WebAclVisibilityConfig>;

    /**
     * Create a WebAcl resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WebAclArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WebAclArgs | WebAclState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WebAclState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["capacity"] = state ? state.capacity : undefined;
            resourceInputs["customResponseBodies"] = state ? state.customResponseBodies : undefined;
            resourceInputs["defaultAction"] = state ? state.defaultAction : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["lockToken"] = state ? state.lockToken : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
            resourceInputs["scope"] = state ? state.scope : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["visibilityConfig"] = state ? state.visibilityConfig : undefined;
        } else {
            const args = argsOrState as WebAclArgs | undefined;
            if ((!args || args.defaultAction === undefined) && !opts.urn) {
                throw new Error("Missing required property 'defaultAction'");
            }
            if ((!args || args.scope === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scope'");
            }
            if ((!args || args.visibilityConfig === undefined) && !opts.urn) {
                throw new Error("Missing required property 'visibilityConfig'");
            }
            resourceInputs["customResponseBodies"] = args ? args.customResponseBodies : undefined;
            resourceInputs["defaultAction"] = args ? args.defaultAction : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
            resourceInputs["scope"] = args ? args.scope : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["visibilityConfig"] = args ? args.visibilityConfig : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["capacity"] = undefined /*out*/;
            resourceInputs["lockToken"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WebAcl.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WebAcl resources.
 */
export interface WebAclState {
    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     */
    arn?: pulumi.Input<string>;
    /**
     * Web ACL capacity units (WCUs) currently being used by this web ACL.
     */
    capacity?: pulumi.Input<number>;
    /**
     * Defines custom response bodies that can be referenced by `customResponse` actions. See Custom Response Body below for details.
     */
    customResponseBodies?: pulumi.Input<pulumi.Input<inputs.wafv2.WebAclCustomResponseBody>[]>;
    /**
     * Action to perform if none of the `rules` contained in the WebACL match. See Default Action below for details.
     */
    defaultAction?: pulumi.Input<inputs.wafv2.WebAclDefaultAction>;
    /**
     * Friendly description of the WebACL.
     */
    description?: pulumi.Input<string>;
    lockToken?: pulumi.Input<string>;
    /**
     * Label string.
     */
    name?: pulumi.Input<string>;
    /**
     * Rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.wafv2.WebAclRule>[]>;
    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     */
    scope?: pulumi.Input<string>;
    /**
     * Map of key-value pairs to associate with the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     */
    visibilityConfig?: pulumi.Input<inputs.wafv2.WebAclVisibilityConfig>;
}

/**
 * The set of arguments for constructing a WebAcl resource.
 */
export interface WebAclArgs {
    /**
     * Defines custom response bodies that can be referenced by `customResponse` actions. See Custom Response Body below for details.
     */
    customResponseBodies?: pulumi.Input<pulumi.Input<inputs.wafv2.WebAclCustomResponseBody>[]>;
    /**
     * Action to perform if none of the `rules` contained in the WebACL match. See Default Action below for details.
     */
    defaultAction: pulumi.Input<inputs.wafv2.WebAclDefaultAction>;
    /**
     * Friendly description of the WebACL.
     */
    description?: pulumi.Input<string>;
    /**
     * Label string.
     */
    name?: pulumi.Input<string>;
    /**
     * Rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.wafv2.WebAclRule>[]>;
    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     */
    scope: pulumi.Input<string>;
    /**
     * Map of key-value pairs to associate with the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     */
    visibilityConfig: pulumi.Input<inputs.wafv2.WebAclVisibilityConfig>;
}
