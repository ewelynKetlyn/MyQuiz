package com.example.myquiz.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyQuizApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyQuizApplication)
            modules(listOf(networkModule, domainModule, dataModule))
        }
    }
}