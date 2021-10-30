package com.example.footballapp.model.response.leagueSearch


import com.google.gson.annotations.SerializedName

data class Fixtures(
    @SerializedName("events")
    val events: Boolean?,
    @SerializedName("lineups")
    val lineups: Boolean?,
    @SerializedName("statistics_fixtures")
    val statisticsFixtures: Boolean?,
    @SerializedName("statistics_players")
    val statisticsPlayers: Boolean?
)