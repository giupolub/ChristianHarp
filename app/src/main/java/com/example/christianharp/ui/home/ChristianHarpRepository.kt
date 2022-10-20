package com.example.christianharp.ui.home

import android.content.Context

class ChristianHarpRepository(context: Context) {

    private val christianHarpDataBase =
        ChristianHarpDataBase.getDataBase(context).christianHarpDAO()

    fun insert(hymn: ChristianHarpModel) {
        christianHarpDataBase.insert(hymn)
    }

}