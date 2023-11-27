package com.utn.passlockcr

import android.app.Application
import com.utn.passlockcr.data.AppContainer
import com.utn.passlockcr.data.AppDataContainer

class PassLockApplication : Application(){
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}