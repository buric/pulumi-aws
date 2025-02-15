// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ecr.RegistryPolicyArgs;
import com.pulumi.aws.ecr.inputs.RegistryPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Elastic Container Registry Policy.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ECR Registry Policy can be imported using the registry id, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ecr/registryPolicy:RegistryPolicy example 123456789012
 * ```
 * 
 */
@ResourceType(type="aws:ecr/registryPolicy:RegistryPolicy")
public class RegistryPolicy extends com.pulumi.resources.CustomResource {
    @Export(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    public Output<String> policy() {
        return this.policy;
    }
    /**
     * The registry ID where the registry was created.
     * 
     */
    @Export(name="registryId", type=String.class, parameters={})
    private Output<String> registryId;

    /**
     * @return The registry ID where the registry was created.
     * 
     */
    public Output<String> registryId() {
        return this.registryId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegistryPolicy(String name) {
        this(name, RegistryPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegistryPolicy(String name, RegistryPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegistryPolicy(String name, RegistryPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecr/registryPolicy:RegistryPolicy", name, args == null ? RegistryPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegistryPolicy(String name, Output<String> id, @Nullable RegistryPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecr/registryPolicy:RegistryPolicy", name, state, makeResourceOptions(options, id));
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
    public static RegistryPolicy get(String name, Output<String> id, @Nullable RegistryPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegistryPolicy(name, id, state, options);
    }
}
