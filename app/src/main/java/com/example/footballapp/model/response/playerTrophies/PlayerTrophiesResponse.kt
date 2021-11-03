package com.example.footballapp.model.response.playerTrophies


import com.example.footballapp.model.response.base.Paging
import com.google.gson.annotations.SerializedName

data class PlayerTrophiesResponse(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val get: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val playerTrophiesInfo: List<PlayerTrophiesInfo>?,
    @SerializedName("results")
    val results: Int?
)