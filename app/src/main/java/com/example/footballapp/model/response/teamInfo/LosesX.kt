package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class LosesX(
    @SerializedName("away")
    val away: Int?,
    @SerializedName("home")
    val home: Int?,
    @SerializedName("total")
    val total: Int?
)