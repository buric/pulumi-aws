// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCertificateResult {
    /**
     * @return Amazon Resource Name (ARN) of the certificate.
     * 
     */
    private final String arn;
    /**
     * @return Type of certificate. For example, `CA`.
     * 
     */
    private final String certificateType;
    /**
     * @return Boolean whether there is an override for the default certificate identifier.
     * 
     */
    private final Boolean customerOverride;
    /**
     * @return If there is an override for the default certificate identifier, when the override expires.
     * 
     */
    private final String customerOverrideValidTill;
    private final String id;
    private final @Nullable Boolean latestValidTill;
    /**
     * @return Thumbprint of the certificate.
     * 
     */
    private final String thumbprint;
    /**
     * @return [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of certificate starting validity date.
     * 
     */
    private final String validFrom;
    /**
     * @return [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of certificate ending validity date.
     * 
     */
    private final String validTill;

    @CustomType.Constructor
    private GetCertificateResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("certificateType") String certificateType,
        @CustomType.Parameter("customerOverride") Boolean customerOverride,
        @CustomType.Parameter("customerOverrideValidTill") String customerOverrideValidTill,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("latestValidTill") @Nullable Boolean latestValidTill,
        @CustomType.Parameter("thumbprint") String thumbprint,
        @CustomType.Parameter("validFrom") String validFrom,
        @CustomType.Parameter("validTill") String validTill) {
        this.arn = arn;
        this.certificateType = certificateType;
        this.customerOverride = customerOverride;
        this.customerOverrideValidTill = customerOverrideValidTill;
        this.id = id;
        this.latestValidTill = latestValidTill;
        this.thumbprint = thumbprint;
        this.validFrom = validFrom;
        this.validTill = validTill;
    }

    /**
     * @return Amazon Resource Name (ARN) of the certificate.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Type of certificate. For example, `CA`.
     * 
     */
    public String certificateType() {
        return this.certificateType;
    }
    /**
     * @return Boolean whether there is an override for the default certificate identifier.
     * 
     */
    public Boolean customerOverride() {
        return this.customerOverride;
    }
    /**
     * @return If there is an override for the default certificate identifier, when the override expires.
     * 
     */
    public String customerOverrideValidTill() {
        return this.customerOverrideValidTill;
    }
    public String id() {
        return this.id;
    }
    public Optional<Boolean> latestValidTill() {
        return Optional.ofNullable(this.latestValidTill);
    }
    /**
     * @return Thumbprint of the certificate.
     * 
     */
    public String thumbprint() {
        return this.thumbprint;
    }
    /**
     * @return [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of certificate starting validity date.
     * 
     */
    public String validFrom() {
        return this.validFrom;
    }
    /**
     * @return [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of certificate ending validity date.
     * 
     */
    public String validTill() {
        return this.validTill;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String certificateType;
        private Boolean customerOverride;
        private String customerOverrideValidTill;
        private String id;
        private @Nullable Boolean latestValidTill;
        private String thumbprint;
        private String validFrom;
        private String validTill;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.certificateType = defaults.certificateType;
    	      this.customerOverride = defaults.customerOverride;
    	      this.customerOverrideValidTill = defaults.customerOverrideValidTill;
    	      this.id = defaults.id;
    	      this.latestValidTill = defaults.latestValidTill;
    	      this.thumbprint = defaults.thumbprint;
    	      this.validFrom = defaults.validFrom;
    	      this.validTill = defaults.validTill;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder certificateType(String certificateType) {
            this.certificateType = Objects.requireNonNull(certificateType);
            return this;
        }
        public Builder customerOverride(Boolean customerOverride) {
            this.customerOverride = Objects.requireNonNull(customerOverride);
            return this;
        }
        public Builder customerOverrideValidTill(String customerOverrideValidTill) {
            this.customerOverrideValidTill = Objects.requireNonNull(customerOverrideValidTill);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder latestValidTill(@Nullable Boolean latestValidTill) {
            this.latestValidTill = latestValidTill;
            return this;
        }
        public Builder thumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }
        public Builder validFrom(String validFrom) {
            this.validFrom = Objects.requireNonNull(validFrom);
            return this;
        }
        public Builder validTill(String validTill) {
            this.validTill = Objects.requireNonNull(validTill);
            return this;
        }        public GetCertificateResult build() {
            return new GetCertificateResult(arn, certificateType, customerOverride, customerOverrideValidTill, id, latestValidTill, thumbprint, validFrom, validTill);
        }
    }
}
