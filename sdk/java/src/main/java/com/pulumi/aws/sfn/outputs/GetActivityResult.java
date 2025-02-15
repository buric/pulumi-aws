// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sfn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetActivityResult {
    private final String arn;
    /**
     * @return The date the activity was created.
     * 
     */
    private final String creationDate;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;

    @CustomType.Constructor
    private GetActivityResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("creationDate") String creationDate,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name) {
        this.arn = arn;
        this.creationDate = creationDate;
        this.id = id;
        this.name = name;
    }

    public String arn() {
        return this.arn;
    }
    /**
     * @return The date the activity was created.
     * 
     */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActivityResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String creationDate;
        private String id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetActivityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.creationDate = defaults.creationDate;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetActivityResult build() {
            return new GetActivityResult(arn, creationDate, id, name);
        }
    }
}
