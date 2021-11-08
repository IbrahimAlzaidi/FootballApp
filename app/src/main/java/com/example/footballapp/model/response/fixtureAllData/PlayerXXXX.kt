package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class PlayerXXXX(
    @SerializedName("players")
    val players: List<PlayerXXXXX>?,
    @SerializedName("team")
    val team: TeamXX?
)
