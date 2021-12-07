package com.example.innopolisarterialpressure.data

import com.example.innopolisarterialpressure.data.local.PressureEntity
import com.example.innopolisarterialpressure.domain.model.ArterialPressure
import com.example.innopolisarterialpressure.feature.arterial_pressure_list.ui.model.APListItems
import java.util.*

fun PressureEntity.toArterialPressure(): ArterialPressure =
    ArterialPressure(
        id = id,
        morning = morning,
        evening = evening,
        timestamp = timestamp
    )

fun ArterialPressure.toPressureEntity(): PressureEntity =
    PressureEntity(
        id = id ?: UUID.randomUUID().toString(),
        morning = morning,
        evening = evening,
        timestamp = timestamp
    )

fun List<PressureEntity>.toArterialPressureList(): List<ArterialPressure> =
    map { pressureEntity ->
        pressureEntity.toArterialPressure()
    }

fun APListItems.ArterialPressure.toArterialPressure(): ArterialPressure =
    ArterialPressure(
        id = id,
        morning = morning,
        evening = evening,
        timestamp = timestamp
    )