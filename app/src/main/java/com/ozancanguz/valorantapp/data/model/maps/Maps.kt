package com.ozancanguz.valorantapp.data.model.maps


import com.google.gson.annotations.SerializedName

data class Maps(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("status")
    val status: Int
)