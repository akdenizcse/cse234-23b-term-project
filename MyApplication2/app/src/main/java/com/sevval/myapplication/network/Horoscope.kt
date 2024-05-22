package com.sevval.myapplication.network

import com.google.gson.annotations.SerializedName

data class Horoscope(
    @SerializedName("date")
    val date: String="",
    @SerializedName("horoscope")
    val horoscopeText: String="",
    @SerializedName("sunsign")
    val sunsign: String=""
)
