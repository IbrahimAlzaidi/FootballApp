package com.example.footballapp.model.response.standing


import com.example.footballapp.model.response.base.baseMatch.TeamID
import com.google.gson.annotations.SerializedName

data class Standing(
    @SerializedName("all")
    val all: TeamStatistic?,
    @SerializedName("away")
    val away: TeamStatistic?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("form")
    val form: String?,
    @SerializedName("goalsDiff")
    val goalsDiff: Int?,
    @SerializedName("group")
    val group: String?,
    @SerializedName("home")
    val home: TeamStatistic?,
    @SerializedName("points")
    val points: Int?,
    @SerializedName("rank")
    val rank: Int?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("team")
    val team: TeamID?,
    @SerializedName("update")
    val update: String?
)