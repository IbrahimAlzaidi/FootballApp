package com.example.footballapp.model.response.squadPlayer


import com.example.footballapp.model.response.base.Paging
import com.google.gson.annotations.SerializedName

data class SquadPlayer(
    @SerializedName("errors")
    val errors: List<String>?,
    @SerializedName("get")
    val get: String?,
    @SerializedName("paging")
    val paging: Paging?,
    @SerializedName("parameters")
    val parameters: Parameters?,
    @SerializedName("response")
    val squadPlayerInfo: List<SquadPlayerInfo>?,
    @SerializedName("results")
    val results: Int?
)
