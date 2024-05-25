package com.sevval.myapplication.network

data class ApiResponse(
    val id :Int,
    val date: String,
    val horoscope: String,
    val icon: String,
    val sign:String
) {
}

