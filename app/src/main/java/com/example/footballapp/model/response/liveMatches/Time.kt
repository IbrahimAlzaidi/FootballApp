package com.example.footballapp.model.response.liveMatches


import com.google.gson.annotations.SerializedName

data class Time(
    @SerializedName("elapsed")
    val elapsed: Int?,
    @SerializedName("extra")
    val extra: String?
)
