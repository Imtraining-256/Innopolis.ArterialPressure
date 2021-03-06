package com.example.innopolisarterialpressure.base.nav

import com.example.innopolisarterialpressure.feature.arterial_pressure_details.ui.ArterialPressureDetailsFragment
import com.example.innopolisarterialpressure.feature.arterial_pressure_list.ui.ArterialPressureListFragment
import com.example.innopolisarterialpressure.feature.arterial_pressure_list.ui.model.APListItems
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens {
    fun arterialPressureListScreen() = FragmentScreen {
        ArterialPressureListFragment.newInstance()
    }

    fun arterialPressureDetailsScreen() = FragmentScreen {
        ArterialPressureDetailsFragment.newInstance(null)
    }

    fun arterialPressureDetailsScreen(arterialPressure: APListItems.ArterialPressure) =
        FragmentScreen {
            ArterialPressureDetailsFragment.newInstance(arterialPressure)
        }
}