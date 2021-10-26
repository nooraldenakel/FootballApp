package com.example.footballapp.model.response.teams_response.teams


import com.google.gson.annotations.SerializedName

data class Squad(
    @SerializedName("countryOfBirth")
    val countryOfBirth: String?,
    @SerializedName("dateOfBirth")
    val dateOfBirth: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("nationality")
    val nationality: String?,
    @SerializedName("position")
    val position: String?,
    @SerializedName("role")
    val role: String?,
    @SerializedName("shirtNumber")
    val shirtNumber: Any?
)