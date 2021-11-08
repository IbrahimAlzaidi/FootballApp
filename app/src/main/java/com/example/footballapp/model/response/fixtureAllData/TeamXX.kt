package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class TeamXX(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("logo")
    val logo: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("update")
    val update: String?
)
