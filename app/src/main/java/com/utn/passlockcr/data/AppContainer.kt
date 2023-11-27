package com.utn.passlockcr.data

import android.content.Context

interface AppContainer {
    val itemsRepository: ItemsRepository
}

/**
 * [AppContainer] implementation that provides instance of [OfflineItemsRepository]
 */
class AppDataContainer(private val context: Context) : AppContainer {
    /**
     * Implementation for [ItemsRepository]
     */
    override val itemsRepository: ItemsRepository by lazy {
        OffLineItemsRepository(PassLockDatabase.getDatabase(context).itemDao())
    }
}