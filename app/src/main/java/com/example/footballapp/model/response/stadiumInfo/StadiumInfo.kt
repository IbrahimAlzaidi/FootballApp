package com.example.footballapp.model.response.stadiumInfo


import com.google.gson.annotations.SerializedName

data class StadiumInfo(
    @SerializedName("errors")
    val errors: List<Any>?,
    @SerializedName("get")
    val `get`: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val response: List<Response>?,
    @SerializedName("results")
    val results: Int?
)