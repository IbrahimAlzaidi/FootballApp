package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class GoalsX(
    @SerializedName("assists")
    val assists: Any?,
    @SerializedName("conceded")
    val conceded: Int?,
    @SerializedName("saves")
    val saves: Int?,
    @SerializedName("total")
    val total: Any?
)
