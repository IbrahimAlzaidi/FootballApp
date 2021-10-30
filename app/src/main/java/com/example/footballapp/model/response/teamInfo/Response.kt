package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("biggest")
    val biggest: Biggest?,
    @SerializedName("cards")
    val cards: Cards?,
    @SerializedName("clean_sheet")
    val cleanSheet: CleanSheet?,
    @SerializedName("failed_to_score")
    val failedToScore: FailedToScore?,
    @SerializedName("fixtures")
    val fixtures: Fixtures?,
    @SerializedName("form")
    val form: String?,
    @SerializedName("goals")
    val goals: GoalsX?,
    @SerializedName("league")
    val league: League?,
    @SerializedName("lineups")
    val lineups: List<Lineup>?,
    @SerializedName("penalty")
    val penalty: Penalty?,
    @SerializedName("team")
    val team: Team?
)