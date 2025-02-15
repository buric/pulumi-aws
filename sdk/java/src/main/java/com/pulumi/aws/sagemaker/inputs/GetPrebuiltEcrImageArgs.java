// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrebuiltEcrImageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrebuiltEcrImageArgs Empty = new GetPrebuiltEcrImageArgs();

    /**
     * The DNS suffix to use in the registry path. If not specified, the AWS provider sets it to the DNS suffix for the current region.
     * 
     */
    @Import(name="dnsSuffix")
    private @Nullable Output<String> dnsSuffix;

    /**
     * @return The DNS suffix to use in the registry path. If not specified, the AWS provider sets it to the DNS suffix for the current region.
     * 
     */
    public Optional<Output<String>> dnsSuffix() {
        return Optional.ofNullable(this.dnsSuffix);
    }

    /**
     * The image tag for the Docker image. If not specified, the AWS provider sets the value to `1`, which for many repositories indicates the latest version. Some repositories, such as XGBoost, do not support `1` or `latest` and specific version must be used.
     * 
     */
    @Import(name="imageTag")
    private @Nullable Output<String> imageTag;

    /**
     * @return The image tag for the Docker image. If not specified, the AWS provider sets the value to `1`, which for many repositories indicates the latest version. Some repositories, such as XGBoost, do not support `1` or `latest` and specific version must be used.
     * 
     */
    public Optional<Output<String>> imageTag() {
        return Optional.ofNullable(this.imageTag);
    }

    /**
     * The region to use in the registry path. If not specified, the AWS provider sets it to the current region.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region to use in the registry path. If not specified, the AWS provider sets it to the current region.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The name of the repository, which is generally the algorithm or library. Values include `blazingtext`, `factorization-machines`, `forecasting-deepar`, `image-classification`, `ipinsights`, `kmeans`, `knn`, `lda`, `linear-learner`, `mxnet-inference-eia`, `mxnet-inference`, `mxnet-training`, `ntm`, `object-detection`, `object2vec`, `pca`, `pytorch-inference-eia`, `pytorch-inference`, `pytorch-training`, `randomcutforest`, `sagemaker-scikit-learn`, `sagemaker-sparkml-serving`, `sagemaker-xgboost`, `semantic-segmentation`, `seq2seq`, `tensorflow-inference-eia`, `tensorflow-inference`, `tensorflow-training`, `huggingface-tensorflow-training`, `huggingface-tensorflow-inference`, `huggingface-pytorch-training`, and `huggingface-pytorch-inference`.
     * 
     */
    @Import(name="repositoryName", required=true)
    private Output<String> repositoryName;

    /**
     * @return The name of the repository, which is generally the algorithm or library. Values include `blazingtext`, `factorization-machines`, `forecasting-deepar`, `image-classification`, `ipinsights`, `kmeans`, `knn`, `lda`, `linear-learner`, `mxnet-inference-eia`, `mxnet-inference`, `mxnet-training`, `ntm`, `object-detection`, `object2vec`, `pca`, `pytorch-inference-eia`, `pytorch-inference`, `pytorch-training`, `randomcutforest`, `sagemaker-scikit-learn`, `sagemaker-sparkml-serving`, `sagemaker-xgboost`, `semantic-segmentation`, `seq2seq`, `tensorflow-inference-eia`, `tensorflow-inference`, `tensorflow-training`, `huggingface-tensorflow-training`, `huggingface-tensorflow-inference`, `huggingface-pytorch-training`, and `huggingface-pytorch-inference`.
     * 
     */
    public Output<String> repositoryName() {
        return this.repositoryName;
    }

    private GetPrebuiltEcrImageArgs() {}

    private GetPrebuiltEcrImageArgs(GetPrebuiltEcrImageArgs $) {
        this.dnsSuffix = $.dnsSuffix;
        this.imageTag = $.imageTag;
        this.region = $.region;
        this.repositoryName = $.repositoryName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrebuiltEcrImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrebuiltEcrImageArgs $;

        public Builder() {
            $ = new GetPrebuiltEcrImageArgs();
        }

        public Builder(GetPrebuiltEcrImageArgs defaults) {
            $ = new GetPrebuiltEcrImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsSuffix The DNS suffix to use in the registry path. If not specified, the AWS provider sets it to the DNS suffix for the current region.
         * 
         * @return builder
         * 
         */
        public Builder dnsSuffix(@Nullable Output<String> dnsSuffix) {
            $.dnsSuffix = dnsSuffix;
            return this;
        }

        /**
         * @param dnsSuffix The DNS suffix to use in the registry path. If not specified, the AWS provider sets it to the DNS suffix for the current region.
         * 
         * @return builder
         * 
         */
        public Builder dnsSuffix(String dnsSuffix) {
            return dnsSuffix(Output.of(dnsSuffix));
        }

        /**
         * @param imageTag The image tag for the Docker image. If not specified, the AWS provider sets the value to `1`, which for many repositories indicates the latest version. Some repositories, such as XGBoost, do not support `1` or `latest` and specific version must be used.
         * 
         * @return builder
         * 
         */
        public Builder imageTag(@Nullable Output<String> imageTag) {
            $.imageTag = imageTag;
            return this;
        }

        /**
         * @param imageTag The image tag for the Docker image. If not specified, the AWS provider sets the value to `1`, which for many repositories indicates the latest version. Some repositories, such as XGBoost, do not support `1` or `latest` and specific version must be used.
         * 
         * @return builder
         * 
         */
        public Builder imageTag(String imageTag) {
            return imageTag(Output.of(imageTag));
        }

        /**
         * @param region The region to use in the registry path. If not specified, the AWS provider sets it to the current region.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region to use in the registry path. If not specified, the AWS provider sets it to the current region.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param repositoryName The name of the repository, which is generally the algorithm or library. Values include `blazingtext`, `factorization-machines`, `forecasting-deepar`, `image-classification`, `ipinsights`, `kmeans`, `knn`, `lda`, `linear-learner`, `mxnet-inference-eia`, `mxnet-inference`, `mxnet-training`, `ntm`, `object-detection`, `object2vec`, `pca`, `pytorch-inference-eia`, `pytorch-inference`, `pytorch-training`, `randomcutforest`, `sagemaker-scikit-learn`, `sagemaker-sparkml-serving`, `sagemaker-xgboost`, `semantic-segmentation`, `seq2seq`, `tensorflow-inference-eia`, `tensorflow-inference`, `tensorflow-training`, `huggingface-tensorflow-training`, `huggingface-tensorflow-inference`, `huggingface-pytorch-training`, and `huggingface-pytorch-inference`.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(Output<String> repositoryName) {
            $.repositoryName = repositoryName;
            return this;
        }

        /**
         * @param repositoryName The name of the repository, which is generally the algorithm or library. Values include `blazingtext`, `factorization-machines`, `forecasting-deepar`, `image-classification`, `ipinsights`, `kmeans`, `knn`, `lda`, `linear-learner`, `mxnet-inference-eia`, `mxnet-inference`, `mxnet-training`, `ntm`, `object-detection`, `object2vec`, `pca`, `pytorch-inference-eia`, `pytorch-inference`, `pytorch-training`, `randomcutforest`, `sagemaker-scikit-learn`, `sagemaker-sparkml-serving`, `sagemaker-xgboost`, `semantic-segmentation`, `seq2seq`, `tensorflow-inference-eia`, `tensorflow-inference`, `tensorflow-training`, `huggingface-tensorflow-training`, `huggingface-tensorflow-inference`, `huggingface-pytorch-training`, and `huggingface-pytorch-inference`.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(String repositoryName) {
            return repositoryName(Output.of(repositoryName));
        }

        public GetPrebuiltEcrImageArgs build() {
            $.repositoryName = Objects.requireNonNull($.repositoryName, "expected parameter 'repositoryName' to be non-null");
            return $;
        }
    }

}
