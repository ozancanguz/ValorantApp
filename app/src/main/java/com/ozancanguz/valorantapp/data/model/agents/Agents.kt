package com.ozancanguz.valorantapp.data.model.agents


import com.google.gson.annotations.SerializedName

data class Agents(
    @SerializedName("data")
    val result: List<Data>

    )