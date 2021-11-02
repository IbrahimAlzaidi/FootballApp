package com.example.footballapp.model.response.base.baseResponse


import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("id")
    val id: String?,
    @SerializedName("season")
    val season: String?
)