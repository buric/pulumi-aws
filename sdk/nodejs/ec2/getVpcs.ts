// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * This resource can be useful for getting back a list of VPC Ids for a region.
 *
 * The following example retrieves a list of VPC Ids with a custom tag of `service` set to a value of "production".
 */
export function getVpcs(args?: GetVpcsArgs, opts?: pulumi.InvokeOptions): Promise<GetVpcsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:ec2/getVpcs:getVpcs", {
        "filters": args.filters,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpcs.
 */
export interface GetVpcsArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: inputs.ec2.GetVpcsFilter[];
    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired vpcs.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getVpcs.
 */
export interface GetVpcsResult {
    readonly filters?: outputs.ec2.GetVpcsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of all the VPC Ids found.
     */
    readonly ids: string[];
    readonly tags: {[key: string]: string};
}

export function getVpcsOutput(args?: GetVpcsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVpcsResult> {
    return pulumi.output(args).apply(a => getVpcs(a, opts))
}

/**
 * A collection of arguments for invoking getVpcs.
 */
export interface GetVpcsOutputArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2.GetVpcsFilterArgs>[]>;
    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired vpcs.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
