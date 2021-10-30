package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Wins(
    @SerializedName("away")
    val away: String?,
    @SerializedName("home")
    val home: String?
)