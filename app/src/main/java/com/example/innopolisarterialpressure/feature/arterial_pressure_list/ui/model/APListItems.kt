package com.example.innopolisarterialpressure.feature.arterial_pressure_list.ui.model

import android.os.Parcelable
import com.example.innopolisarterialpressure.base.Item
import kotlinx.parcelize.Parcelize

sealed class APListItems : Item {
    data class Hint(val text: String, val status: Boolean) : APListItems()

    @Parcelize
    data class ArterialPressure(
        val id: String?,
        val morning: String,
        val evening: String,
        val timestamp: Long
    ) : APListItems(), Parcelable
}
