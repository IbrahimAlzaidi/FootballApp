package com.example.footballapp.model.response.liveMatches


import com.google.gson.annotations.SerializedName

data class Status(
    @SerializedName("elapsed")
    val elapsed: Int?,
    @SerializedName("long")
    val longMatch: String?,
    @SerializedName("short")
    val short: String?
)
