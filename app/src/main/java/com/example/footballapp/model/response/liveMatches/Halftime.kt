package com.example.footballapp.model.response.liveMatches


import com.google.gson.annotations.SerializedName

data class Halftime(
    @SerializedName("away")
    val away: Int?,
    @SerializedName("home")
    val home: Int?
)
