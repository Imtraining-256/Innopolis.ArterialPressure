package com.example.innopolisarterialpressure

import android.app.Application
import com.example.innopolisarterialpressure.di.appModule
import com.example.innopolisarterialpressure.di.navModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ArterialPressureApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@ArterialPressureApp)
            modules(appModule, navModule)
        }
    }
}