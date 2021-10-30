package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class TeamInformation(
    @SerializedName("errors")
    val errors: List<Any>?,
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