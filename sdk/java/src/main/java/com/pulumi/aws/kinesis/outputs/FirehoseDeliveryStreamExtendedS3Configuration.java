// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions;
import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration;
import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration;
import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration;
import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirehoseDeliveryStreamExtendedS3Configuration {
    /**
     * @return The ARN of the S3 bucket
     * 
     */
    private final String bucketArn;
    /**
     * @return Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300.
     * 
     */
    private final @Nullable Integer bufferInterval;
    /**
     * @return Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
     * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
     * 
     */
    private final @Nullable Integer bufferSize;
    /**
     * @return The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
     */
    private final @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
    /**
     * @return The compression format. If no value is specified, the default is `UNCOMPRESSED`. Other supported values are `GZIP`, `ZIP`, `Snappy`, &amp; `HADOOP_SNAPPY`.
     * 
     */
    private final @Nullable String compressionFormat;
    /**
     * @return Nested argument for the serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format before writing it to Amazon S3. More details given below.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration dataFormatConversionConfiguration;
    /**
     * @return The configuration for dynamic partitioning. See Dynamic Partitioning Configuration below for more details.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration dynamicPartitioningConfiguration;
    /**
     * @return Prefix added to failed records before writing them to S3. Not currently supported for `redshift` destination. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see [Custom Prefixes for Amazon S3 Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html).
     * 
     */
    private final @Nullable String errorOutputPrefix;
    /**
     * @return Specifies the KMS key ARN the stream will use to encrypt data. If not set, no encryption will
     * be used.
     * 
     */
    private final @Nullable String kmsKeyArn;
    /**
     * @return The &#34;YYYY/MM/DD/HH&#34; time format prefix is automatically used for delivered S3 files. You can specify an extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a folder in the S3 bucket
     * 
     */
    private final @Nullable String prefix;
    /**
     * @return The data processing configuration.  More details are given below.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration processingConfiguration;
    /**
     * @return The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren&#39;t allowed.
     * 
     */
    private final String roleArn;
    /**
     * @return The configuration for backup in Amazon S3. Required if `s3_backup_mode` is `Enabled`. Supports the same fields as `s3_configuration` object.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration s3BackupConfiguration;
    /**
     * @return The Amazon S3 backup mode.  Valid values are `Disabled` and `Enabled`.  Default value is `Disabled`.
     * 
     */
    private final @Nullable String s3BackupMode;

    @CustomType.Constructor
    private FirehoseDeliveryStreamExtendedS3Configuration(
        @CustomType.Parameter("bucketArn") String bucketArn,
        @CustomType.Parameter("bufferInterval") @Nullable Integer bufferInterval,
        @CustomType.Parameter("bufferSize") @Nullable Integer bufferSize,
        @CustomType.Parameter("cloudwatchLoggingOptions") @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions,
        @CustomType.Parameter("compressionFormat") @Nullable String compressionFormat,
        @CustomType.Parameter("dataFormatConversionConfiguration") @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration dataFormatConversionConfiguration,
        @CustomType.Parameter("dynamicPartitioningConfiguration") @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration dynamicPartitioningConfiguration,
        @CustomType.Parameter("errorOutputPrefix") @Nullable String errorOutputPrefix,
        @CustomType.Parameter("kmsKeyArn") @Nullable String kmsKeyArn,
        @CustomType.Parameter("prefix") @Nullable String prefix,
        @CustomType.Parameter("processingConfiguration") @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration processingConfiguration,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("s3BackupConfiguration") @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration s3BackupConfiguration,
        @CustomType.Parameter("s3BackupMode") @Nullable String s3BackupMode) {
        this.bucketArn = bucketArn;
        this.bufferInterval = bufferInterval;
        this.bufferSize = bufferSize;
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.compressionFormat = compressionFormat;
        this.dataFormatConversionConfiguration = dataFormatConversionConfiguration;
        this.dynamicPartitioningConfiguration = dynamicPartitioningConfiguration;
        this.errorOutputPrefix = errorOutputPrefix;
        this.kmsKeyArn = kmsKeyArn;
        this.prefix = prefix;
        this.processingConfiguration = processingConfiguration;
        this.roleArn = roleArn;
        this.s3BackupConfiguration = s3BackupConfiguration;
        this.s3BackupMode = s3BackupMode;
    }

    /**
     * @return The ARN of the S3 bucket
     * 
     */
    public String bucketArn() {
        return this.bucketArn;
    }
    /**
     * @return Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300.
     * 
     */
    public Optional<Integer> bufferInterval() {
        return Optional.ofNullable(this.bufferInterval);
    }
    /**
     * @return Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
     * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
     * 
     */
    public Optional<Integer> bufferSize() {
        return Optional.ofNullable(this.bufferSize);
    }
    /**
     * @return The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
     */
    public Optional<FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions> cloudwatchLoggingOptions() {
        return Optional.ofNullable(this.cloudwatchLoggingOptions);
    }
    /**
     * @return The compression format. If no value is specified, the default is `UNCOMPRESSED`. Other supported values are `GZIP`, `ZIP`, `Snappy`, &amp; `HADOOP_SNAPPY`.
     * 
     */
    public Optional<String> compressionFormat() {
        return Optional.ofNullable(this.compressionFormat);
    }
    /**
     * @return Nested argument for the serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format before writing it to Amazon S3. More details given below.
     * 
     */
    public Optional<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration> dataFormatConversionConfiguration() {
        return Optional.ofNullable(this.dataFormatConversionConfiguration);
    }
    /**
     * @return The configuration for dynamic partitioning. See Dynamic Partitioning Configuration below for more details.
     * 
     */
    public Optional<FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration> dynamicPartitioningConfiguration() {
        return Optional.ofNullable(this.dynamicPartitioningConfiguration);
    }
    /**
     * @return Prefix added to failed records before writing them to S3. Not currently supported for `redshift` destination. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see [Custom Prefixes for Amazon S3 Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html).
     * 
     */
    public Optional<String> errorOutputPrefix() {
        return Optional.ofNullable(this.errorOutputPrefix);
    }
    /**
     * @return Specifies the KMS key ARN the stream will use to encrypt data. If not set, no encryption will
     * be used.
     * 
     */
    public Optional<String> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }
    /**
     * @return The &#34;YYYY/MM/DD/HH&#34; time format prefix is automatically used for delivered S3 files. You can specify an extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a folder in the S3 bucket
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return The data processing configuration.  More details are given below.
     * 
     */
    public Optional<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration> processingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }
    /**
     * @return The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren&#39;t allowed.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return The configuration for backup in Amazon S3. Required if `s3_backup_mode` is `Enabled`. Supports the same fields as `s3_configuration` object.
     * 
     */
    public Optional<FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration> s3BackupConfiguration() {
        return Optional.ofNullable(this.s3BackupConfiguration);
    }
    /**
     * @return The Amazon S3 backup mode.  Valid values are `Disabled` and `Enabled`.  Default value is `Disabled`.
     * 
     */
    public Optional<String> s3BackupMode() {
        return Optional.ofNullable(this.s3BackupMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3Configuration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketArn;
        private @Nullable Integer bufferInterval;
        private @Nullable Integer bufferSize;
        private @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
        private @Nullable String compressionFormat;
        private @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration dataFormatConversionConfiguration;
        private @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration dynamicPartitioningConfiguration;
        private @Nullable String errorOutputPrefix;
        private @Nullable String kmsKeyArn;
        private @Nullable String prefix;
        private @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration processingConfiguration;
        private String roleArn;
        private @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration s3BackupConfiguration;
        private @Nullable String s3BackupMode;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3Configuration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketArn = defaults.bucketArn;
    	      this.bufferInterval = defaults.bufferInterval;
    	      this.bufferSize = defaults.bufferSize;
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.compressionFormat = defaults.compressionFormat;
    	      this.dataFormatConversionConfiguration = defaults.dataFormatConversionConfiguration;
    	      this.dynamicPartitioningConfiguration = defaults.dynamicPartitioningConfiguration;
    	      this.errorOutputPrefix = defaults.errorOutputPrefix;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.prefix = defaults.prefix;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.roleArn = defaults.roleArn;
    	      this.s3BackupConfiguration = defaults.s3BackupConfiguration;
    	      this.s3BackupMode = defaults.s3BackupMode;
        }

        public Builder bucketArn(String bucketArn) {
            this.bucketArn = Objects.requireNonNull(bucketArn);
            return this;
        }
        public Builder bufferInterval(@Nullable Integer bufferInterval) {
            this.bufferInterval = bufferInterval;
            return this;
        }
        public Builder bufferSize(@Nullable Integer bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }
        public Builder cloudwatchLoggingOptions(@Nullable FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }
        public Builder compressionFormat(@Nullable String compressionFormat) {
            this.compressionFormat = compressionFormat;
            return this;
        }
        public Builder dataFormatConversionConfiguration(@Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration dataFormatConversionConfiguration) {
            this.dataFormatConversionConfiguration = dataFormatConversionConfiguration;
            return this;
        }
        public Builder dynamicPartitioningConfiguration(@Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration dynamicPartitioningConfiguration) {
            this.dynamicPartitioningConfiguration = dynamicPartitioningConfiguration;
            return this;
        }
        public Builder errorOutputPrefix(@Nullable String errorOutputPrefix) {
            this.errorOutputPrefix = errorOutputPrefix;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder processingConfiguration(@Nullable FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder s3BackupConfiguration(@Nullable FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration s3BackupConfiguration) {
            this.s3BackupConfiguration = s3BackupConfiguration;
            return this;
        }
        public Builder s3BackupMode(@Nullable String s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }        public FirehoseDeliveryStreamExtendedS3Configuration build() {
            return new FirehoseDeliveryStreamExtendedS3Configuration(bucketArn, bufferInterval, bufferSize, cloudwatchLoggingOptions, compressionFormat, dataFormatConversionConfiguration, dynamicPartitioningConfiguration, errorOutputPrefix, kmsKeyArn, prefix, processingConfiguration, roleArn, s3BackupConfiguration, s3BackupMode);
        }
    }
}
