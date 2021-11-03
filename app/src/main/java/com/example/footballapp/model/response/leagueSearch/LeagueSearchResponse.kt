package com.example.footballapp.model.response.leagueSearch


import com.example.footballapp.model.response.base.Paging
import com.example.footballapp.model.response.base.baseLeagueInfo.LeagueInfo
import com.google.gson.annotations.SerializedName

data class LeagueSearchResponse(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val get: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val leagueSearchInfo: List<LeagueInfo>?,
    @SerializedName("results")
    val results: Int?
)