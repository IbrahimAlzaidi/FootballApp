package com.example.footballapp.model.response.base.baseMatches


import com.google.gson.annotations.SerializedName

data class Periods(
    @SerializedName("first")
    val first: Int?,
    @SerializedName("second")
    val second: String?
)
