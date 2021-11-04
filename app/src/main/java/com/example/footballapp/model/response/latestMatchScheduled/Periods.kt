package com.example.footballapp.model.response.latestMatchScheduled


import com.google.gson.annotations.SerializedName

data class Periods(
    @SerializedName("first")
    val first: Any?,
    @SerializedName("second")
    val second: Any?
)
