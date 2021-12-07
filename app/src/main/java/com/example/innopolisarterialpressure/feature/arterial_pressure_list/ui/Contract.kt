package com.example.innopolisarterialpressure.feature.arterial_pressure_list.ui

import com.example.innopolisarterialpressure.base.Event
import com.example.innopolisarterialpressure.feature.arterial_pressure_list.ui.model.APListItems

data class ViewState(
    val arterialPressureList: List<APListItems>,
    val errorMessage: String?
)

sealed class UiEvent : Event {
    object OnAddArterialPressureButtonClicked : UiEvent()
    data class OnArterialPressureItemClicked(val arterialPressure: APListItems.ArterialPressure) :
        UiEvent()
}

sealed class DataEvent : Event {
    object LoadData : DataEvent()
    data class SuccessfulDataLoad(val arterialPressureList: List<APListItems>) : DataEvent()
    data class OnDataLoadError(val errorMessage: String) : DataEvent()
}