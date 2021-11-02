package com.example.footballapp.model.response.base.baseMatches


import com.google.gson.annotations.SerializedName

data class TeamStatus(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("logo")
    val logo: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("winner")
    val winner: Boolean?
)
