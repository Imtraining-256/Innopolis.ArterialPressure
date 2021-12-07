package com.example.innopolisarterialpressure.domain

import com.example.innopolisarterialpressure.base.attempt
import com.example.innopolisarterialpressure.data.PressureRepository
import com.example.innopolisarterialpressure.domain.model.ArterialPressure
import com.example.innopolisarterialpressure.feature.arterial_pressure_list.ui.model.APListItems

class ArterialPressureInteractor(private val repository: PressureRepository) {
    suspend fun addNewRecord(arterialPressure: ArterialPressure) =
        repository.addNewRecord(arterialPressure)

    suspend fun updateRecord(arterialPressure: ArterialPressure) =
        repository.updateRecord(arterialPressure)

    suspend fun getAllRecords() =
        attempt {
            repository.getAllRecords().map { ap ->
                APListItems.ArterialPressure(
                    id = ap.id,
                    morning = ap.morning,
                    evening = ap.evening,
                    timestamp = ap.timestamp
                )
            }
        }

    suspend fun getRecordById(id: String) =
        attempt {
            repository.getRecordById(id)
        }

    suspend fun deleteRecord(arterialPressure: ArterialPressure) =
        attempt {
            repository.deleteRecord(arterialPressure)
        }
}