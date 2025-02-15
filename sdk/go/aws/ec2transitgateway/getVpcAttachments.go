// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec2transitgateway

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information on EC2 Transit Gateway VPC Attachments.
//
// ## Example Usage
func GetVpcAttachments(ctx *pulumi.Context, args *GetVpcAttachmentsArgs, opts ...pulumi.InvokeOption) (*GetVpcAttachmentsResult, error) {
	var rv GetVpcAttachmentsResult
	err := ctx.Invoke("aws:ec2transitgateway/getVpcAttachments:getVpcAttachments", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVpcAttachments.
type GetVpcAttachmentsArgs struct {
	// One or more configuration blocks containing name-values filters. Detailed below.
	Filters []GetVpcAttachmentsFilter `pulumi:"filters"`
}

// A collection of values returned by getVpcAttachments.
type GetVpcAttachmentsResult struct {
	Filters []GetVpcAttachmentsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id  string   `pulumi:"id"`
	Ids []string `pulumi:"ids"`
}

func GetVpcAttachmentsOutput(ctx *pulumi.Context, args GetVpcAttachmentsOutputArgs, opts ...pulumi.InvokeOption) GetVpcAttachmentsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVpcAttachmentsResult, error) {
			args := v.(GetVpcAttachmentsArgs)
			r, err := GetVpcAttachments(ctx, &args, opts...)
			var s GetVpcAttachmentsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetVpcAttachmentsResultOutput)
}

// A collection of arguments for invoking getVpcAttachments.
type GetVpcAttachmentsOutputArgs struct {
	// One or more configuration blocks containing name-values filters. Detailed below.
	Filters GetVpcAttachmentsFilterArrayInput `pulumi:"filters"`
}

func (GetVpcAttachmentsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcAttachmentsArgs)(nil)).Elem()
}

// A collection of values returned by getVpcAttachments.
type GetVpcAttachmentsResultOutput struct{ *pulumi.OutputState }

func (GetVpcAttachmentsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcAttachmentsResult)(nil)).Elem()
}

func (o GetVpcAttachmentsResultOutput) ToGetVpcAttachmentsResultOutput() GetVpcAttachmentsResultOutput {
	return o
}

func (o GetVpcAttachmentsResultOutput) ToGetVpcAttachmentsResultOutputWithContext(ctx context.Context) GetVpcAttachmentsResultOutput {
	return o
}

func (o GetVpcAttachmentsResultOutput) Filters() GetVpcAttachmentsFilterArrayOutput {
	return o.ApplyT(func(v GetVpcAttachmentsResult) []GetVpcAttachmentsFilter { return v.Filters }).(GetVpcAttachmentsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetVpcAttachmentsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcAttachmentsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetVpcAttachmentsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVpcAttachmentsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVpcAttachmentsResultOutput{})
}
