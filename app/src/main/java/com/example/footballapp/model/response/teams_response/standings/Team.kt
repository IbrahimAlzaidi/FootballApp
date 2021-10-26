package com.example.footballapp.model.response.teams_response.standings


import com.google.gson.annotations.SerializedName

data class Team(
    @SerializedName("crestUrl")
    val crestUrl: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?
)
