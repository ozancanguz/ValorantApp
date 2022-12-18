package com.ozancanguz.valorantapp.data

import com.ozancanguz.valorantapp.data.remotedatasource.RemoteDataSource
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repository @Inject constructor(remoteDataSource: RemoteDataSource){

    val remote=remoteDataSource

}