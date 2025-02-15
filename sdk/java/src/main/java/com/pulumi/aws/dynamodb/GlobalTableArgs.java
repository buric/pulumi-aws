// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb;

import com.pulumi.aws.dynamodb.inputs.GlobalTableReplicaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalTableArgs Empty = new GlobalTableArgs();

    /**
     * The name of the global table. Must match underlying DynamoDB Table names in all regions.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the global table. Must match underlying DynamoDB Table names in all regions.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Underlying DynamoDB Table. At least 1 replica must be defined. See below.
     * 
     */
    @Import(name="replicas", required=true)
    private Output<List<GlobalTableReplicaArgs>> replicas;

    /**
     * @return Underlying DynamoDB Table. At least 1 replica must be defined. See below.
     * 
     */
    public Output<List<GlobalTableReplicaArgs>> replicas() {
        return this.replicas;
    }

    private GlobalTableArgs() {}

    private GlobalTableArgs(GlobalTableArgs $) {
        this.name = $.name;
        this.replicas = $.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalTableArgs $;

        public Builder() {
            $ = new GlobalTableArgs();
        }

        public Builder(GlobalTableArgs defaults) {
            $ = new GlobalTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the global table. Must match underlying DynamoDB Table names in all regions.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the global table. Must match underlying DynamoDB Table names in all regions.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param replicas Underlying DynamoDB Table. At least 1 replica must be defined. See below.
         * 
         * @return builder
         * 
         */
        public Builder replicas(Output<List<GlobalTableReplicaArgs>> replicas) {
            $.replicas = replicas;
            return this;
        }

        /**
         * @param replicas Underlying DynamoDB Table. At least 1 replica must be defined. See below.
         * 
         * @return builder
         * 
         */
        public Builder replicas(List<GlobalTableReplicaArgs> replicas) {
            return replicas(Output.of(replicas));
        }

        /**
         * @param replicas Underlying DynamoDB Table. At least 1 replica must be defined. See below.
         * 
         * @return builder
         * 
         */
        public Builder replicas(GlobalTableReplicaArgs... replicas) {
            return replicas(List.of(replicas));
        }

        public GlobalTableArgs build() {
            $.replicas = Objects.requireNonNull($.replicas, "expected parameter 'replicas' to be non-null");
            return $;
        }
    }

}
