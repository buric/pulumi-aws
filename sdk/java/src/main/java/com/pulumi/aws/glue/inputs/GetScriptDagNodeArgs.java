// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.aws.glue.inputs.GetScriptDagNodeArgArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetScriptDagNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetScriptDagNodeArgs Empty = new GetScriptDagNodeArgs();

    /**
     * Nested configuration an argument or property of a node. Defined below.
     * 
     */
    @Import(name="args", required=true)
    private Output<List<GetScriptDagNodeArgArgs>> args;

    /**
     * @return Nested configuration an argument or property of a node. Defined below.
     * 
     */
    public Output<List<GetScriptDagNodeArgArgs>> args() {
        return this.args;
    }

    /**
     * A node identifier that is unique within the node&#39;s graph.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return A node identifier that is unique within the node&#39;s graph.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The line number of the node.
     * 
     */
    @Import(name="lineNumber")
    private @Nullable Output<Integer> lineNumber;

    /**
     * @return The line number of the node.
     * 
     */
    public Optional<Output<Integer>> lineNumber() {
        return Optional.ofNullable(this.lineNumber);
    }

    /**
     * The type of node this is.
     * 
     */
    @Import(name="nodeType", required=true)
    private Output<String> nodeType;

    /**
     * @return The type of node this is.
     * 
     */
    public Output<String> nodeType() {
        return this.nodeType;
    }

    private GetScriptDagNodeArgs() {}

    private GetScriptDagNodeArgs(GetScriptDagNodeArgs $) {
        this.args = $.args;
        this.id = $.id;
        this.lineNumber = $.lineNumber;
        this.nodeType = $.nodeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScriptDagNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScriptDagNodeArgs $;

        public Builder() {
            $ = new GetScriptDagNodeArgs();
        }

        public Builder(GetScriptDagNodeArgs defaults) {
            $ = new GetScriptDagNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param args Nested configuration an argument or property of a node. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder args(Output<List<GetScriptDagNodeArgArgs>> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args Nested configuration an argument or property of a node. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder args(List<GetScriptDagNodeArgArgs> args) {
            return args(Output.of(args));
        }

        /**
         * @param args Nested configuration an argument or property of a node. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder args(GetScriptDagNodeArgArgs... args) {
            return args(List.of(args));
        }

        /**
         * @param id A node identifier that is unique within the node&#39;s graph.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id A node identifier that is unique within the node&#39;s graph.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param lineNumber The line number of the node.
         * 
         * @return builder
         * 
         */
        public Builder lineNumber(@Nullable Output<Integer> lineNumber) {
            $.lineNumber = lineNumber;
            return this;
        }

        /**
         * @param lineNumber The line number of the node.
         * 
         * @return builder
         * 
         */
        public Builder lineNumber(Integer lineNumber) {
            return lineNumber(Output.of(lineNumber));
        }

        /**
         * @param nodeType The type of node this is.
         * 
         * @return builder
         * 
         */
        public Builder nodeType(Output<String> nodeType) {
            $.nodeType = nodeType;
            return this;
        }

        /**
         * @param nodeType The type of node this is.
         * 
         * @return builder
         * 
         */
        public Builder nodeType(String nodeType) {
            return nodeType(Output.of(nodeType));
        }

        public GetScriptDagNodeArgs build() {
            $.args = Objects.requireNonNull($.args, "expected parameter 'args' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.nodeType = Objects.requireNonNull($.nodeType, "expected parameter 'nodeType' to be non-null");
            return $;
        }
    }

}
