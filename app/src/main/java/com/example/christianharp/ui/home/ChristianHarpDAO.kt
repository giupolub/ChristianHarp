package com.example.christianharp.ui.home

import androidx.room.*

@Dao
interface ChristianHarpDAO {

    @Insert
    fun insert(hymn: ChristianHarpModel)

    @Update
    fun update(hymn: ChristianHarpModel)

    @Delete
    fun delete(hymn: ChristianHarpModel)

    @Query("SELECT * FROM HymnsChristianHarp WHERE id = :id")
    fun searchId(id: Int): ChristianHarpModel

    @Query("SELECT * FROM HymnsChristianHarp WHERE name = :name")
    fun searchName(name: String): ChristianHarpModel

    @Query("SELECT * FROM HymnsChristianHarp WHERE name = :keysWord")
    fun searchKeysWord(keysWord: String): ChristianHarpModel

}