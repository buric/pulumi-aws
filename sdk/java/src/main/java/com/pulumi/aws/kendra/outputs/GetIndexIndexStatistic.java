// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.aws.kendra.outputs.GetIndexIndexStatisticFaqStatistic;
import com.pulumi.aws.kendra.outputs.GetIndexIndexStatisticTextDocumentStatistic;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIndexIndexStatistic {
    /**
     * @return A block that specifies the number of question and answer topics in the index. Documented below.
     * 
     */
    private final List<GetIndexIndexStatisticFaqStatistic> faqStatistics;
    /**
     * @return A block that specifies the number of text documents indexed.
     * 
     */
    private final List<GetIndexIndexStatisticTextDocumentStatistic> textDocumentStatistics;

    @CustomType.Constructor
    private GetIndexIndexStatistic(
        @CustomType.Parameter("faqStatistics") List<GetIndexIndexStatisticFaqStatistic> faqStatistics,
        @CustomType.Parameter("textDocumentStatistics") List<GetIndexIndexStatisticTextDocumentStatistic> textDocumentStatistics) {
        this.faqStatistics = faqStatistics;
        this.textDocumentStatistics = textDocumentStatistics;
    }

    /**
     * @return A block that specifies the number of question and answer topics in the index. Documented below.
     * 
     */
    public List<GetIndexIndexStatisticFaqStatistic> faqStatistics() {
        return this.faqStatistics;
    }
    /**
     * @return A block that specifies the number of text documents indexed.
     * 
     */
    public List<GetIndexIndexStatisticTextDocumentStatistic> textDocumentStatistics() {
        return this.textDocumentStatistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIndexIndexStatistic defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetIndexIndexStatisticFaqStatistic> faqStatistics;
        private List<GetIndexIndexStatisticTextDocumentStatistic> textDocumentStatistics;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIndexIndexStatistic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.faqStatistics = defaults.faqStatistics;
    	      this.textDocumentStatistics = defaults.textDocumentStatistics;
        }

        public Builder faqStatistics(List<GetIndexIndexStatisticFaqStatistic> faqStatistics) {
            this.faqStatistics = Objects.requireNonNull(faqStatistics);
            return this;
        }
        public Builder faqStatistics(GetIndexIndexStatisticFaqStatistic... faqStatistics) {
            return faqStatistics(List.of(faqStatistics));
        }
        public Builder textDocumentStatistics(List<GetIndexIndexStatisticTextDocumentStatistic> textDocumentStatistics) {
            this.textDocumentStatistics = Objects.requireNonNull(textDocumentStatistics);
            return this;
        }
        public Builder textDocumentStatistics(GetIndexIndexStatisticTextDocumentStatistic... textDocumentStatistics) {
            return textDocumentStatistics(List.of(textDocumentStatistics));
        }        public GetIndexIndexStatistic build() {
            return new GetIndexIndexStatistic(faqStatistics, textDocumentStatistics);
        }
    }
}
