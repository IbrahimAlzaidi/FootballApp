package com.example.footballapp.model.response.lineup


import com.google.gson.annotations.SerializedName

data class PlayerInfo(
    @SerializedName("grid")
    val grid: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("number")
    val number: Int?,
    @SerializedName("position")
    val position: String?
)