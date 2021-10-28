package com.example.footballapp.model.response.competitions


import com.google.gson.annotations.SerializedName

data class Competition(
    @SerializedName("area")
    val area: List<Area>?,
    @SerializedName("code")
    val code: String?,
    @SerializedName("currentSeason")
    val currentSeason: List<CurrentSeason>?,
    @SerializedName("emblemUrl")
    val emblemUrl: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("lastUpdated")
    val lastUpdated: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("numberOfAvailableSeasons")
    val numberOfAvailableSeasons: Int?,
    @SerializedName("plan")
    val plan: String?
)
