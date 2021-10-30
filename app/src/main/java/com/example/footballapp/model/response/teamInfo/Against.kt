package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Against(
    @SerializedName("away")
    val away: Int?,
    @SerializedName("home")
    val home: Int?
)