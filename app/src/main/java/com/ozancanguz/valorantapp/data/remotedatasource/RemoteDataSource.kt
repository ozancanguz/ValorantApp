package com.ozancanguz.valorantapp.data.remotedatasource

import com.ozancanguz.valorantapp.data.model.agents.Agents
import com.ozancanguz.valorantapp.data.valorantApi.ValorantApi
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource@Inject constructor(private val valorantApi: ValorantApi) {


    suspend fun getAgents(): Response<Agents> {
        return valorantApi.getAgents()
    }


}