// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupLaunchTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupLaunchTemplateArgs Empty = new GroupLaunchTemplateArgs();

    /**
     * The ID of the launch template. Conflicts with `name`.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the launch template. Conflicts with `name`.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the Auto Scaling Group. By default generated by this provider. Conflicts with `name_prefix`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Auto Scaling Group. By default generated by this provider. Conflicts with `name_prefix`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Template version. Can be version number, `$Latest`, or `$Default`. (Default: `$Default`).
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Template version. Can be version number, `$Latest`, or `$Default`. (Default: `$Default`).
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private GroupLaunchTemplateArgs() {}

    private GroupLaunchTemplateArgs(GroupLaunchTemplateArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupLaunchTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupLaunchTemplateArgs $;

        public Builder() {
            $ = new GroupLaunchTemplateArgs();
        }

        public Builder(GroupLaunchTemplateArgs defaults) {
            $ = new GroupLaunchTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the launch template. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the launch template. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the Auto Scaling Group. By default generated by this provider. Conflicts with `name_prefix`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Auto Scaling Group. By default generated by this provider. Conflicts with `name_prefix`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param version Template version. Can be version number, `$Latest`, or `$Default`. (Default: `$Default`).
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Template version. Can be version number, `$Latest`, or `$Default`. (Default: `$Default`).
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public GroupLaunchTemplateArgs build() {
            return $;
        }
    }

}
