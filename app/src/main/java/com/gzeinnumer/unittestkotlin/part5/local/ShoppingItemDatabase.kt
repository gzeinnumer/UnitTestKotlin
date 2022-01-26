package com.gzeinnumer.unittestkotlin.part5.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gzeinnumer.unittestkotlin.part5.local.ShoppingDao
import com.gzeinnumer.unittestkotlin.part5.local.ShoppingItem

//todo 11
@Database(
    entities = [ShoppingItem::class],
    version = 1
)
abstract class ShoppingItemDatabase : RoomDatabase() {

    abstract fun shoppingDao(): ShoppingDao
}