package com.example.footballapp.model.response.leagues


import com.google.gson.annotations.SerializedName

data class LeaguesResponse(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val `get`: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: List<String>?,
    @SerializedName("response")
    val response: List<Response>?,
    @SerializedName("results")
    val results: Int?
)
