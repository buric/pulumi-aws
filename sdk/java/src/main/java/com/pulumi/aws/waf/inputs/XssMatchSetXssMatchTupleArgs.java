// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.inputs;

import com.pulumi.aws.waf.inputs.XssMatchSetXssMatchTupleFieldToMatchArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class XssMatchSetXssMatchTupleArgs extends com.pulumi.resources.ResourceArgs {

    public static final XssMatchSetXssMatchTupleArgs Empty = new XssMatchSetXssMatchTupleArgs();

    /**
     * Specifies where in a web request to look for cross-site scripting attacks.
     * 
     */
    @Import(name="fieldToMatch", required=true)
    private Output<XssMatchSetXssMatchTupleFieldToMatchArgs> fieldToMatch;

    /**
     * @return Specifies where in a web request to look for cross-site scripting attacks.
     * 
     */
    public Output<XssMatchSetXssMatchTupleFieldToMatchArgs> fieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * If you specify a transformation, AWS WAF performs the transformation on `target_string` before inspecting a request for a match.
     * e.g., `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_XssMatchTuple.html#WAF-Type-XssMatchTuple-TextTransformation)
     * for all supported values.
     * 
     */
    @Import(name="textTransformation", required=true)
    private Output<String> textTransformation;

    /**
     * @return Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * If you specify a transformation, AWS WAF performs the transformation on `target_string` before inspecting a request for a match.
     * e.g., `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_XssMatchTuple.html#WAF-Type-XssMatchTuple-TextTransformation)
     * for all supported values.
     * 
     */
    public Output<String> textTransformation() {
        return this.textTransformation;
    }

    private XssMatchSetXssMatchTupleArgs() {}

    private XssMatchSetXssMatchTupleArgs(XssMatchSetXssMatchTupleArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.textTransformation = $.textTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(XssMatchSetXssMatchTupleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private XssMatchSetXssMatchTupleArgs $;

        public Builder() {
            $ = new XssMatchSetXssMatchTupleArgs();
        }

        public Builder(XssMatchSetXssMatchTupleArgs defaults) {
            $ = new XssMatchSetXssMatchTupleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldToMatch Specifies where in a web request to look for cross-site scripting attacks.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(Output<XssMatchSetXssMatchTupleFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        /**
         * @param fieldToMatch Specifies where in a web request to look for cross-site scripting attacks.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(XssMatchSetXssMatchTupleFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        /**
         * @param textTransformation Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
         * If you specify a transformation, AWS WAF performs the transformation on `target_string` before inspecting a request for a match.
         * e.g., `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
         * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_XssMatchTuple.html#WAF-Type-XssMatchTuple-TextTransformation)
         * for all supported values.
         * 
         * @return builder
         * 
         */
        public Builder textTransformation(Output<String> textTransformation) {
            $.textTransformation = textTransformation;
            return this;
        }

        /**
         * @param textTransformation Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
         * If you specify a transformation, AWS WAF performs the transformation on `target_string` before inspecting a request for a match.
         * e.g., `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
         * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_XssMatchTuple.html#WAF-Type-XssMatchTuple-TextTransformation)
         * for all supported values.
         * 
         * @return builder
         * 
         */
        public Builder textTransformation(String textTransformation) {
            return textTransformation(Output.of(textTransformation));
        }

        public XssMatchSetXssMatchTupleArgs build() {
            $.fieldToMatch = Objects.requireNonNull($.fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
            $.textTransformation = Objects.requireNonNull($.textTransformation, "expected parameter 'textTransformation' to be non-null");
            return $;
        }
    }

}
