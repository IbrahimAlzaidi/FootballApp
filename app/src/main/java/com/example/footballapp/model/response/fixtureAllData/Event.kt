package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class Event(
    @SerializedName("assist")
    val assist: Assist?,
    @SerializedName("comments")
    val comments: Any?,
    @SerializedName("detail")
    val detail: String?,
    @SerializedName("player")
    val player: Player?,
    @SerializedName("team")
    val team: Team?,
    @SerializedName("time")
    val time: Time?,
    @SerializedName("type")
    val type: String?
)
