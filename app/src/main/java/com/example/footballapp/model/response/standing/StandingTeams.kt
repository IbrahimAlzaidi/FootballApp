package com.example.footballapp.model.response.standing


import com.google.gson.annotations.SerializedName

data class StandingTeams(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val `get`: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val response: Response?,
    @SerializedName("results")
    val results: Int?
)