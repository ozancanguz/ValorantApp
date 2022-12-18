package com.ozancanguz.valorantapp.data.model.agents


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(

    @SerializedName("assetPath")
    val assetPath: String,
    @SerializedName("background")
    val background: String,

    @SerializedName("bustPortrait")
    val bustPortrait: String,

    @SerializedName("description")
    val description: String,
    @SerializedName("developerName")
    val developerName: String,
    @SerializedName("displayIcon")
    val displayIcon: String,
    @SerializedName("displayIconSmall")
    val displayIconSmall: String,
    @SerializedName("displayName")
    val displayName: String,
    @SerializedName("fullPortrait")
    val fullPortrait: String,
    @SerializedName("fullPortraitV2")
    val fullPortraitV2: String,
    @SerializedName("isAvailableForTest")
    val isAvailableForTest: Boolean,
    @SerializedName("isBaseContent")
    val isBaseContent: Boolean,
    @SerializedName("isFullPortraitRightFacing")
    val isFullPortraitRightFacing: Boolean,
    @SerializedName("isPlayableCharacter")
    val isPlayableCharacter: Boolean,
    @SerializedName("killfeedPortrait")
    val killfeedPortrait: String,
    @SerializedName("role")
    val role: Role,
    @SerializedName("uuid")
    val uuid: String,

):Parcelable