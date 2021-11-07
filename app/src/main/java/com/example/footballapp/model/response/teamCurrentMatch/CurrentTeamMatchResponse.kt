package com.example.footballapp.model.response.teamCurrentMatch


import com.example.footballapp.model.response.base.Paging
import com.google.gson.annotations.SerializedName

data class CurrentTeamMatchResponse(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val get: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val currentMatchInfo: List<CurrentMatchInfo>?,
    @SerializedName("results")
    val results: Int?
)
