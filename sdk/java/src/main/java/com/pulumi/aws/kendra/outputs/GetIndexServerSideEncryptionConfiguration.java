// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIndexServerSideEncryptionConfiguration {
    /**
     * @return The identifier of the AWS KMScustomer master key (CMK). Amazon Kendra doesn&#39;t support asymmetric CMKs.
     * 
     */
    private final String kmsKeyId;

    @CustomType.Constructor
    private GetIndexServerSideEncryptionConfiguration(@CustomType.Parameter("kmsKeyId") String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * @return The identifier of the AWS KMScustomer master key (CMK). Amazon Kendra doesn&#39;t support asymmetric CMKs.
     * 
     */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIndexServerSideEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIndexServerSideEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }        public GetIndexServerSideEncryptionConfiguration build() {
            return new GetIndexServerSideEncryptionConfiguration(kmsKeyId);
        }
    }
}
