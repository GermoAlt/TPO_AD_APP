package com.ad.grupo10.gestionbarrial.rest

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RestAPI {

    companion object {
        private const val BASE_URL: String = "http://190.210.233.91:8080/api/"
        private val instance: Retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(
            GsonConverterFactory.create()).build()
        val api:RestApiInterface = instance.create(RestApiInterface::class.java)
    }
}