package com.example.footballapp.model.response.stadiumInfo


import com.example.footballapp.model.response.base.baseResponse.*
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
    val stadiumInfo: List<StadiumInfo>?,
    @SerializedName("results")
    val results: Int?
)