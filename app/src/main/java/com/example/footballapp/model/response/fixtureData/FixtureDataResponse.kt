package com.example.footballapp.model.response.fixtureData


import com.example.footballapp.model.response.base.Paging
import com.google.gson.annotations.SerializedName

data class FixtureDataResponse(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val get: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val fixtureDataInfo: List<FixtureDataInfo>?,
    @SerializedName("results")
    val results: Int?
)
