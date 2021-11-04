package com.example.footballapp.model.response.latestMatchScheduled


import com.google.gson.annotations.SerializedName

data class Status(
    @SerializedName("elapsed")
    val elapsed: Any?,
    @SerializedName("long")
    val longMatch: String?,
    @SerializedName("short")
    val short: String?
)
