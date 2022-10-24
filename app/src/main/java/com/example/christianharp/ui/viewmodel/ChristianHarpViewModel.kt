package com.example.christianharp.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.christianharp.ui.model.ChristianHarpModel
import com.example.christianharp.ui.repository.ChristianHarpRepository

class ChristianHarpViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = ChristianHarpRepository(application.applicationContext)

    private val _listAllHymns = MutableLiveData<List<ChristianHarpModel>>()
    val hymns: LiveData<List<ChristianHarpModel>> = _listAllHymns

    fun getAll () {
        _listAllHymns.value = repository.getAll()
    }

}