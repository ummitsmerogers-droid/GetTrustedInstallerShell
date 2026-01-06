// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.services.blocking

import com.pioneer_intergration_app.api.core.ClientOptions
import com.pioneer_intergration_app.api.core.RequestOptions
import com.pioneer_intergration_app.api.core.handlers.errorBodyHandler
import com.pioneer_intergration_app.api.core.handlers.errorHandler
import com.pioneer_intergration_app.api.core.handlers.jsonHandler
import com.pioneer_intergration_app.api.core.http.HttpMethod
import com.pioneer_intergration_app.api.core.http.HttpRequest
import com.pioneer_intergration_app.api.core.http.HttpResponse
import com.pioneer_intergration_app.api.core.http.HttpResponse.Handler
import com.pioneer_intergration_app.api.core.http.HttpResponseFor
import com.pioneer_intergration_app.api.core.http.parseable
import com.pioneer_intergration_app.api.core.prepare
import com.pioneer_intergration_app.api.models.store.StoreListInventoryParams
import com.pioneer_intergration_app.api.models.store.StoreListInventoryResponse
import com.pioneer_intergration_app.api.services.blocking.store.OrderService
import com.pioneer_intergration_app.api.services.blocking.store.OrderServiceImpl

class StoreServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StoreService {

    private val withRawResponse: StoreService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val orders: OrderService by lazy { OrderServiceImpl(clientOptions) }

    override fun withRawResponse(): StoreService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StoreService =
        StoreServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun orders(): OrderService = orders

    override fun listInventory(
        params: StoreListInventoryParams,
        requestOptions: RequestOptions,
    ): StoreListInventoryResponse =
        // get /store/inventory
        withRawResponse().listInventory(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StoreService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val orders: OrderService.WithRawResponse by lazy {
            OrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): StoreService.WithRawResponse =
            StoreServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun orders(): OrderService.WithRawResponse = orders

        private val listInventoryHandler: Handler<StoreListInventoryResponse> =
            jsonHandler<StoreListInventoryResponse>(clientOptions.jsonMapper)

        override fun listInventory(
            params: StoreListInventoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StoreListInventoryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("store", "inventory")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listInventoryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
