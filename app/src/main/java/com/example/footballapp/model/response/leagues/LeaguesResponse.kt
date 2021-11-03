package com.example.footballapp.model.response.leagues


import com.example.footballapp.model.response.base.Paging
import com.example.footballapp.model.response.base.baseLeagueInfo.LeagueInfo
import com.google.gson.annotations.SerializedName

data class LeaguesResponse(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val get: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: List<String>?,
    @SerializedName("response")
    val leaguesDetails: List<LeagueInfo>?,
    @SerializedName("results")
    val results: Int?
)
