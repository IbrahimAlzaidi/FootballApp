package com.example.footballapp.model.response.matchStatistic


import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("fixture")
    val fixture: String?
)