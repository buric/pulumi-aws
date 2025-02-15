// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.inputs;

import com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs;
import com.pulumi.aws.appsync.inputs.GraphQLApiLambdaAuthorizerConfigArgs;
import com.pulumi.aws.appsync.inputs.GraphQLApiLogConfigArgs;
import com.pulumi.aws.appsync.inputs.GraphQLApiOpenidConnectConfigArgs;
import com.pulumi.aws.appsync.inputs.GraphQLApiUserPoolConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GraphQLApiState extends com.pulumi.resources.ResourceArgs {

    public static final GraphQLApiState Empty = new GraphQLApiState();

    /**
     * One or more additional authentication providers for the GraphqlApi. Defined below.
     * 
     */
    @Import(name="additionalAuthenticationProviders")
    private @Nullable Output<List<GraphQLApiAdditionalAuthenticationProviderArgs>> additionalAuthenticationProviders;

    /**
     * @return One or more additional authentication providers for the GraphqlApi. Defined below.
     * 
     */
    public Optional<Output<List<GraphQLApiAdditionalAuthenticationProviderArgs>>> additionalAuthenticationProviders() {
        return Optional.ofNullable(this.additionalAuthenticationProviders);
    }

    /**
     * The ARN
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
     * 
     */
    @Import(name="authenticationType")
    private @Nullable Output<String> authenticationType;

    /**
     * @return The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
     * 
     */
    public Optional<Output<String>> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    /**
     * Nested argument containing Lambda authorizer configuration. Defined below.
     * 
     */
    @Import(name="lambdaAuthorizerConfig")
    private @Nullable Output<GraphQLApiLambdaAuthorizerConfigArgs> lambdaAuthorizerConfig;

    /**
     * @return Nested argument containing Lambda authorizer configuration. Defined below.
     * 
     */
    public Optional<Output<GraphQLApiLambdaAuthorizerConfigArgs>> lambdaAuthorizerConfig() {
        return Optional.ofNullable(this.lambdaAuthorizerConfig);
    }

    /**
     * Nested argument containing logging configuration. Defined below.
     * 
     */
    @Import(name="logConfig")
    private @Nullable Output<GraphQLApiLogConfigArgs> logConfig;

    /**
     * @return Nested argument containing logging configuration. Defined below.
     * 
     */
    public Optional<Output<GraphQLApiLogConfigArgs>> logConfig() {
        return Optional.ofNullable(this.logConfig);
    }

    /**
     * A user-supplied name for the GraphqlApi.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A user-supplied name for the GraphqlApi.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Nested argument containing OpenID Connect configuration. Defined below.
     * 
     */
    @Import(name="openidConnectConfig")
    private @Nullable Output<GraphQLApiOpenidConnectConfigArgs> openidConnectConfig;

    /**
     * @return Nested argument containing OpenID Connect configuration. Defined below.
     * 
     */
    public Optional<Output<GraphQLApiOpenidConnectConfigArgs>> openidConnectConfig() {
        return Optional.ofNullable(this.openidConnectConfig);
    }

    /**
     * The schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Map of URIs associated with the APIE.g., `uris[&#34;GRAPHQL&#34;] = https://ID.appsync-api.REGION.amazonaws.com/graphql`
     * 
     */
    @Import(name="uris")
    private @Nullable Output<Map<String,String>> uris;

    /**
     * @return Map of URIs associated with the APIE.g., `uris[&#34;GRAPHQL&#34;] = https://ID.appsync-api.REGION.amazonaws.com/graphql`
     * 
     */
    public Optional<Output<Map<String,String>>> uris() {
        return Optional.ofNullable(this.uris);
    }

    /**
     * The Amazon Cognito User Pool configuration. Defined below.
     * 
     */
    @Import(name="userPoolConfig")
    private @Nullable Output<GraphQLApiUserPoolConfigArgs> userPoolConfig;

    /**
     * @return The Amazon Cognito User Pool configuration. Defined below.
     * 
     */
    public Optional<Output<GraphQLApiUserPoolConfigArgs>> userPoolConfig() {
        return Optional.ofNullable(this.userPoolConfig);
    }

    /**
     * Whether tracing with X-ray is enabled. Defaults to false.
     * 
     */
    @Import(name="xrayEnabled")
    private @Nullable Output<Boolean> xrayEnabled;

    /**
     * @return Whether tracing with X-ray is enabled. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> xrayEnabled() {
        return Optional.ofNullable(this.xrayEnabled);
    }

    private GraphQLApiState() {}

    private GraphQLApiState(GraphQLApiState $) {
        this.additionalAuthenticationProviders = $.additionalAuthenticationProviders;
        this.arn = $.arn;
        this.authenticationType = $.authenticationType;
        this.lambdaAuthorizerConfig = $.lambdaAuthorizerConfig;
        this.logConfig = $.logConfig;
        this.name = $.name;
        this.openidConnectConfig = $.openidConnectConfig;
        this.schema = $.schema;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.uris = $.uris;
        this.userPoolConfig = $.userPoolConfig;
        this.xrayEnabled = $.xrayEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GraphQLApiState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GraphQLApiState $;

        public Builder() {
            $ = new GraphQLApiState();
        }

        public Builder(GraphQLApiState defaults) {
            $ = new GraphQLApiState(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalAuthenticationProviders One or more additional authentication providers for the GraphqlApi. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder additionalAuthenticationProviders(@Nullable Output<List<GraphQLApiAdditionalAuthenticationProviderArgs>> additionalAuthenticationProviders) {
            $.additionalAuthenticationProviders = additionalAuthenticationProviders;
            return this;
        }

        /**
         * @param additionalAuthenticationProviders One or more additional authentication providers for the GraphqlApi. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder additionalAuthenticationProviders(List<GraphQLApiAdditionalAuthenticationProviderArgs> additionalAuthenticationProviders) {
            return additionalAuthenticationProviders(Output.of(additionalAuthenticationProviders));
        }

        /**
         * @param additionalAuthenticationProviders One or more additional authentication providers for the GraphqlApi. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder additionalAuthenticationProviders(GraphQLApiAdditionalAuthenticationProviderArgs... additionalAuthenticationProviders) {
            return additionalAuthenticationProviders(List.of(additionalAuthenticationProviders));
        }

        /**
         * @param arn The ARN
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param authenticationType The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(@Nullable Output<String> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param authenticationType The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(String authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        /**
         * @param lambdaAuthorizerConfig Nested argument containing Lambda authorizer configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder lambdaAuthorizerConfig(@Nullable Output<GraphQLApiLambdaAuthorizerConfigArgs> lambdaAuthorizerConfig) {
            $.lambdaAuthorizerConfig = lambdaAuthorizerConfig;
            return this;
        }

        /**
         * @param lambdaAuthorizerConfig Nested argument containing Lambda authorizer configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder lambdaAuthorizerConfig(GraphQLApiLambdaAuthorizerConfigArgs lambdaAuthorizerConfig) {
            return lambdaAuthorizerConfig(Output.of(lambdaAuthorizerConfig));
        }

        /**
         * @param logConfig Nested argument containing logging configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder logConfig(@Nullable Output<GraphQLApiLogConfigArgs> logConfig) {
            $.logConfig = logConfig;
            return this;
        }

        /**
         * @param logConfig Nested argument containing logging configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder logConfig(GraphQLApiLogConfigArgs logConfig) {
            return logConfig(Output.of(logConfig));
        }

        /**
         * @param name A user-supplied name for the GraphqlApi.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A user-supplied name for the GraphqlApi.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param openidConnectConfig Nested argument containing OpenID Connect configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder openidConnectConfig(@Nullable Output<GraphQLApiOpenidConnectConfigArgs> openidConnectConfig) {
            $.openidConnectConfig = openidConnectConfig;
            return this;
        }

        /**
         * @param openidConnectConfig Nested argument containing OpenID Connect configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder openidConnectConfig(GraphQLApiOpenidConnectConfigArgs openidConnectConfig) {
            return openidConnectConfig(Output.of(openidConnectConfig));
        }

        /**
         * @param schema The schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param uris Map of URIs associated with the APIE.g., `uris[&#34;GRAPHQL&#34;] = https://ID.appsync-api.REGION.amazonaws.com/graphql`
         * 
         * @return builder
         * 
         */
        public Builder uris(@Nullable Output<Map<String,String>> uris) {
            $.uris = uris;
            return this;
        }

        /**
         * @param uris Map of URIs associated with the APIE.g., `uris[&#34;GRAPHQL&#34;] = https://ID.appsync-api.REGION.amazonaws.com/graphql`
         * 
         * @return builder
         * 
         */
        public Builder uris(Map<String,String> uris) {
            return uris(Output.of(uris));
        }

        /**
         * @param userPoolConfig The Amazon Cognito User Pool configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder userPoolConfig(@Nullable Output<GraphQLApiUserPoolConfigArgs> userPoolConfig) {
            $.userPoolConfig = userPoolConfig;
            return this;
        }

        /**
         * @param userPoolConfig The Amazon Cognito User Pool configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder userPoolConfig(GraphQLApiUserPoolConfigArgs userPoolConfig) {
            return userPoolConfig(Output.of(userPoolConfig));
        }

        /**
         * @param xrayEnabled Whether tracing with X-ray is enabled. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder xrayEnabled(@Nullable Output<Boolean> xrayEnabled) {
            $.xrayEnabled = xrayEnabled;
            return this;
        }

        /**
         * @param xrayEnabled Whether tracing with X-ray is enabled. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder xrayEnabled(Boolean xrayEnabled) {
            return xrayEnabled(Output.of(xrayEnabled));
        }

        public GraphQLApiState build() {
            return $;
        }
    }

}
