package com.ozancanguz.valorantapp.data.model.agents


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Ability(
    @SerializedName("description")
    val description: String,
    @SerializedName("displayIcon")
    val displayIcon: String,
    @SerializedName("displayName")
    val displayName: String,
    @SerializedName("slot")
    val slot: String
):Parcelable