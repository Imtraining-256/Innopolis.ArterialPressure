package com.example.innopolisarterialpressure.base.nav

import androidx.appcompat.app.AppCompatActivity
import com.example.innopolisarterialpressure.R
import com.github.terrakok.cicerone.androidx.AppNavigator

class MainActivityNavigator(activity: AppCompatActivity) : AppNavigator(
    activity = activity,
    containerId = R.layout.activity_main
)