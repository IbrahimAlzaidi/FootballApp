package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Percentage(
    @SerializedName("percentage")
    val percentage: String?,
    @SerializedName("total")
    val total: String?
)