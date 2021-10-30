package com.example.footballapp.model.response.liveMatches


import com.google.gson.annotations.SerializedName

data class Home(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("logo")
    val logo: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("winner")
    val winner: Boolean?
)
