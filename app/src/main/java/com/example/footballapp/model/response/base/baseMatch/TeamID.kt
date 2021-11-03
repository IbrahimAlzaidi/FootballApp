package com.example.footballapp.model.response.base.baseMatch


import com.google.gson.annotations.SerializedName

data class TeamID(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("logo")
    val logo: String?,
    @SerializedName("name")
    val name: String?
)
