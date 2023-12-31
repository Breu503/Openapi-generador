/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#include "OpenAPIStoreApiOperations.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace OpenAPI
{

FString OpenAPIStoreApi::DeleteOrderRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("orderId"), FStringFormatArg(ToUrlString(OrderId)) } };

	FString Path = FString::Format(TEXT("/store/order/{orderId}"), PathParams);

	return Path;
}

void OpenAPIStoreApi::DeleteOrderRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = {  };

	HttpRequest->SetVerb(TEXT("DELETE"));

}

void OpenAPIStoreApi::DeleteOrderResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 400:
		SetResponseString(TEXT("Invalid ID supplied"));
		break;
	case 404:
		SetResponseString(TEXT("Order not found"));
		break;
	}
}

bool OpenAPIStoreApi::DeleteOrderResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return true;
}

FString OpenAPIStoreApi::GetInventoryRequest::ComputePath() const
{
	FString Path(TEXT("/store/inventory"));
	return Path;
}

void OpenAPIStoreApi::GetInventoryRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

}

void OpenAPIStoreApi::GetInventoryResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("successful operation"));
		break;
	}
}

bool OpenAPIStoreApi::GetInventoryResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIStoreApi::GetOrderByIdRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("orderId"), FStringFormatArg(ToUrlString(OrderId)) } };

	FString Path = FString::Format(TEXT("/store/order/{orderId}"), PathParams);

	return Path;
}

void OpenAPIStoreApi::GetOrderByIdRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/xml"), TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

}

void OpenAPIStoreApi::GetOrderByIdResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("successful operation"));
		break;
	case 400:
		SetResponseString(TEXT("Invalid ID supplied"));
		break;
	case 404:
		SetResponseString(TEXT("Order not found"));
		break;
	}
}

bool OpenAPIStoreApi::GetOrderByIdResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIStoreApi::PlaceOrderRequest::ComputePath() const
{
	FString Path(TEXT("/store/order"));
	return Path;
}

void OpenAPIStoreApi::PlaceOrderRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/xml"), TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
		// Body parameters
		FString JsonBody;
		JsonWriter Writer = TJsonWriterFactory<>::Create(&JsonBody);

		WriteJsonValue(Writer, Body);
		Writer->Close();

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (body) was ignored, not supported in multipart form"));
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (body) was ignored, not supported in urlencoded requests"));
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIStoreApi::PlaceOrderResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("successful operation"));
		break;
	case 400:
		SetResponseString(TEXT("Invalid Order"));
		break;
	}
}

bool OpenAPIStoreApi::PlaceOrderResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

}
