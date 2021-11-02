package com.example.footballapp.model.response.base.basePlayerStatistic


import com.google.gson.annotations.SerializedName

data class Substitutes(
    @SerializedName("bench")
    val bench: Int?,
    @SerializedName("in")
    val inLineup: Int?,
    @SerializedName("out")
    val out: Int?
)