package com.ozancanguz.valorantapp.data.model.agents


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Role(
    @SerializedName("assetPath")
    val assetPath: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("displayIcon")
    val displayIcon: String,
    @SerializedName("displayName")
    val displayName: String,
    @SerializedName("uuid")
    val uuid: String
):Parcelable