package com.example.footballapp.model.response.standing


import com.example.footballapp.model.response.base.basePlayerStatistic.Team
import com.google.gson.annotations.SerializedName

data class StandingDetails(
    @SerializedName("all")
    val teamStatistic: TeamStatistic?,
    @SerializedName("away")
    val away: TeamStatistic?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("form")
    val winForm: String?,
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
    val team: Team?,
    @SerializedName("update")
    val update: String?
)