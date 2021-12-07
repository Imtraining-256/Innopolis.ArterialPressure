package com.example.innopolisarterialpressure.feature.arterial_pressure_details.ui

import com.example.innopolisarterialpressure.base.Event

object ViewState

sealed class UiEvent : Event {
    data class OnArterialPressureSaveButtonClicked(
        val id: String?,
        val morning: String,
        val evening: String,
        val timestamp: Long
        ) : UiEvent()
}