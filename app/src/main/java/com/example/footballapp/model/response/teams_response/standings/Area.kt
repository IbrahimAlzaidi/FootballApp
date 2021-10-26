package com.example.footballapp.model.response.teams_response.standings


import com.google.gson.annotations.SerializedName

data class Area(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?
)
