// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Generate a random password.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = pulumi.output(aws.secretsmanager.getRandomPassword({
 *     excludeNumbers: true,
 *     passwordLength: 50,
 * }));
 * ```
 */
export function getRandomPassword(args?: GetRandomPasswordArgs, opts?: pulumi.InvokeOptions): Promise<GetRandomPasswordResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:secretsmanager/getRandomPassword:getRandomPassword", {
        "excludeCharacters": args.excludeCharacters,
        "excludeLowercase": args.excludeLowercase,
        "excludeNumbers": args.excludeNumbers,
        "excludePunctuation": args.excludePunctuation,
        "excludeUppercase": args.excludeUppercase,
        "includeSpace": args.includeSpace,
        "passwordLength": args.passwordLength,
        "randomPassword": args.randomPassword,
        "requireEachIncludedType": args.requireEachIncludedType,
    }, opts);
}

/**
 * A collection of arguments for invoking getRandomPassword.
 */
export interface GetRandomPasswordArgs {
    /**
     * A string of the characters that you don't want in the password.
     */
    excludeCharacters?: string;
    /**
     * Specifies whether to exclude lowercase letters from the password.
     */
    excludeLowercase?: boolean;
    /**
     * Specifies whether to exclude numbers from the password.
     */
    excludeNumbers?: boolean;
    /**
     * Specifies whether to exclude the following punctuation characters from the password: ``! " # $ % & ' ( ) * + , - . / : ; < = > ? @ [ \ ] ^ _ ` { | } ~ .``
     */
    excludePunctuation?: boolean;
    /**
     * Specifies whether to exclude uppercase letters from the password.
     */
    excludeUppercase?: boolean;
    /**
     * Specifies whether to include the space character.
     */
    includeSpace?: boolean;
    /**
     * The length of the password.
     */
    passwordLength?: number;
    /**
     * The random password.
     */
    randomPassword?: string;
    /**
     * Specifies whether to include at least one upper and lowercase letter, one number, and one punctuation.
     */
    requireEachIncludedType?: boolean;
}

/**
 * A collection of values returned by getRandomPassword.
 */
export interface GetRandomPasswordResult {
    readonly excludeCharacters?: string;
    readonly excludeLowercase?: boolean;
    readonly excludeNumbers?: boolean;
    readonly excludePunctuation?: boolean;
    readonly excludeUppercase?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly includeSpace?: boolean;
    readonly passwordLength?: number;
    /**
     * The random password.
     */
    readonly randomPassword: string;
    readonly requireEachIncludedType?: boolean;
}

export function getRandomPasswordOutput(args?: GetRandomPasswordOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRandomPasswordResult> {
    return pulumi.output(args).apply(a => getRandomPassword(a, opts))
}

/**
 * A collection of arguments for invoking getRandomPassword.
 */
export interface GetRandomPasswordOutputArgs {
    /**
     * A string of the characters that you don't want in the password.
     */
    excludeCharacters?: pulumi.Input<string>;
    /**
     * Specifies whether to exclude lowercase letters from the password.
     */
    excludeLowercase?: pulumi.Input<boolean>;
    /**
     * Specifies whether to exclude numbers from the password.
     */
    excludeNumbers?: pulumi.Input<boolean>;
    /**
     * Specifies whether to exclude the following punctuation characters from the password: ``! " # $ % & ' ( ) * + , - . / : ; < = > ? @ [ \ ] ^ _ ` { | } ~ .``
     */
    excludePunctuation?: pulumi.Input<boolean>;
    /**
     * Specifies whether to exclude uppercase letters from the password.
     */
    excludeUppercase?: pulumi.Input<boolean>;
    /**
     * Specifies whether to include the space character.
     */
    includeSpace?: pulumi.Input<boolean>;
    /**
     * The length of the password.
     */
    passwordLength?: pulumi.Input<number>;
    /**
     * The random password.
     */
    randomPassword?: pulumi.Input<string>;
    /**
     * Specifies whether to include at least one upper and lowercase letter, one number, and one punctuation.
     */
    requireEachIncludedType?: pulumi.Input<boolean>;
}
