package com.example.innopolisarterialpressure.data

import com.example.innopolisarterialpressure.domain.model.ArterialPressure

interface PressureRepository {
    suspend fun addNewRecord(arterialPressure: ArterialPressure)
    suspend fun updateRecord(arterialPressure: ArterialPressure)
    suspend fun getAllRecords(): List<ArterialPressure>
    suspend fun getRecordById(id: String): ArterialPressure
    suspend fun deleteRecord(arterialPressure: ArterialPressure)
}