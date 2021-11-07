package com.example.footballapp.model.response.teamCurrrenMatch


import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("season")
    val season: String?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("team")
    val team: String?
)
