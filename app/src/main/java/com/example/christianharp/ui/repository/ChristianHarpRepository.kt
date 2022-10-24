package com.example.christianharp.ui.repository

import android.content.Context
import com.example.christianharp.ui.model.ChristianHarpModel

class ChristianHarpRepository(context: Context) {

    private val christianHarpDataBase =
        ChristianHarpDataBase.getDataBase(context).christianHarpDAO()

    fun insert(hymn: ChristianHarpModel) {
        christianHarpDataBase.insert(hymn)
    }

    fun getAll(): List<ChristianHarpModel> {
        return christianHarpDataBase.getAll()
    }
}