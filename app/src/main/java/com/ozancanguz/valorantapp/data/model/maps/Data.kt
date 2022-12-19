package com.ozancanguz.valorantapp.data.model.maps


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(
    @SerializedName("assetPath")
    val assetPath: String,
    @SerializedName("coordinates")
    val coordinates: String,
    @SerializedName("displayIcon")
    val displayIcon: String,
    @SerializedName("displayName")
    val displayName: String,
    @SerializedName("listViewIcon")
    val listViewIcon: String,
    @SerializedName("mapUrl")
    val mapUrl: String,
    @SerializedName("splash")
    val splash: String,
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("xMultiplier")
    val xMultiplier: Int,
    @SerializedName("xScalarToAdd")
    val xScalarToAdd: Double,
    @SerializedName("yMultiplier")
    val yMultiplier: Int,
    @SerializedName("yScalarToAdd")
    val yScalarToAdd: Double
):Parcelable