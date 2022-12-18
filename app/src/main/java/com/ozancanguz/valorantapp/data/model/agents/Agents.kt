package com.ozancanguz.valorantapp.data.model.agents


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Agents(
    @SerializedName("data")
    val result: List<Data>


    ):Parcelable