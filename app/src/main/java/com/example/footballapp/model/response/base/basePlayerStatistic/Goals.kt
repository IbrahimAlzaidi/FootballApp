package com.example.footballapp.model.response.base.basePlayerStatistic


import com.google.gson.annotations.SerializedName

data class Goals(
    @SerializedName("assists")
    val assists: Int?,
    @SerializedName("conceded")
    val conceded: Int?,
    @SerializedName("saves")
    val saves: String?,
    @SerializedName("total")
    val total: Int?
)