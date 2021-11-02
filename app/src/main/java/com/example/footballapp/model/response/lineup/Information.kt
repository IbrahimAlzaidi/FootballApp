package com.example.footballapp.model.response.lineup


import com.google.gson.annotations.SerializedName

data class Information(
    @SerializedName("playerInfo")
    val playerInfo: PlayerInfo?
)