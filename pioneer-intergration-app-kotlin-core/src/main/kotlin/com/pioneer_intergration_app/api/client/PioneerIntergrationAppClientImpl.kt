// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.client

import com.pioneer_intergration_app.api.core.ClientOptions
import com.pioneer_intergration_app.api.core.getPackageVersion
import com.pioneer_intergration_app.api.services.blocking.PetService
import com.pioneer_intergration_app.api.services.blocking.PetServiceImpl
import com.pioneer_intergration_app.api.services.blocking.StoreService
import com.pioneer_intergration_app.api.services.blocking.StoreServiceImpl
import com.pioneer_intergration_app.api.services.blocking.UserService
import com.pioneer_intergration_app.api.services.blocking.UserServiceImpl

class PioneerIntergrationAppClientImpl(private val clientOptions: ClientOptions) :
    PioneerIntergrationAppClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: PioneerIntergrationAppClientAsync by lazy {
        PioneerIntergrationAppClientAsyncImpl(clientOptions)
    }

    private val withRawResponse: PioneerIntergrationAppClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pets: PetService by lazy { PetServiceImpl(clientOptionsWithUserAgent) }

    private val store: StoreService by lazy { StoreServiceImpl(clientOptionsWithUserAgent) }

    private val users: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): PioneerIntergrationAppClientAsync = async

    override fun withRawResponse(): PioneerIntergrationAppClient.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): PioneerIntergrationAppClient =
        PioneerIntergrationAppClientImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Everything about your Pets */
    override fun pets(): PetService = pets

    /** Access to Petstore orders */
    override fun store(): StoreService = store

    /** Operations about user */
    override fun users(): UserService = users

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PioneerIntergrationAppClient.WithRawResponse {

        private val pets: PetService.WithRawResponse by lazy {
            PetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreService.WithRawResponse by lazy {
            StoreServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PioneerIntergrationAppClient.WithRawResponse =
            PioneerIntergrationAppClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** Everything about your Pets */
        override fun pets(): PetService.WithRawResponse = pets

        /** Access to Petstore orders */
        override fun store(): StoreService.WithRawResponse = store

        /** Operations about user */
        override fun users(): UserService.WithRawResponse = users
    }
}
