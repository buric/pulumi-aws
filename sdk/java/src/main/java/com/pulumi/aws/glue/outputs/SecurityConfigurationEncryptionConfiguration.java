// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.aws.glue.outputs.SecurityConfigurationEncryptionConfigurationCloudwatchEncryption;
import com.pulumi.aws.glue.outputs.SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption;
import com.pulumi.aws.glue.outputs.SecurityConfigurationEncryptionConfigurationS3Encryption;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class SecurityConfigurationEncryptionConfiguration {
    private final SecurityConfigurationEncryptionConfigurationCloudwatchEncryption cloudwatchEncryption;
    private final SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption jobBookmarksEncryption;
    /**
     * @return A ` s3_encryption  ` block as described below, which contains encryption configuration for S3 data.
     * 
     */
    private final SecurityConfigurationEncryptionConfigurationS3Encryption s3Encryption;

    @CustomType.Constructor
    private SecurityConfigurationEncryptionConfiguration(
        @CustomType.Parameter("cloudwatchEncryption") SecurityConfigurationEncryptionConfigurationCloudwatchEncryption cloudwatchEncryption,
        @CustomType.Parameter("jobBookmarksEncryption") SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption jobBookmarksEncryption,
        @CustomType.Parameter("s3Encryption") SecurityConfigurationEncryptionConfigurationS3Encryption s3Encryption) {
        this.cloudwatchEncryption = cloudwatchEncryption;
        this.jobBookmarksEncryption = jobBookmarksEncryption;
        this.s3Encryption = s3Encryption;
    }

    public SecurityConfigurationEncryptionConfigurationCloudwatchEncryption cloudwatchEncryption() {
        return this.cloudwatchEncryption;
    }
    public SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption jobBookmarksEncryption() {
        return this.jobBookmarksEncryption;
    }
    /**
     * @return A ` s3_encryption  ` block as described below, which contains encryption configuration for S3 data.
     * 
     */
    public SecurityConfigurationEncryptionConfigurationS3Encryption s3Encryption() {
        return this.s3Encryption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConfigurationEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityConfigurationEncryptionConfigurationCloudwatchEncryption cloudwatchEncryption;
        private SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption jobBookmarksEncryption;
        private SecurityConfigurationEncryptionConfigurationS3Encryption s3Encryption;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConfigurationEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchEncryption = defaults.cloudwatchEncryption;
    	      this.jobBookmarksEncryption = defaults.jobBookmarksEncryption;
    	      this.s3Encryption = defaults.s3Encryption;
        }

        public Builder cloudwatchEncryption(SecurityConfigurationEncryptionConfigurationCloudwatchEncryption cloudwatchEncryption) {
            this.cloudwatchEncryption = Objects.requireNonNull(cloudwatchEncryption);
            return this;
        }
        public Builder jobBookmarksEncryption(SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption jobBookmarksEncryption) {
            this.jobBookmarksEncryption = Objects.requireNonNull(jobBookmarksEncryption);
            return this;
        }
        public Builder s3Encryption(SecurityConfigurationEncryptionConfigurationS3Encryption s3Encryption) {
            this.s3Encryption = Objects.requireNonNull(s3Encryption);
            return this;
        }        public SecurityConfigurationEncryptionConfiguration build() {
            return new SecurityConfigurationEncryptionConfiguration(cloudwatchEncryption, jobBookmarksEncryption, s3Encryption);
        }
    }
}
