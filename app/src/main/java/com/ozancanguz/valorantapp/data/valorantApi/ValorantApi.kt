package com.ozancanguz.valorantapp.data.valorantApi

import com.ozancanguz.valorantapp.data.model.agents.Agents
import retrofit2.Response
import retrofit2.http.GET

interface ValorantApi {

    @GET("agents")
    suspend fun getAgents(): Response<Agents>



}