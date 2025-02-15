// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectEnvironmentEnvironmentVariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectEnvironmentEnvironmentVariableArgs Empty = new ProjectEnvironmentEnvironmentVariableArgs();

    /**
     * Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Environment variable&#39;s value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Environment variable&#39;s value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private ProjectEnvironmentEnvironmentVariableArgs() {}

    private ProjectEnvironmentEnvironmentVariableArgs(ProjectEnvironmentEnvironmentVariableArgs $) {
        this.name = $.name;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectEnvironmentEnvironmentVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectEnvironmentEnvironmentVariableArgs $;

        public Builder() {
            $ = new ProjectEnvironmentEnvironmentVariableArgs();
        }

        public Builder(ProjectEnvironmentEnvironmentVariableArgs defaults) {
            $ = new ProjectEnvironmentEnvironmentVariableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value Environment variable&#39;s value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Environment variable&#39;s value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ProjectEnvironmentEnvironmentVariableArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
