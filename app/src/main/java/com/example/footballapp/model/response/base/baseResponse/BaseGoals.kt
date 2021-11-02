package com.example.footballapp.model.response.base.baseResponse

import com.google.gson.annotations.SerializedName

data class BaseGoals<T> (
    @SerializedName("away")
    val away: T?,
    @SerializedName("home")
    val home: T?
    )