package com.example.christianharp.ui.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.christianharp.ui.model.ChristianHarpModel

@Database (entities = [ChristianHarpModel::class], version = 1)
abstract class ChristianHarpDataBase : RoomDatabase() {

    abstract fun christianHarpDAO(): ChristianHarpDAO

    companion object {
        private lateinit var INSTANCE: ChristianHarpDataBase

        fun getDataBase(context: Context): ChristianHarpDataBase {
            if (!Companion::INSTANCE.isInitialized) {
                synchronized(ChristianHarpDataBase::class) {
                    INSTANCE =
                        Room.databaseBuilder(context, ChristianHarpDataBase::class.java, "ChristianHarpDB")
                            .allowMainThreadQueries()
                            .build()
                }
            }
            return INSTANCE
        }
    }
}