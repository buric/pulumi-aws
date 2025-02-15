// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amplify.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainAssociationSubDomain {
    /**
     * @return The branch name setting for the subdomain.
     * 
     */
    private final String branchName;
    /**
     * @return The DNS record for the subdomain.
     * 
     */
    private final @Nullable String dnsRecord;
    /**
     * @return The prefix setting for the subdomain.
     * 
     */
    private final String prefix;
    /**
     * @return The verified status of the subdomain.
     * 
     */
    private final @Nullable Boolean verified;

    @CustomType.Constructor
    private DomainAssociationSubDomain(
        @CustomType.Parameter("branchName") String branchName,
        @CustomType.Parameter("dnsRecord") @Nullable String dnsRecord,
        @CustomType.Parameter("prefix") String prefix,
        @CustomType.Parameter("verified") @Nullable Boolean verified) {
        this.branchName = branchName;
        this.dnsRecord = dnsRecord;
        this.prefix = prefix;
        this.verified = verified;
    }

    /**
     * @return The branch name setting for the subdomain.
     * 
     */
    public String branchName() {
        return this.branchName;
    }
    /**
     * @return The DNS record for the subdomain.
     * 
     */
    public Optional<String> dnsRecord() {
        return Optional.ofNullable(this.dnsRecord);
    }
    /**
     * @return The prefix setting for the subdomain.
     * 
     */
    public String prefix() {
        return this.prefix;
    }
    /**
     * @return The verified status of the subdomain.
     * 
     */
    public Optional<Boolean> verified() {
        return Optional.ofNullable(this.verified);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainAssociationSubDomain defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String branchName;
        private @Nullable String dnsRecord;
        private String prefix;
        private @Nullable Boolean verified;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainAssociationSubDomain defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.dnsRecord = defaults.dnsRecord;
    	      this.prefix = defaults.prefix;
    	      this.verified = defaults.verified;
        }

        public Builder branchName(String branchName) {
            this.branchName = Objects.requireNonNull(branchName);
            return this;
        }
        public Builder dnsRecord(@Nullable String dnsRecord) {
            this.dnsRecord = dnsRecord;
            return this;
        }
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        public Builder verified(@Nullable Boolean verified) {
            this.verified = verified;
            return this;
        }        public DomainAssociationSubDomain build() {
            return new DomainAssociationSubDomain(branchName, dnsRecord, prefix, verified);
        }
    }
}
