package com.example.footballapp.model.response.base.basePlayerStatistic


import com.google.gson.annotations.SerializedName

data class Substitutes(
    @SerializedName("bench")
    val bench: Int?,
    @SerializedName("in")
    val inInformation: Int?,
    @SerializedName("out")
    val outInformation: Int?
)