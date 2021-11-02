package com.example.footballapp.model.response.lineup


import com.example.footballapp.model.response.base.baseResponse.Paging
import com.example.footballapp.model.response.base.baseResponse.Parameters
import com.google.gson.annotations.SerializedName

data class LineupInfoResponse(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val get: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val lineupInfo: List<LineupInfo>?,
    @SerializedName("results")
    val results: Int?
)