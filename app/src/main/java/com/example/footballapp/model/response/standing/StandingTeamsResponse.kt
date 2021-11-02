package com.example.footballapp.model.response.standing


import com.example.footballapp.model.response.base.baseResponse.Paging
import com.google.gson.annotations.SerializedName

data class StandingTeamsResponse(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val get: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val standingTeamInfo: List<StandingTeamInfo>?,
    @SerializedName("results")
    val results: Int?
)