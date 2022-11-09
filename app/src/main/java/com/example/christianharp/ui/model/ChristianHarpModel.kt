package com.example.christianharp.ui.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "HymnsChristianHarp")
class ChristianHarpModel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0

    @ColumnInfo(name = "title")
    var title: String = ""

    @ColumnInfo(name = "stanza1")
    var stanza1: String = ""

    @ColumnInfo(name = "refrain")
    var refrain: String = ""

    @ColumnInfo(name = "stanza2")
    var stanza2: String = ""

    @ColumnInfo(name = "stanza3")
    var stanza3: String = ""

    @ColumnInfo(name = "stanza4")
    var stanza4: String = ""

    @ColumnInfo(name = "stanza5")
    var stanza5: String = ""

    @ColumnInfo(name = "stanza6")
    var stanza6: String = ""


}