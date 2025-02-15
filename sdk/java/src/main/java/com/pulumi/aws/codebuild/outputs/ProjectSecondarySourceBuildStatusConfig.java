// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectSecondarySourceBuildStatusConfig {
    /**
     * @return Specifies the context of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
     * 
     */
    private final @Nullable String context;
    /**
     * @return Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
     * 
     */
    private final @Nullable String targetUrl;

    @CustomType.Constructor
    private ProjectSecondarySourceBuildStatusConfig(
        @CustomType.Parameter("context") @Nullable String context,
        @CustomType.Parameter("targetUrl") @Nullable String targetUrl) {
        this.context = context;
        this.targetUrl = targetUrl;
    }

    /**
     * @return Specifies the context of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
     * 
     */
    public Optional<String> context() {
        return Optional.ofNullable(this.context);
    }
    /**
     * @return Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
     * 
     */
    public Optional<String> targetUrl() {
        return Optional.ofNullable(this.targetUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSecondarySourceBuildStatusConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String context;
        private @Nullable String targetUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSecondarySourceBuildStatusConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.targetUrl = defaults.targetUrl;
        }

        public Builder context(@Nullable String context) {
            this.context = context;
            return this;
        }
        public Builder targetUrl(@Nullable String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }        public ProjectSecondarySourceBuildStatusConfig build() {
            return new ProjectSecondarySourceBuildStatusConfig(context, targetUrl);
        }
    }
}
