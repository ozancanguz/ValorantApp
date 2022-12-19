package com.ozancanguz.valorantapp.data.model.weapon


import com.google.gson.annotations.SerializedName

data class Weapon(
    @SerializedName("data")
    val result: List<Data>,
    @SerializedName("status")
    val status: Int
)