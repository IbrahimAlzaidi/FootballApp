package com.example.footballapp.model.response.liveMatches


import com.google.gson.annotations.SerializedName

data class Penalty(
    @SerializedName("away")
    val away: String?,
    @SerializedName("home")
    val home: String?
)
