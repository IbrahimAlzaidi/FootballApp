package com.example.footballapp.model.response.teamInfo


import com.example.footballapp.model.response.base.baseMatch.TeamID
import com.example.footballapp.model.response.base.basePlayerStatistic.League
import com.google.gson.annotations.SerializedName

data class TeamInformation(
    @SerializedName("biggest")
    val biggest: Biggest?,
    @SerializedName("cards")
    val cards: Cards?,
    @SerializedName("clean_sheet")
    val cleanSheet: ScoresInfo?,
    @SerializedName("failed_to_score")
    val failedToScore: ScoresInfo?,
    @SerializedName("fixtures")
    val fixtures: Fixtures?,
    @SerializedName("form")
    val form: String?,
    @SerializedName("goals")
    val goals: Goals?,
    @SerializedName("league")
    val league: League?,
    @SerializedName("lineups")
    val lineups: List<Lineup>?,
    @SerializedName("penalty")
    val penalty: Penalty?,
    @SerializedName("team")
    val team: TeamID?
)