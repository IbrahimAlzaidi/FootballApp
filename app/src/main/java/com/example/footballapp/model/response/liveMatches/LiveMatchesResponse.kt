package com.example.footballapp.model.response.liveMatches


import com.example.footballapp.model.response.base.Paging
import com.google.gson.annotations.SerializedName

data class LiveMatchesResponse(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val get: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val liveMatchDetails: List<LiveMatchDetails>?,
    @SerializedName("results")
    val results: Int?
)
