package com.example.footballapp.model.response.fixtureData


import com.example.footballapp.model.response.base.baseMatch.TeamInfo
import com.google.gson.annotations.SerializedName

data class Players(
    @SerializedName("players")
    val playerInfo: List<PlayerInfo>?,
    @SerializedName("team")
    val team: TeamInfo?
)
