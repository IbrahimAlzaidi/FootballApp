package com.example.footballapp.model.response.liveMatches


import com.example.footballapp.model.response.base.basePlayerStatistic.Team
import com.google.gson.annotations.SerializedName

data class Event(
    @SerializedName("assist")
    val playerAssist: PlayerInfo?,
    @SerializedName("comments")
    val comments: String?,
    @SerializedName("detail")
    val detail: String?,
    @SerializedName("player")
    val playerInfo: PlayerInfo?,
    @SerializedName("team")
    val teamInfo: Team?,
    @SerializedName("time")
    val time: Time?,
    @SerializedName("type")
    val type: String?
)
