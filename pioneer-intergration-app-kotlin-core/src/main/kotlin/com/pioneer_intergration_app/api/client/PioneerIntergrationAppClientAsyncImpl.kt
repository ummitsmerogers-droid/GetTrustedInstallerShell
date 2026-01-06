// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.client

import com.pioneer_intergration_app.api.core.ClientOptions
import com.pioneer_intergration_app.api.core.getPackageVersion
import com.pioneer_intergration_app.api.services.async.PetServiceAsync
import com.pioneer_intergration_app.api.services.async.PetServiceAsyncImpl
import com.pioneer_intergration_app.api.services.async.StoreServiceAsync
import com.pioneer_intergration_app.api.services.async.StoreServiceAsyncImpl
import com.pioneer_intergration_app.api.services.async.UserServiceAsync
import com.pioneer_intergration_app.api.services.async.UserServiceAsyncImpl

class PioneerIntergrationAppClientAsyncImpl(private val clientOptions: ClientOptions) :
    PioneerIntergrationAppClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: PioneerIntergrationAppClient by lazy {
        PioneerIntergrationAppClientImpl(clientOptions)
    }

    private val withRawResponse: PioneerIntergrationAppClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pets: PetServiceAsync by lazy { PetServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val store: StoreServiceAsync by lazy {
        StoreServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): PioneerIntergrationAppClient = sync

    override fun withRawResponse(): PioneerIntergrationAppClientAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): PioneerIntergrationAppClientAsync =
        PioneerIntergrationAppClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun pets(): PetServiceAsync = pets

    override fun store(): StoreServiceAsync = store

    override fun users(): UserServiceAsync = users

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PioneerIntergrationAppClientAsync.WithRawResponse {

        private val pets: PetServiceAsync.WithRawResponse by lazy {
            PetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreServiceAsync.WithRawResponse by lazy {
            StoreServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PioneerIntergrationAppClientAsync.WithRawResponse =
            PioneerIntergrationAppClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun pets(): PetServiceAsync.WithRawResponse = pets

        override fun store(): StoreServiceAsync.WithRawResponse = store

        override fun users(): UserServiceAsync.WithRawResponse = users
    }
}
