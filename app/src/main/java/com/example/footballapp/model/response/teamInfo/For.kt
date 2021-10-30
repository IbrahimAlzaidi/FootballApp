package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class For(
    @SerializedName("away")
    val away: Int?,
    @SerializedName("home")
    val home: Int?
)