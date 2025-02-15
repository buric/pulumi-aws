// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterSnapshotArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterSnapshotArgs Empty = new ClusterSnapshotArgs();

    /**
     * The DB Cluster Identifier from which to take the snapshot.
     * 
     */
    @Import(name="dbClusterIdentifier", required=true)
    private Output<String> dbClusterIdentifier;

    /**
     * @return The DB Cluster Identifier from which to take the snapshot.
     * 
     */
    public Output<String> dbClusterIdentifier() {
        return this.dbClusterIdentifier;
    }

    /**
     * The Identifier for the snapshot.
     * 
     */
    @Import(name="dbClusterSnapshotIdentifier", required=true)
    private Output<String> dbClusterSnapshotIdentifier;

    /**
     * @return The Identifier for the snapshot.
     * 
     */
    public Output<String> dbClusterSnapshotIdentifier() {
        return this.dbClusterSnapshotIdentifier;
    }

    /**
     * A map of tags to assign to the DB cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the DB cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ClusterSnapshotArgs() {}

    private ClusterSnapshotArgs(ClusterSnapshotArgs $) {
        this.dbClusterIdentifier = $.dbClusterIdentifier;
        this.dbClusterSnapshotIdentifier = $.dbClusterSnapshotIdentifier;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterSnapshotArgs $;

        public Builder() {
            $ = new ClusterSnapshotArgs();
        }

        public Builder(ClusterSnapshotArgs defaults) {
            $ = new ClusterSnapshotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbClusterIdentifier The DB Cluster Identifier from which to take the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterIdentifier(Output<String> dbClusterIdentifier) {
            $.dbClusterIdentifier = dbClusterIdentifier;
            return this;
        }

        /**
         * @param dbClusterIdentifier The DB Cluster Identifier from which to take the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterIdentifier(String dbClusterIdentifier) {
            return dbClusterIdentifier(Output.of(dbClusterIdentifier));
        }

        /**
         * @param dbClusterSnapshotIdentifier The Identifier for the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterSnapshotIdentifier(Output<String> dbClusterSnapshotIdentifier) {
            $.dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier;
            return this;
        }

        /**
         * @param dbClusterSnapshotIdentifier The Identifier for the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterSnapshotIdentifier(String dbClusterSnapshotIdentifier) {
            return dbClusterSnapshotIdentifier(Output.of(dbClusterSnapshotIdentifier));
        }

        /**
         * @param tags A map of tags to assign to the DB cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the DB cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ClusterSnapshotArgs build() {
            $.dbClusterIdentifier = Objects.requireNonNull($.dbClusterIdentifier, "expected parameter 'dbClusterIdentifier' to be non-null");
            $.dbClusterSnapshotIdentifier = Objects.requireNonNull($.dbClusterSnapshotIdentifier, "expected parameter 'dbClusterSnapshotIdentifier' to be non-null");
            return $;
        }
    }

}
