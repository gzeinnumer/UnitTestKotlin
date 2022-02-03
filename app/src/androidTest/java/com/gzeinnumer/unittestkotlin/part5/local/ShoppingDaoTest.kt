package com.gzeinnumer.unittestkotlin.part5.local

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import kotlinx.coroutines.test.runBlockingTest
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

//todo 12
@RunWith(AndroidJUnit4::class)
@SmallTest
class ShoppingDaoTest {
    private lateinit var database: ShoppingItemDatabase
    private lateinit var dao: ShoppingDao

    @Before
    fun setup(){
        database = Room.inMemoryDatabaseBuilder<ShoppingItemDatabase>(
            ApplicationProvider.getApplicationContext(),
            ShoppingItemDatabase::class.java
        ).allowMainThreadQueries().build()

        dao = database.shoppingDao()
    }

    @After
    fun tearDown(){
        database.close()
    }

    @Test
    fun insertShoppingItem() = runBlockingTest {

    }
}