package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class PlayerX(
    @SerializedName("grid")
    val grid: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("number")
    val number: Int?,
    @SerializedName("pos")
    val pos: String?
)
