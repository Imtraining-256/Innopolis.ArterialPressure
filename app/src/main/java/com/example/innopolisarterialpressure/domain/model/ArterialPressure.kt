package com.example.innopolisarterialpressure.domain.model

data class ArterialPressure(
    val id: String?,
    val morning: String,
    val evening: String,
    val timestamp: Long
)
