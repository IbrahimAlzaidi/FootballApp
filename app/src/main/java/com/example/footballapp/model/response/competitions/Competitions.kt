package com.example.footballapp.model.response.competitions


import com.google.gson.annotations.SerializedName

data class Competitions(
    @SerializedName("competitions")
    val competitions: List<Competition>?,
    @SerializedName("count")
    val count: Int?,
    @SerializedName("filters")
    val filters: Filters?
)