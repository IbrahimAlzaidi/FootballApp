package com.example.footballapp.model.response.teams_response.competitions


import com.google.gson.annotations.SerializedName

data class competitions(
    @SerializedName("competitions")
    val competitions: List<Competition>?,
    @SerializedName("count")
    val count: Int?,
    @SerializedName("filters")
    val filters: Filters?
)
