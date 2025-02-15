// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Retrieves the summary of a WAFv2 Regex Pattern Set.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = pulumi.output(aws.wafv2.getRegexPatternSet({
 *     name: "some-regex-pattern-set",
 *     scope: "REGIONAL",
 * }));
 * ```
 */
export function getRegexPatternSet(args: GetRegexPatternSetArgs, opts?: pulumi.InvokeOptions): Promise<GetRegexPatternSetResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:wafv2/getRegexPatternSet:getRegexPatternSet", {
        "name": args.name,
        "scope": args.scope,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegexPatternSet.
 */
export interface GetRegexPatternSetArgs {
    /**
     * The name of the WAFv2 Regex Pattern Set.
     */
    name: string;
    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     */
    scope: string;
}

/**
 * A collection of values returned by getRegexPatternSet.
 */
export interface GetRegexPatternSetResult {
    /**
     * The Amazon Resource Name (ARN) of the entity.
     */
    readonly arn: string;
    /**
     * The description of the set that helps with identification.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * One or more blocks of regular expression patterns that AWS WAF is searching for. See Regular Expression below for details.
     */
    readonly regularExpressions: outputs.wafv2.GetRegexPatternSetRegularExpression[];
    readonly scope: string;
}

export function getRegexPatternSetOutput(args: GetRegexPatternSetOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRegexPatternSetResult> {
    return pulumi.output(args).apply(a => getRegexPatternSet(a, opts))
}

/**
 * A collection of arguments for invoking getRegexPatternSet.
 */
export interface GetRegexPatternSetOutputArgs {
    /**
     * The name of the WAFv2 Regex Pattern Set.
     */
    name: pulumi.Input<string>;
    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     */
    scope: pulumi.Input<string>;
}
