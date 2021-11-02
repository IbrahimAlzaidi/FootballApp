package com.example.footballapp.model.response.leagues


import com.example.footballapp.model.response.base.baseLeague.LeagueInfo
import com.example.footballapp.model.response.base.baseResponse.Paging
import com.google.gson.annotations.SerializedName

data class LeaguesResponse(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val get: String?,
    @SerializedName("paging")
    val pagingCount: Paging?,
    @SerializedName("parameters")
    val parameters: List<String>?,
    @SerializedName("response")
    val leaguesInfo: List<LeagueInfo>?,
    @SerializedName("results")
    val resultsCount: Int?
)
