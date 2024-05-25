package com.sevval.myapplication.network

import android.graphics.drawable.Drawable
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback

class Modelview: ViewModel() {

    private val _response = MutableLiveData<ApiResponse>()
    val response: LiveData<ApiResponse> get() = _response

    fun getHoroscopeFromAPI(sign:String) {
        val request=ApiRequest("2020-01-01","en",sign)
        RetrofitInstance.api.sendRequest(request).enqueue(object : Callback<ApiResponse> {
            override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
                if (response.isSuccessful) {
                    Log.d("hatamVM", response.body().toString()+"dasda")
                    _response.value = response.body()
                }else{
                    Log.e("hatamVM", response.code().toString())
                }
            }

            override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                // Hata durumunda yapılacak işlemler
                Log.e("hatamVM", t.message.toString())
            }
        })
    }


}

