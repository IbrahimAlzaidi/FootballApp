package com.example.footballapp.model.response.lineup


import com.google.gson.annotations.SerializedName

data class PlayerStartMatch(
    @SerializedName("player")
    val player: PlayerID?
)