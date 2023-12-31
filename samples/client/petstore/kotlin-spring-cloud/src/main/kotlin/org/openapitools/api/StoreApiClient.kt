package org.openapitools.api

import org.springframework.cloud.openfeign.FeignClient
import org.openapitools.configuration.ClientConfiguration

@FeignClient(
    name="\${store.name:store}",
    url="\${store.url:http://petstore.swagger.io/v2}", 
    configuration = [ClientConfiguration::class]
)
interface StoreApiClient : StoreApi
