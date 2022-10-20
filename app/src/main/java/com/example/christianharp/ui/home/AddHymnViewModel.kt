package com.example.christianharp.ui.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class AddHymnViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = ChristianHarpRepository(application.applicationContext)

    private val _saveHymn = MutableLiveData<ChristianHarpModel>()
    val saveHymn: LiveData<ChristianHarpModel> = _saveHymn

    fun save(hymn: ChristianHarpModel) {
        repository.insert(hymn)
    }
}