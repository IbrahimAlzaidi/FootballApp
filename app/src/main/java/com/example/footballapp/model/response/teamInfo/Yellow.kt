package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Yellow(
    @SerializedName("0-15")
    val x015: X015X?,
    @SerializedName("106-120")
    val x106120: X106120X?,
    @SerializedName("16-30")
    val x1630: X1630X?,
    @SerializedName("31-45")
    val x3145: X3145X?,
    @SerializedName("46-60")
    val x4660: X4660X?,
    @SerializedName("61-75")
    val x6175: X6175X?,
    @SerializedName("76-90")
    val x7690: X7690X?,
    @SerializedName("91-105")
    val x91105: X91105X?
)