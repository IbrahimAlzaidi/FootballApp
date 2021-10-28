package com.example.footballapp.model.response.standings


import com.google.gson.annotations.SerializedName

data class Standing(
    @SerializedName("group")
    val group: String?,
    @SerializedName("stage")
    val stage: String?,
    @SerializedName("table")
    val table: List<Table>?,
    @SerializedName("type")
    val type: String?
)
