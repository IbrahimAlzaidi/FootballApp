package com.example.footballapp.model.response.schedulerMatch


import com.example.footballapp.model.response.base.Paging
import com.google.gson.annotations.SerializedName

data class SchedulerMatchResponse(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val get: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val schedulerMatchInfo: List<SchedulerMatchInfo>?,
    @SerializedName("results")
    val results: Int?
)