package com.utn.passlockcr.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [Item::class], version = 1, exportSchema = false)
abstract class PassLockDatabase : RoomDatabase()  {
    abstract fun itemDao(): ItemDao

    companion object {
        @Volatile
        private var Instance: PassLockDatabase? = null

        fun getDatabase(context: Context): PassLockDatabase {
            // if the Instance is not null, return it, otherwise create a new database instance.
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, PassLockDatabase::class.java, "item_database")
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { Instance = it }
            }
        }
    }
}