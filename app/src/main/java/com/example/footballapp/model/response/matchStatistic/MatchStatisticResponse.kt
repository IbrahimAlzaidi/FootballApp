package com.example.footballapp.model.response.matchStatistic


import com.example.footballapp.model.response.base.baseResponse.Paging
import com.example.footballapp.model.response.base.baseResponse.Parameters
import com.google.gson.annotations.SerializedName

data class MatchStatisticResponse(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val get: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val matchStatisticInfo: List<MatchStatisticInfo>?,
    @SerializedName("results")
    val results: Int?
)