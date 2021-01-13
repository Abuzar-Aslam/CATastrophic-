package com.abuzar.catastrophic.base

import android.app.Application
import com.abuzar.catastrophic.injection.dataModule
import com.abuzar.catastrophic.injection.viewModelModule
import org.koin.android.ext.android.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(applicationContext, listOf(viewModelModule, dataModule))
    }
}