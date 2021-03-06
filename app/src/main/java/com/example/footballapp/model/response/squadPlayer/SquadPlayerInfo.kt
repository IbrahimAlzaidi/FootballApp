package com.example.footballapp.model.response.squadPlayer


import com.google.gson.annotations.SerializedName

data class SquadPlayerInfo(
    @SerializedName("players")
    val players: List<Player>?,
    @SerializedName("team")
    val team: Team?
)
