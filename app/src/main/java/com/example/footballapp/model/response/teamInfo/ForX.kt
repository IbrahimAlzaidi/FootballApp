package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class ForX(
    @SerializedName("average")
    val average: AverageX?,
    @SerializedName("minute")
    val minute: MinuteX?,
    @SerializedName("total")
    val total: TotalX?
)