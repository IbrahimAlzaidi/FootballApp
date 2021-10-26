package com.example.footballapp.model.response.teams_response.competitions


import com.google.gson.annotations.SerializedName

data class Area(
    @SerializedName("countryCode")
    val countryCode: String?,
    @SerializedName("ensignUrl")
    val ensignUrl: Any?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?
)
