package com.sevval.myapplication.network

import retrofit2.Response
import retrofit2.http.GET
interface Api {
    @GET("today/{horoscopeName}")
      suspend fun getData(): Response<Horoscope>
}