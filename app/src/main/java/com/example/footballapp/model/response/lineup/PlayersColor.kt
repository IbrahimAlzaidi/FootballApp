package com.example.footballapp.model.response.lineup


import com.google.gson.annotations.SerializedName

data class PlayersColor(
    @SerializedName("border")
    val border: String?,
    @SerializedName("number")
    val number: String?,
    @SerializedName("primary")
    val primary: String?
)