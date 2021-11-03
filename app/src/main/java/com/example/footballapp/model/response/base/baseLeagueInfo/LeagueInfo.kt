package com.example.footballapp.model.response.base.baseLeagueInfo


import com.example.footballapp.model.response.base.baseSeason.Season
import com.google.gson.annotations.SerializedName

data class LeagueInfo(
    @SerializedName("country")
    val country: Country?,
    @SerializedName("league")
    val league: League?,
    @SerializedName("seasons")
    val seasons: List<Season>?
)