package com.example.christianharp.ui.viewmodel

import android.app.Application
import android.text.Spannable
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.christianharp.ui.model.ChristianHarpModel
import com.example.christianharp.ui.repository.ChristianHarpRepository

class DetailsHymnViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = ChristianHarpRepository(application.applicationContext)

    private val _hymn = MutableLiveData<ChristianHarpModel>()
    val hymn: LiveData<ChristianHarpModel> = _hymn

    fun get (id: Int) {
        _hymn.value = repository.get(id)
    }

    fun delete (id: Int) {
        repository.delete(id)
    }

    fun getPrevious (id: Int) {
        if (id >= 0) {
            _hymn.value = repository.get(id)
        }

    }

    fun getNext (id: Int) {
        if (id <= 640) {
            _hymn.value = repository.get(id)
        }
    }

}