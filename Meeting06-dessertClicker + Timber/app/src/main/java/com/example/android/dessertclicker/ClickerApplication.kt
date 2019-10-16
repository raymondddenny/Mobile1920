package com.example.android.dessertclicker

import android.app.Application
import timber.log.Timber

class ClickerApplication: Application() { //":" ini penggantinya Extend
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}
