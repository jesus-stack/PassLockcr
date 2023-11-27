package com.utn.passlockcr.ui.theme

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.utn.passlockcr.PassLockApplication
import com.utn.passlockcr.ui.theme.singin.SigninViewModel

object AppViewModelProvider {
    val Factory = viewModelFactory {

        // Initializer for LoginScreenViewModel
        initializer {
            SigninViewModel(passLockApplication().container.itemsRepository)
        }
    }
}

/**
 * Extension function to queries for [Application] object and returns an instance of
 * [InventoryApplication].
 */
fun CreationExtras.passLockApplication(): PassLockApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as PassLockApplication)