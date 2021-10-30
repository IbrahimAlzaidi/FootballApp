package com.example.footballapp.model.response.liveMatches


import com.google.gson.annotations.SerializedName

data class Periods(
    @SerializedName("first")
    val first: Int?,
    @SerializedName("second")
    val second: Any?
)
