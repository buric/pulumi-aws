// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.guardduty.PublishingDestinationArgs;
import com.pulumi.aws.guardduty.inputs.PublishingDestinationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage a GuardDuty PublishingDestination. Requires an existing GuardDuty Detector.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * GuardDuty PublishingDestination can be imported using the the master GuardDuty detector ID and PublishingDestinationID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:guardduty/publishingDestination:PublishingDestination test a4b86f26fa42e7e7cf0d1c333ea77777:a4b86f27a0e464e4a7e0516d242f1234
 * ```
 * 
 */
@ResourceType(type="aws:guardduty/publishingDestination:PublishingDestination")
public class PublishingDestination extends com.pulumi.resources.CustomResource {
    /**
     * The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
     * 
     */
    @Export(name="destinationArn", type=String.class, parameters={})
    private Output<String> destinationArn;

    /**
     * @return The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
     * 
     */
    public Output<String> destinationArn() {
        return this.destinationArn;
    }
    /**
     * Currently there is only &#34;S3&#34; available as destination type which is also the default value
     * 
     */
    @Export(name="destinationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> destinationType;

    /**
     * @return Currently there is only &#34;S3&#34; available as destination type which is also the default value
     * 
     */
    public Output<Optional<String>> destinationType() {
        return Codegen.optional(this.destinationType);
    }
    /**
     * The detector ID of the GuardDuty.
     * 
     */
    @Export(name="detectorId", type=String.class, parameters={})
    private Output<String> detectorId;

    /**
     * @return The detector ID of the GuardDuty.
     * 
     */
    public Output<String> detectorId() {
        return this.detectorId;
    }
    /**
     * The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
     * 
     */
    @Export(name="kmsKeyArn", type=String.class, parameters={})
    private Output<String> kmsKeyArn;

    /**
     * @return The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
     * 
     */
    public Output<String> kmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PublishingDestination(String name) {
        this(name, PublishingDestinationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PublishingDestination(String name, PublishingDestinationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PublishingDestination(String name, PublishingDestinationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/publishingDestination:PublishingDestination", name, args == null ? PublishingDestinationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PublishingDestination(String name, Output<String> id, @Nullable PublishingDestinationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/publishingDestination:PublishingDestination", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PublishingDestination get(String name, Output<String> id, @Nullable PublishingDestinationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PublishingDestination(name, id, state, options);
    }
}
