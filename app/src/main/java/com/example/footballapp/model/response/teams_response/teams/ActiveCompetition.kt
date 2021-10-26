package com.example.footballapp.model.response.teams_response.teams


import com.google.gson.annotations.SerializedName

data class ActiveCompetition(
    @SerializedName("area")
    val area: Area?,
    @SerializedName("code")
    val code: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("lastUpdated")
    val lastUpdated: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("plan")
    val plan: String?
)
