package com.example.footballapp.model.response.liveMatches


import com.google.gson.annotations.SerializedName

data class LiveMatches(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val `get`: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val response: List<MatchesResponse>?,
    @SerializedName("results")
    val results: Int?
)
