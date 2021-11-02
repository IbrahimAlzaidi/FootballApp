package com.example.footballapp.model.response.teamInfo


import com.example.footballapp.model.response.base.basePlayerStatistic.League
import com.example.footballapp.model.response.base.basePlayerStatistic.Team
import com.google.gson.annotations.SerializedName

data class TeamInformation(
    @SerializedName("biggest")
    val biggest: Biggest?,
    @SerializedName("cards")
    val cards: Cards?,
    @SerializedName("clean_sheet")
    val cleanSheet: BaseFixtures?,
    @SerializedName("failed_to_score")
    val failedToScore: BaseFixtures?,
    @SerializedName("fixtures")
    val fixtures: Fixtures?,
    @SerializedName("form")
    val form: String?,
    @SerializedName("goals")
    val goals: Goals?,
    @SerializedName("leagueInfo")
    val league: League?,
    @SerializedName("lineups")
    val lineups: List<Lineup>?,
    @SerializedName("penalty")
    val penalty: Penalty?,
    @SerializedName("teamInfo")
    val team: Team?
)