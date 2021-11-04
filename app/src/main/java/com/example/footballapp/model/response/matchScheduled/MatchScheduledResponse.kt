package com.example.footballapp.model.response.matchScheduled


import com.example.footballapp.model.response.base.Paging
import com.google.gson.annotations.SerializedName

data class MatchScheduledResponse(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val get: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val matchScheduledInfo: List<MatchScheduledInfo>?,
    @SerializedName("results")
    val results: Int?
)
