package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class Fouls(
    @SerializedName("committed")
    val committed: Any?,
    @SerializedName("drawn")
    val drawn: Any?
)
