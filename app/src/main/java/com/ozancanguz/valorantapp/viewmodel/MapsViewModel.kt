package com.ozancanguz.valorantapp.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.ozancanguz.valorantapp.data.Repository
import com.ozancanguz.valorantapp.data.model.weapon.Weapon
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class MapsViewModel@Inject constructor(private val repository: Repository,application: Application):AndroidViewModel(application) {


      var mapList=MutableLiveData<Weapon>()
    var job: Job?=null

    fun requestMaps(){
        job= CoroutineScope(Dispatchers.IO).launch {
            val mapResponse=repository.remote.getMaps()
            if(mapResponse.isSuccessful){
                mapList.postValue(mapResponse.body())
                Log.d("viewmodel","data retrieved")
            }else{
                Log.d("viewmodel","data not found")
            }
        }
    }


}