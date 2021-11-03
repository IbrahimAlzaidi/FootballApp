package com.example.footballapp.model.response.base.basePlayerStatistic


import com.google.gson.annotations.SerializedName

data class Tackles(
    @SerializedName("blocks")
    val blocks: String?,
    @SerializedName("interceptions")
    val interceptions: Int?,
    @SerializedName("total")
    val total: Int?
)