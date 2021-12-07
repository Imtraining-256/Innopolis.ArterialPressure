package com.example.innopolisarterialpressure.feature.arterial_pressure_details.ui

import com.example.innopolisarterialpressure.base.BaseViewModel
import com.example.innopolisarterialpressure.base.Event
import com.example.innopolisarterialpressure.domain.ArterialPressureInteractor
import com.example.innopolisarterialpressure.domain.model.ArterialPressure
import com.github.terrakok.cicerone.Router

class ArterialPressureDetailsViewModel(
    private val interactor: ArterialPressureInteractor,
    private val router: Router
) : BaseViewModel<ViewState>() {
    override fun initialViewState() = ViewState

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        when (event) {
            is UiEvent.OnArterialPressureSaveButtonClicked -> {
                interactor.addNewRecord(
                    ArterialPressure(
                    id = event.id,
                    morning = event.morning,
                    evening = event.evening,
                    timestamp = event.timestamp
                )
                )
                router.exit()
            }
        }
        return null
    }
}