package com.example.innopolisarterialpressure.feature.arterial_pressure_list.ui

import com.example.innopolisarterialpressure.base.BaseViewModel
import com.example.innopolisarterialpressure.base.Event
import com.example.innopolisarterialpressure.base.nav.Screens
import com.example.innopolisarterialpressure.domain.ArterialPressureInteractor
import com.github.terrakok.cicerone.Router

class ArterialPressureListViewModel(
    private val interactor: ArterialPressureInteractor,
    private val router: Router
) :
    BaseViewModel<ViewState>() {
    override fun initialViewState() =
        ViewState(arterialPressureList = emptyList(), errorMessage = null)

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        when (event) {
            is DataEvent.LoadData -> {
                interactor.getAllRecords().fold(
                    onError = {
                        processDataEvent(DataEvent.OnDataLoadError(it.localizedMessage ?: ""))
                    },
                    onSuccess = {
                        processDataEvent(DataEvent.SuccessfulDataLoad(it))
                    }
                )
            }
            is DataEvent.SuccessfulDataLoad -> {
                return previousState.copy(
                    arterialPressureList = event.arterialPressureList,
                    errorMessage = null
                )
            }
            is UiEvent.OnAddArterialPressureButtonClicked -> {
                router.navigateTo(Screens.arterialPressureDetailsScreen())
            }
            is UiEvent.OnArterialPressureItemClicked -> {
                router.navigateTo(Screens.arterialPressureDetailsScreen(event.arterialPressure))
            }
        }
        return null
    }
}