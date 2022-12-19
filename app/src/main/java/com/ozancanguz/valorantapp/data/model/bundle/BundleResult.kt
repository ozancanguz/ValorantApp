package com.ozancanguz.valorantapp.data.model.bundle


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
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
    @SerializedName("useAdditionalContext")
    val useAdditionalContext: Boolean,
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("verticalPromoImage")
    val verticalPromoImage: String
):Parcelable