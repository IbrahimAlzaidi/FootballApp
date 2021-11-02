package com.example.footballapp.model.response.liveMatches


import com.example.footballapp.model.response.base.baseMatches.*
import com.google.gson.annotations.SerializedName

data class LiveMatchesInfo(
    @SerializedName("events")
    val events: List<Event>?,
    @SerializedName("fixture")
    val fixture: Fixture?,
    @SerializedName("goals")
    val goals: Goals?,
    @SerializedName("league")
    val leagueInfo: LeagueInfo?,
    @SerializedName("score")
    val fullTimeMatchStatus: FullTimeMatchStatus?,
    @SerializedName("teams")
    val teams: Teams?
)
