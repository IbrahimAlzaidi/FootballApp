package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Red(
    @SerializedName("0-15")
    val x015: X015?,
    @SerializedName("106-120")
    val x106120: X106120?,
    @SerializedName("16-30")
    val x1630: X1630?,
    @SerializedName("31-45")
    val x3145: X3145?,
    @SerializedName("46-60")
    val x4660: X4660?,
    @SerializedName("61-75")
    val x6175: X6175?,
    @SerializedName("76-90")
    val x7690: X7690?,
    @SerializedName("91-105")
    val x91105: X91105?
)