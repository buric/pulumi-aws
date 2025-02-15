// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecrpublic

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The Public ECR Authorization Token data source allows the authorization token, token expiration date, user name and password to be retrieved for a Public ECR repository.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ecrpublic"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := ecrpublic.GetAuthorizationToken(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetAuthorizationToken(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetAuthorizationTokenResult, error) {
	var rv GetAuthorizationTokenResult
	err := ctx.Invoke("aws:ecrpublic/getAuthorizationToken:getAuthorizationToken", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getAuthorizationToken.
type GetAuthorizationTokenResult struct {
	// Temporary IAM authentication credentials to access the ECR repository encoded in base64 in the form of `user_name:password`.
	AuthorizationToken string `pulumi:"authorizationToken"`
	// The time in UTC RFC3339 format when the authorization token expires.
	ExpiresAt string `pulumi:"expiresAt"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Password decoded from the authorization token.
	Password string `pulumi:"password"`
	// User name decoded from the authorization token.
	UserName string `pulumi:"userName"`
}
