package com.example.footballapp.model.response.base.baseMatch


import com.google.gson.annotations.SerializedName

data class Periods(
    @SerializedName("first")
    val first: String?,
    @SerializedName("second")
    val second: String?
)
