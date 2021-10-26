package com.example.footballapp.model.response.teams_response.standings


import com.google.gson.annotations.SerializedName

data class Standings(
    @SerializedName("competition")
    val competition: Competition?,
    @SerializedName("filters")
    val filters: Filters?,
    @SerializedName("season")
    val season: Season?,
    @SerializedName("standings")
    val standings: List<Standing>?
)
