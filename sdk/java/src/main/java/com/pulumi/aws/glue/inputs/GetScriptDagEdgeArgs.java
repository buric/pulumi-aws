// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetScriptDagEdgeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetScriptDagEdgeArgs Empty = new GetScriptDagEdgeArgs();

    /**
     * The ID of the node at which the edge starts.
     * 
     */
    @Import(name="source", required=true)
    private Output<String> source;

    /**
     * @return The ID of the node at which the edge starts.
     * 
     */
    public Output<String> source() {
        return this.source;
    }

    /**
     * The ID of the node at which the edge ends.
     * 
     */
    @Import(name="target", required=true)
    private Output<String> target;

    /**
     * @return The ID of the node at which the edge ends.
     * 
     */
    public Output<String> target() {
        return this.target;
    }

    /**
     * The target of the edge.
     * 
     */
    @Import(name="targetParameter")
    private @Nullable Output<String> targetParameter;

    /**
     * @return The target of the edge.
     * 
     */
    public Optional<Output<String>> targetParameter() {
        return Optional.ofNullable(this.targetParameter);
    }

    private GetScriptDagEdgeArgs() {}

    private GetScriptDagEdgeArgs(GetScriptDagEdgeArgs $) {
        this.source = $.source;
        this.target = $.target;
        this.targetParameter = $.targetParameter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScriptDagEdgeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScriptDagEdgeArgs $;

        public Builder() {
            $ = new GetScriptDagEdgeArgs();
        }

        public Builder(GetScriptDagEdgeArgs defaults) {
            $ = new GetScriptDagEdgeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param source The ID of the node at which the edge starts.
         * 
         * @return builder
         * 
         */
        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The ID of the node at which the edge starts.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param target The ID of the node at which the edge ends.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The ID of the node at which the edge ends.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param targetParameter The target of the edge.
         * 
         * @return builder
         * 
         */
        public Builder targetParameter(@Nullable Output<String> targetParameter) {
            $.targetParameter = targetParameter;
            return this;
        }

        /**
         * @param targetParameter The target of the edge.
         * 
         * @return builder
         * 
         */
        public Builder targetParameter(String targetParameter) {
            return targetParameter(Output.of(targetParameter));
        }

        public GetScriptDagEdgeArgs build() {
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            return $;
        }
    }

}
