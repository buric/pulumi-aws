// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.outputs;

import com.pulumi.aws.networkmanager.outputs.GetSiteLocation;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSiteResult {
    /**
     * @return The ARN of the site.
     * 
     */
    private final String arn;
    /**
     * @return The description of the site.
     * 
     */
    private final String description;
    private final String globalNetworkId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The site location as documented below.
     * 
     */
    private final List<GetSiteLocation> locations;
    private final String siteId;
    /**
     * @return Key-value tags for the Site.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetSiteResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("globalNetworkId") String globalNetworkId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("locations") List<GetSiteLocation> locations,
        @CustomType.Parameter("siteId") String siteId,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.description = description;
        this.globalNetworkId = globalNetworkId;
        this.id = id;
        this.locations = locations;
        this.siteId = siteId;
        this.tags = tags;
    }

    /**
     * @return The ARN of the site.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The description of the site.
     * 
     */
    public String description() {
        return this.description;
    }
    public String globalNetworkId() {
        return this.globalNetworkId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The site location as documented below.
     * 
     */
    public List<GetSiteLocation> locations() {
        return this.locations;
    }
    public String siteId() {
        return this.siteId;
    }
    /**
     * @return Key-value tags for the Site.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSiteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String description;
        private String globalNetworkId;
        private String id;
        private List<GetSiteLocation> locations;
        private String siteId;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSiteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.globalNetworkId = defaults.globalNetworkId;
    	      this.id = defaults.id;
    	      this.locations = defaults.locations;
    	      this.siteId = defaults.siteId;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder globalNetworkId(String globalNetworkId) {
            this.globalNetworkId = Objects.requireNonNull(globalNetworkId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder locations(List<GetSiteLocation> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public Builder locations(GetSiteLocation... locations) {
            return locations(List.of(locations));
        }
        public Builder siteId(String siteId) {
            this.siteId = Objects.requireNonNull(siteId);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetSiteResult build() {
            return new GetSiteResult(arn, description, globalNetworkId, id, locations, siteId, tags);
        }
    }
}
