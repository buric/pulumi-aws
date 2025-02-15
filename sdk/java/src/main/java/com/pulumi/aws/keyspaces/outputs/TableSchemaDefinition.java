// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.keyspaces.outputs;

import com.pulumi.aws.keyspaces.outputs.TableSchemaDefinitionClusteringKey;
import com.pulumi.aws.keyspaces.outputs.TableSchemaDefinitionColumn;
import com.pulumi.aws.keyspaces.outputs.TableSchemaDefinitionPartitionKey;
import com.pulumi.aws.keyspaces.outputs.TableSchemaDefinitionStaticColumn;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class TableSchemaDefinition {
    /**
     * @return The columns that are part of the clustering key of the table.
     * 
     */
    private final @Nullable List<TableSchemaDefinitionClusteringKey> clusteringKeys;
    /**
     * @return The regular columns of the table.
     * 
     */
    private final List<TableSchemaDefinitionColumn> columns;
    /**
     * @return The columns that are part of the partition key of the table .
     * 
     */
    private final List<TableSchemaDefinitionPartitionKey> partitionKeys;
    /**
     * @return The columns that have been defined as `STATIC`. Static columns store values that are shared by all rows in the same partition.
     * 
     */
    private final @Nullable List<TableSchemaDefinitionStaticColumn> staticColumns;

    @CustomType.Constructor
    private TableSchemaDefinition(
        @CustomType.Parameter("clusteringKeys") @Nullable List<TableSchemaDefinitionClusteringKey> clusteringKeys,
        @CustomType.Parameter("columns") List<TableSchemaDefinitionColumn> columns,
        @CustomType.Parameter("partitionKeys") List<TableSchemaDefinitionPartitionKey> partitionKeys,
        @CustomType.Parameter("staticColumns") @Nullable List<TableSchemaDefinitionStaticColumn> staticColumns) {
        this.clusteringKeys = clusteringKeys;
        this.columns = columns;
        this.partitionKeys = partitionKeys;
        this.staticColumns = staticColumns;
    }

    /**
     * @return The columns that are part of the clustering key of the table.
     * 
     */
    public List<TableSchemaDefinitionClusteringKey> clusteringKeys() {
        return this.clusteringKeys == null ? List.of() : this.clusteringKeys;
    }
    /**
     * @return The regular columns of the table.
     * 
     */
    public List<TableSchemaDefinitionColumn> columns() {
        return this.columns;
    }
    /**
     * @return The columns that are part of the partition key of the table .
     * 
     */
    public List<TableSchemaDefinitionPartitionKey> partitionKeys() {
        return this.partitionKeys;
    }
    /**
     * @return The columns that have been defined as `STATIC`. Static columns store values that are shared by all rows in the same partition.
     * 
     */
    public List<TableSchemaDefinitionStaticColumn> staticColumns() {
        return this.staticColumns == null ? List.of() : this.staticColumns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableSchemaDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<TableSchemaDefinitionClusteringKey> clusteringKeys;
        private List<TableSchemaDefinitionColumn> columns;
        private List<TableSchemaDefinitionPartitionKey> partitionKeys;
        private @Nullable List<TableSchemaDefinitionStaticColumn> staticColumns;

        public Builder() {
    	      // Empty
        }

        public Builder(TableSchemaDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusteringKeys = defaults.clusteringKeys;
    	      this.columns = defaults.columns;
    	      this.partitionKeys = defaults.partitionKeys;
    	      this.staticColumns = defaults.staticColumns;
        }

        public Builder clusteringKeys(@Nullable List<TableSchemaDefinitionClusteringKey> clusteringKeys) {
            this.clusteringKeys = clusteringKeys;
            return this;
        }
        public Builder clusteringKeys(TableSchemaDefinitionClusteringKey... clusteringKeys) {
            return clusteringKeys(List.of(clusteringKeys));
        }
        public Builder columns(List<TableSchemaDefinitionColumn> columns) {
            this.columns = Objects.requireNonNull(columns);
            return this;
        }
        public Builder columns(TableSchemaDefinitionColumn... columns) {
            return columns(List.of(columns));
        }
        public Builder partitionKeys(List<TableSchemaDefinitionPartitionKey> partitionKeys) {
            this.partitionKeys = Objects.requireNonNull(partitionKeys);
            return this;
        }
        public Builder partitionKeys(TableSchemaDefinitionPartitionKey... partitionKeys) {
            return partitionKeys(List.of(partitionKeys));
        }
        public Builder staticColumns(@Nullable List<TableSchemaDefinitionStaticColumn> staticColumns) {
            this.staticColumns = staticColumns;
            return this;
        }
        public Builder staticColumns(TableSchemaDefinitionStaticColumn... staticColumns) {
            return staticColumns(List.of(staticColumns));
        }        public TableSchemaDefinition build() {
            return new TableSchemaDefinition(clusteringKeys, columns, partitionKeys, staticColumns);
        }
    }
}
