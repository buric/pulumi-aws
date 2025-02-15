// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codepipeline.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineStageAction {
    /**
     * @return A category defines what kind of action can be taken in the stage, and constrains the provider type for the action. Possible values are `Approval`, `Build`, `Deploy`, `Invoke`, `Source` and `Test`.
     * 
     */
    private final String category;
    /**
     * @return A map of the action declaration&#39;s configuration. Configurations options for action types and providers can be found in the [Pipeline Structure Reference](http://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements) and [Action Structure Reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) documentation.
     * 
     */
    private final @Nullable Map<String,String> configuration;
    /**
     * @return A list of artifact names to be worked on.
     * 
     */
    private final @Nullable List<String> inputArtifacts;
    /**
     * @return The action declaration&#39;s name.
     * 
     */
    private final String name;
    /**
     * @return The namespace all output variables will be accessed from.
     * 
     */
    private final @Nullable String namespace;
    /**
     * @return A list of artifact names to output. Output artifact names must be unique within a pipeline.
     * 
     */
    private final @Nullable List<String> outputArtifacts;
    /**
     * @return The creator of the action being called. Possible values are `AWS`, `Custom` and `ThirdParty`.
     * 
     */
    private final String owner;
    /**
     * @return The provider of the service being called by the action. Valid providers are determined by the action category. Provider names are listed in the [Action Structure Reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) documentation.
     * 
     */
    private final String provider;
    /**
     * @return The region in which to run the action.
     * 
     */
    private final @Nullable String region;
    /**
     * @return The ARN of the IAM service role that will perform the declared action. This is assumed through the roleArn for the pipeline.
     * 
     */
    private final @Nullable String roleArn;
    /**
     * @return The order in which actions are run.
     * 
     */
    private final @Nullable Integer runOrder;
    /**
     * @return A string that identifies the action type.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private PipelineStageAction(
        @CustomType.Parameter("category") String category,
        @CustomType.Parameter("configuration") @Nullable Map<String,String> configuration,
        @CustomType.Parameter("inputArtifacts") @Nullable List<String> inputArtifacts,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespace") @Nullable String namespace,
        @CustomType.Parameter("outputArtifacts") @Nullable List<String> outputArtifacts,
        @CustomType.Parameter("owner") String owner,
        @CustomType.Parameter("provider") String provider,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("roleArn") @Nullable String roleArn,
        @CustomType.Parameter("runOrder") @Nullable Integer runOrder,
        @CustomType.Parameter("version") String version) {
        this.category = category;
        this.configuration = configuration;
        this.inputArtifacts = inputArtifacts;
        this.name = name;
        this.namespace = namespace;
        this.outputArtifacts = outputArtifacts;
        this.owner = owner;
        this.provider = provider;
        this.region = region;
        this.roleArn = roleArn;
        this.runOrder = runOrder;
        this.version = version;
    }

    /**
     * @return A category defines what kind of action can be taken in the stage, and constrains the provider type for the action. Possible values are `Approval`, `Build`, `Deploy`, `Invoke`, `Source` and `Test`.
     * 
     */
    public String category() {
        return this.category;
    }
    /**
     * @return A map of the action declaration&#39;s configuration. Configurations options for action types and providers can be found in the [Pipeline Structure Reference](http://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements) and [Action Structure Reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) documentation.
     * 
     */
    public Map<String,String> configuration() {
        return this.configuration == null ? Map.of() : this.configuration;
    }
    /**
     * @return A list of artifact names to be worked on.
     * 
     */
    public List<String> inputArtifacts() {
        return this.inputArtifacts == null ? List.of() : this.inputArtifacts;
    }
    /**
     * @return The action declaration&#39;s name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The namespace all output variables will be accessed from.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return A list of artifact names to output. Output artifact names must be unique within a pipeline.
     * 
     */
    public List<String> outputArtifacts() {
        return this.outputArtifacts == null ? List.of() : this.outputArtifacts;
    }
    /**
     * @return The creator of the action being called. Possible values are `AWS`, `Custom` and `ThirdParty`.
     * 
     */
    public String owner() {
        return this.owner;
    }
    /**
     * @return The provider of the service being called by the action. Valid providers are determined by the action category. Provider names are listed in the [Action Structure Reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) documentation.
     * 
     */
    public String provider() {
        return this.provider;
    }
    /**
     * @return The region in which to run the action.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return The ARN of the IAM service role that will perform the declared action. This is assumed through the roleArn for the pipeline.
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * @return The order in which actions are run.
     * 
     */
    public Optional<Integer> runOrder() {
        return Optional.ofNullable(this.runOrder);
    }
    /**
     * @return A string that identifies the action type.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineStageAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String category;
        private @Nullable Map<String,String> configuration;
        private @Nullable List<String> inputArtifacts;
        private String name;
        private @Nullable String namespace;
        private @Nullable List<String> outputArtifacts;
        private String owner;
        private String provider;
        private @Nullable String region;
        private @Nullable String roleArn;
        private @Nullable Integer runOrder;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineStageAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.configuration = defaults.configuration;
    	      this.inputArtifacts = defaults.inputArtifacts;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.outputArtifacts = defaults.outputArtifacts;
    	      this.owner = defaults.owner;
    	      this.provider = defaults.provider;
    	      this.region = defaults.region;
    	      this.roleArn = defaults.roleArn;
    	      this.runOrder = defaults.runOrder;
    	      this.version = defaults.version;
        }

        public Builder category(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }
        public Builder configuration(@Nullable Map<String,String> configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder inputArtifacts(@Nullable List<String> inputArtifacts) {
            this.inputArtifacts = inputArtifacts;
            return this;
        }
        public Builder inputArtifacts(String... inputArtifacts) {
            return inputArtifacts(List.of(inputArtifacts));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder outputArtifacts(@Nullable List<String> outputArtifacts) {
            this.outputArtifacts = outputArtifacts;
            return this;
        }
        public Builder outputArtifacts(String... outputArtifacts) {
            return outputArtifacts(List.of(outputArtifacts));
        }
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        public Builder provider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder runOrder(@Nullable Integer runOrder) {
            this.runOrder = runOrder;
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public PipelineStageAction build() {
            return new PipelineStageAction(category, configuration, inputArtifacts, name, namespace, outputArtifacts, owner, provider, region, roleArn, runOrder, version);
        }
    }
}
