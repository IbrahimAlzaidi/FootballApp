package com.example.footballapp.model.response.lineup


import com.google.gson.annotations.SerializedName

data class Colors(
    @SerializedName("goalkeeperColor")
    val goalkeeperColorColor: PlayersColor?,
    @SerializedName("playerInfo")
    val playersColor: PlayersColor?
)