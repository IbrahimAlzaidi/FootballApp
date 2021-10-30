package com.example.footballapp.model.response.stadiumInfo


import com.google.gson.annotations.SerializedName

data class Team(
    @SerializedName("country")
    val country: String?,
    @SerializedName("founded")
    val founded: Int?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("logo")
    val logo: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("national")
    val national: Boolean?
)