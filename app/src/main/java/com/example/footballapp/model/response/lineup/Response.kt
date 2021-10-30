package com.example.footballapp.model.response.lineup


import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("coach")
    val coach: Coach?,
    @SerializedName("formation")
    val formation: String?,
    @SerializedName("startXI")
    val startXI: List<StartXI>?,
    @SerializedName("substitutes")
    val substitutes: List<Substitute>?,
    @SerializedName("team")
    val team: Team?
)