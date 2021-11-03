package com.example.footballapp.model.response.matches


import com.example.footballapp.model.response.base.Paging
import com.google.gson.annotations.SerializedName

data class MatchesResponse(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val get: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val matchInfo: List<MatchInfo>?,
    @SerializedName("results")
    val results: Int?
)