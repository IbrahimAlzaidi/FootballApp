package com.example.footballapp.model.response.base.baseLeagueInfo


import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("code")
    val code: String?,
    @SerializedName("flag")
    val flag: String?,
    @SerializedName("name")
    val name: String?
)
