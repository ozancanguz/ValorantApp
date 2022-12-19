package com.ozancanguz.valorantapp.data.model.bundle


import com.google.gson.annotations.SerializedName

data class Bundle(
    @SerializedName("data")
    val result: List<BundleResult>,
    @SerializedName("status")
    val status: Int
)