package com.example.footballapp.model.response.standings


import com.google.gson.annotations.SerializedName

data class Competition(
    @SerializedName("area")
    val area: List<Area>?,
    @SerializedName("code")
    val code: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("lastUpdated")
    val lastUpdated: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("plan")
    val plan: String?
)
