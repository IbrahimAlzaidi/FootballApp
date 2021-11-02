package com.example.footballapp.model.response.leagueSearch


import com.example.footballapp.model.response.base.baseLeague.LeagueInfo
import com.example.footballapp.model.response.base.baseResponse.Paging
import com.example.footballapp.model.response.base.baseResponse.Parameters
import com.google.gson.annotations.SerializedName

data class LeagueSearchResponse(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val responseType: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val searchInfo: List<LeagueInfo>?,
    @SerializedName("results")
    val results: Int?
)