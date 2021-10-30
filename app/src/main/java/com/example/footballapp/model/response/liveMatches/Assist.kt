package com.example.footballapp.model.response.liveMatches


import com.google.gson.annotations.SerializedName

data class Assist(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?
)
