// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * The CodeArtifact Authorization Token data source generates a temporary authentication token for accessing repositories in a CodeArtifact domain.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.codeartifact.getAuthorizationToken({
 *     domain: aws_codeartifact_domain.test.domain,
 * });
 * ```
 */
export function getAuthorizationToken(args: GetAuthorizationTokenArgs, opts?: pulumi.InvokeOptions): Promise<GetAuthorizationTokenResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:codeartifact/getAuthorizationToken:getAuthorizationToken", {
        "domain": args.domain,
        "domainOwner": args.domainOwner,
        "durationSeconds": args.durationSeconds,
    }, opts);
}

/**
 * A collection of arguments for invoking getAuthorizationToken.
 */
export interface GetAuthorizationTokenArgs {
    /**
     * The name of the domain that is in scope for the generated authorization token.
     */
    domain: string;
    /**
     * The account number of the AWS account that owns the domain.
     */
    domainOwner?: string;
    /**
     * The time, in seconds, that the generated authorization token is valid. Valid values are `0` and between `900` and `43200`.
     */
    durationSeconds?: number;
}

/**
 * A collection of values returned by getAuthorizationToken.
 */
export interface GetAuthorizationTokenResult {
    /**
     * Temporary authorization token.
     */
    readonly authorizationToken: string;
    readonly domain: string;
    readonly domainOwner: string;
    readonly durationSeconds?: number;
    /**
     * The time in UTC RFC3339 format when the authorization token expires.
     */
    readonly expiration: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}

export function getAuthorizationTokenOutput(args: GetAuthorizationTokenOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAuthorizationTokenResult> {
    return pulumi.output(args).apply(a => getAuthorizationToken(a, opts))
}

/**
 * A collection of arguments for invoking getAuthorizationToken.
 */
export interface GetAuthorizationTokenOutputArgs {
    /**
     * The name of the domain that is in scope for the generated authorization token.
     */
    domain: pulumi.Input<string>;
    /**
     * The account number of the AWS account that owns the domain.
     */
    domainOwner?: pulumi.Input<string>;
    /**
     * The time, in seconds, that the generated authorization token is valid. Valid values are `0` and between `900` and `43200`.
     */
    durationSeconds?: pulumi.Input<number>;
}
