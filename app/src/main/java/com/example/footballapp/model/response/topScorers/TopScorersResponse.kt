package com.example.footballapp.model.response.topScorers


import com.example.footballapp.model.response.base.basePlayerStatistic.PlayerStatistic
import com.example.footballapp.model.response.base.baseResponse.Paging
import com.example.footballapp.model.response.standing.Parameters
import com.google.gson.annotations.SerializedName

data class TopScorersResponse(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val get: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val topScorersInfo: List<PlayerStatistic>?,
    @SerializedName("results")
    val results: Int?
)