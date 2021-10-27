package com.example.footballapp.model.network

import android.util.Log
import com.example.footballapp.util.Constant.API_TOKEN
import com.example.footballapp.util.Constant.AUTH_NAME_HEADER
import com.example.footballapp.util.Constant.TAG
import okhttp3.*

object MyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val mRequest = chain.request()
            .newBuilder()
            .header(AUTH_NAME_HEADER,API_TOKEN)
            .build()
        val mResponse = chain.proceed(mRequest)
        Log.i(TAG, "intercept: ${mResponse.body}")
        return mResponse
    }
}
