package com.example.footballapp.model.response.fixtureData


import com.example.footballapp.model.response.base.baseMatch.*
import com.example.footballapp.model.response.lineup.LineupInfo
import com.example.footballapp.model.response.liveMatches.Event
import com.example.footballapp.model.response.matchStatistic.MatchStatisticInfo
import com.google.gson.annotations.SerializedName

data class FixtureDataInfo(
    @SerializedName("events")
    val events: List<Event>?,
    @SerializedName("fixture")
    val fixture: Fixture?,
    @SerializedName("goals")
    val goals: MatchGoals<Int>?,
    @SerializedName("league")
    val league: League?,
    @SerializedName("lineups")
    val lineups: List<LineupInfo>?,
    @SerializedName("players")
    val players: List<Players>?,
    @SerializedName("score")
    val score: Score?,
    @SerializedName("statistics")
    val statistics: List<MatchStatisticInfo>?,
    @SerializedName("teams")
    val teams: Teams?
)
