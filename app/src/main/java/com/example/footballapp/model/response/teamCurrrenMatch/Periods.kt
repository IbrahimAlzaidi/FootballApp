package com.example.footballapp.model.response.teamCurrrenMatch


import com.google.gson.annotations.SerializedName

data class Periods(
    @SerializedName("first")
    val first: Int?,
    @SerializedName("second")
    val second: Int?
)