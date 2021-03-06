package com.example.innopolisarterialpressure

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.innopolisarterialpressure.data.local.PressureDao
import com.example.innopolisarterialpressure.data.local.PressureEntity

@Database(entities = [PressureEntity::class], version = 1)
abstract class ArterialPressureDatabase : RoomDatabase() {
    abstract val dao: PressureDao

    companion object {
        const val DATABASE_NAME = "ap_db"
    }
}