package com.example.innopolisarterialpressure.data

import com.example.innopolisarterialpressure.data.local.PressureDao
import com.example.innopolisarterialpressure.domain.model.ArterialPressure

class PressureRepositoryImpl(private val dao: PressureDao) : PressureRepository {
    override suspend fun addNewRecord(arterialPressure: ArterialPressure) {
        dao.addNewRecord(arterialPressure.toPressureEntity())
    }

    override suspend fun updateRecord(arterialPressure: ArterialPressure) {
        dao.updateRecord(arterialPressure.toPressureEntity())
    }

    override suspend fun getAllRecords(): List<ArterialPressure> {
        return dao.getAllRecords().toArterialPressureList()
    }

    override suspend fun getRecordById(id: String): ArterialPressure {
        return dao.getRecordById(id).toArterialPressure()
    }

    override suspend fun deleteRecord(arterialPressure: ArterialPressure) {
        dao.deleteRecord(arterialPressure.toPressureEntity())
    }
}