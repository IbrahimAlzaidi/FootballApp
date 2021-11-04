package com.example.footballapp.model.response.base.baseMatch


import com.google.gson.annotations.SerializedName

data class TeamInfo(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("logo")
    val logo: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("winner")
    val winner: String?
)
