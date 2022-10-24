package com.example.christianharp.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.christianharp.ui.model.ChristianHarpModel
import com.example.christianharp.ui.repository.ChristianHarpRepository

class AddHymnViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = ChristianHarpRepository(application.applicationContext)

    private val _saveHymn = MutableLiveData<ChristianHarpModel>()
    val saveHymn: LiveData<ChristianHarpModel> = _saveHymn

    fun save(hymn: ChristianHarpModel) {
        if (hymn.name != "" && hymn.hymn != "") {
            repository.insert(hymn)
        }
    }
}