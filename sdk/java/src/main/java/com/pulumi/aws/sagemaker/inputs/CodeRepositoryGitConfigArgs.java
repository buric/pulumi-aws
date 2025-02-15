// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CodeRepositoryGitConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CodeRepositoryGitConfigArgs Empty = new CodeRepositoryGitConfigArgs();

    /**
     * The default branch for the Git repository.
     * 
     */
    @Import(name="branch")
    private @Nullable Output<String> branch;

    /**
     * @return The default branch for the Git repository.
     * 
     */
    public Optional<Output<String>> branch() {
        return Optional.ofNullable(this.branch);
    }

    /**
     * The URL where the Git repository is located.
     * 
     */
    @Import(name="repositoryUrl", required=true)
    private Output<String> repositoryUrl;

    /**
     * @return The URL where the Git repository is located.
     * 
     */
    public Output<String> repositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format: `{&#34;username&#34;: UserName, &#34;password&#34;: Password}`
     * 
     */
    @Import(name="secretArn")
    private @Nullable Output<String> secretArn;

    /**
     * @return The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format: `{&#34;username&#34;: UserName, &#34;password&#34;: Password}`
     * 
     */
    public Optional<Output<String>> secretArn() {
        return Optional.ofNullable(this.secretArn);
    }

    private CodeRepositoryGitConfigArgs() {}

    private CodeRepositoryGitConfigArgs(CodeRepositoryGitConfigArgs $) {
        this.branch = $.branch;
        this.repositoryUrl = $.repositoryUrl;
        this.secretArn = $.secretArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CodeRepositoryGitConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CodeRepositoryGitConfigArgs $;

        public Builder() {
            $ = new CodeRepositoryGitConfigArgs();
        }

        public Builder(CodeRepositoryGitConfigArgs defaults) {
            $ = new CodeRepositoryGitConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param branch The default branch for the Git repository.
         * 
         * @return builder
         * 
         */
        public Builder branch(@Nullable Output<String> branch) {
            $.branch = branch;
            return this;
        }

        /**
         * @param branch The default branch for the Git repository.
         * 
         * @return builder
         * 
         */
        public Builder branch(String branch) {
            return branch(Output.of(branch));
        }

        /**
         * @param repositoryUrl The URL where the Git repository is located.
         * 
         * @return builder
         * 
         */
        public Builder repositoryUrl(Output<String> repositoryUrl) {
            $.repositoryUrl = repositoryUrl;
            return this;
        }

        /**
         * @param repositoryUrl The URL where the Git repository is located.
         * 
         * @return builder
         * 
         */
        public Builder repositoryUrl(String repositoryUrl) {
            return repositoryUrl(Output.of(repositoryUrl));
        }

        /**
         * @param secretArn The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format: `{&#34;username&#34;: UserName, &#34;password&#34;: Password}`
         * 
         * @return builder
         * 
         */
        public Builder secretArn(@Nullable Output<String> secretArn) {
            $.secretArn = secretArn;
            return this;
        }

        /**
         * @param secretArn The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format: `{&#34;username&#34;: UserName, &#34;password&#34;: Password}`
         * 
         * @return builder
         * 
         */
        public Builder secretArn(String secretArn) {
            return secretArn(Output.of(secretArn));
        }

        public CodeRepositoryGitConfigArgs build() {
            $.repositoryUrl = Objects.requireNonNull($.repositoryUrl, "expected parameter 'repositoryUrl' to be non-null");
            return $;
        }
    }

}
