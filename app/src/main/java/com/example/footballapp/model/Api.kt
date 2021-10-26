package com.example.footballapp.model

import com.example.footballapp.util.Constant
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object Api {
    private val clientInterceptor = OkHttpClient.Builder().addInterceptor(MyInterceptor).build()
    private val retrofit = Retrofit.Builder()
        .baseUrl(Constant.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(clientInterceptor)
        .build()

    val apiService: ApiService = retrofit.create(ApiService::class.java)
}
