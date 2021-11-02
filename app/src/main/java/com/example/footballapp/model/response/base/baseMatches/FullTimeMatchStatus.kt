package com.example.footballapp.model.response.base.baseMatches


import com.google.gson.annotations.SerializedName

data class FullTimeMatchStatus(
    @SerializedName("extratime")
    val extraTime: FullTimeStatus?,
    @SerializedName("fullTime")
    val fullTime: FullTimeStatus?,
    @SerializedName("halftime")
    val halfTime: FullTimeStatus?,
    @SerializedName("penalty")
    val penalty: FullTimeStatus?
)
