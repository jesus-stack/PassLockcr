package com.utn.passlockcr.data

import kotlinx.coroutines.flow.Flow

class OffLineItemsRepository(private val itemDao: ItemDao) : ItemsRepository {
    override fun getItemStream(id: Int): Flow<Item?> = itemDao.getItem(id)

    override suspend fun insertItem(item: Item) = itemDao.insert(item)

    override suspend fun deleteItem(item: Item) = itemDao.delete(item)

    override suspend fun updateItem(item: Item) = itemDao.update(item)

}