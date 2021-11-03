package com.example.footballapp.model.response.liveMatches


import com.example.footballapp.model.response.base.baseMatch.TeamID
import com.google.gson.annotations.SerializedName

data class Event(
    @SerializedName("assist")
    val assist: PlayerID?,
    @SerializedName("comments")
    val comments: String?,
    @SerializedName("detail")
    val detail: String?,
    @SerializedName("player")
    val player: PlayerID?,
    @SerializedName("team")
    val team: TeamID?,
    @SerializedName("time")
    val time: Time?,
    @SerializedName("type")
    val type: String?
)
