package com.example.footballapp.model.response.squadPlayer


import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("players")
    val players: List<Player>?,
    @SerializedName("team")
    val team: Team?
)
