package com.ozancanguz.valorantapp.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ozancanguz.valorantapp.data.Repository
import com.ozancanguz.valorantapp.data.model.agents.Agents
import com.ozancanguz.valorantapp.data.model.bundle.Bundle

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel@Inject constructor(val repository: Repository, application: Application):AndroidViewModel(application) {

    var agentsList=MutableLiveData<Agents>()
   var bundleList=MutableLiveData<Bundle>()
    var job: Job?=null


    // for request agents fun

    fun requestAgents(){
        job= CoroutineScope(Dispatchers.IO).launch {
            val response= repository.remote.getAgents()
            if(response.isSuccessful){
                agentsList.postValue(response.body())
                Log.d("viewmodel","" +response)
            }else{
                Log.d("viewmodel","data not found")
            }
        }
    }

   fun requestBundleData(){
        job= CoroutineScope(Dispatchers.IO).launch {
            val response=repository.remote.getBundles()
            if(response.isSuccessful){
                bundleList.postValue(response.body())
                Log.d("viewmodelBundle","" +response)
            }else{
                Log.d("viewmodelBundle","data not found")
            }
        }

   }










}