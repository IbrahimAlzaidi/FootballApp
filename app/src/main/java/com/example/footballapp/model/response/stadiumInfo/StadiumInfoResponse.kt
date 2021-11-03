package com.example.footballapp.model.response.stadiumInfo


import com.example.footballapp.model.response.base.Paging
import com.google.gson.annotations.SerializedName

data class StadiumInfoResponse(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val get: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val stadiumDetails: List<StadiumDetails>?,
    @SerializedName("results")
    val results: Int?
)