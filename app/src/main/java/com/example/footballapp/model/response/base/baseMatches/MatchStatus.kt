package com.example.footballapp.model.response.base.baseMatches


import com.google.gson.annotations.SerializedName

data class MatchStatus(
    @SerializedName("elapsed")
    val elapsed: Int?,
    @SerializedName("long")
    val longMatch: String?,
    @SerializedName("short")
    val short: String?
)
