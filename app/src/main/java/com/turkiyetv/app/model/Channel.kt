package com.turkiyetv.app.model

import com.google.gson.annotations.SerializedName

data class Channel(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("category") val category: String,
    @SerializedName("url") val url: String,
    @SerializedName("logo") val logo: String,
    @SerializedName("description") val description: String? = null,
    @SerializedName("isPremium") val isPremium: Boolean = false,
    @SerializedName("officialAppPackage") val officialAppPackage: String? = null
)
