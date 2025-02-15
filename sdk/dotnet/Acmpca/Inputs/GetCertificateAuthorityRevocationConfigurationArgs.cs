// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Acmpca.Inputs
{

    public sealed class GetCertificateAuthorityRevocationConfigurationInputArgs : Pulumi.ResourceArgs
    {
        [Input("crlConfigurations", required: true)]
        private InputList<Inputs.GetCertificateAuthorityRevocationConfigurationCrlConfigurationInputArgs>? _crlConfigurations;
        public InputList<Inputs.GetCertificateAuthorityRevocationConfigurationCrlConfigurationInputArgs> CrlConfigurations
        {
            get => _crlConfigurations ?? (_crlConfigurations = new InputList<Inputs.GetCertificateAuthorityRevocationConfigurationCrlConfigurationInputArgs>());
            set => _crlConfigurations = value;
        }

        [Input("ocspConfigurations", required: true)]
        private InputList<Inputs.GetCertificateAuthorityRevocationConfigurationOcspConfigurationInputArgs>? _ocspConfigurations;
        public InputList<Inputs.GetCertificateAuthorityRevocationConfigurationOcspConfigurationInputArgs> OcspConfigurations
        {
            get => _ocspConfigurations ?? (_ocspConfigurations = new InputList<Inputs.GetCertificateAuthorityRevocationConfigurationOcspConfigurationInputArgs>());
            set => _ocspConfigurations = value;
        }

        public GetCertificateAuthorityRevocationConfigurationInputArgs()
        {
        }
    }
}
