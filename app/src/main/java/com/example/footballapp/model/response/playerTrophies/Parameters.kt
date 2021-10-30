package com.example.footballapp.model.response.playerTrophies


import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("player")
    val player: String?
)