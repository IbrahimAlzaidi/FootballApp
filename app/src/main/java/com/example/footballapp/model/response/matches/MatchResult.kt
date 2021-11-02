package com.example.footballapp.model.response.matches


import com.example.footballapp.model.response.base.baseMatches.*
import com.google.gson.annotations.SerializedName

data class MatchResult(
    @SerializedName("fixture")
    val fixture: Fixture?,
    @SerializedName("goals")
    val goals: Goals?,
    @SerializedName("leagueInfo")
    val league: LeagueInfo?,
    @SerializedName("fullTimeMatchStatus")
    val fullTimeMatchStatus: FullTimeMatchStatus?,
    @SerializedName("teams")
    val teams: Teams?
)