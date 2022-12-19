package com.ozancanguz.valorantapp.data.model.bundle


import com.google.gson.annotations.SerializedName

data class BundleResult(
    @SerializedName("assetPath")
    val assetPath: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("displayIcon")
    val displayIcon: String,
    @SerializedName("displayIcon2")
    val displayIcon2: String,
    @SerializedName("displayName")
    val displayName: String,
    @SerializedName("displayNameSubText")
    val displayNameSubText: Any,
    @SerializedName("extraDescription")
    val extraDescription: Any,
    @SerializedName("promoDescription")
    val promoDescription: Any,
    @SerializedName("useAdditionalContext")
    val useAdditionalContext: Boolean,
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("verticalPromoImage")
    val verticalPromoImage: String
)