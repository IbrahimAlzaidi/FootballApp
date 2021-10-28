package com.example.footballapp.model.response.standings


import com.google.gson.annotations.SerializedName

data class Standings(
    @SerializedName("competition")
    val competition: List<Competition>?,
    @SerializedName("filters")
    val filters: Filters?,
    @SerializedName("season")
    val season: List<Season>?,
    @SerializedName("standings")
    val standings: List<Standing>?
)
