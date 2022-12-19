package com.ozancanguz.valorantapp.data.valorantApi

import com.ozancanguz.valorantapp.data.model.agents.Agents
import com.ozancanguz.valorantapp.data.model.bundle.Bundle

import retrofit2.Response
import retrofit2.http.GET

interface ValorantApi {

    @GET("agents")
    suspend fun getAgents(): Response<Agents>


  @GET("bundles")
  suspend fun getBundles():Response<Bundle>

}