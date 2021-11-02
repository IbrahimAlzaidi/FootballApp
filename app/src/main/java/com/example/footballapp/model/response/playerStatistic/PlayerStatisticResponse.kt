package com.example.footballapp.model.response.playerStatistic


import com.example.footballapp.model.response.base.basePlayerStatistic.PlayerStatistic
import com.example.footballapp.model.response.base.baseResponse.Paging
import com.example.footballapp.model.response.base.baseResponse.Parameters
import com.google.gson.annotations.SerializedName

data class PlayerStatisticResponse(
    @SerializedName("errors")
    val errors: List<Any>?,
    @SerializedName("get")
    val get: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val playerStatistic: List<PlayerStatistic>?,
    @SerializedName("results")
    val results: Int?
)