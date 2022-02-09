package com.gzeinnumer.unittestkotlin.part5.local

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.google.common.truth.Truth.assertThat
import com.gzeinnumer.unittestkotlin.getOrAwaitValue
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

//todo 12
@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
@SmallTest
class ShoppingDaoTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

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

//    @Test
//    fun insertShoppingItem() = runBlockingTest {
//        val shoppingItem = ShoppingItem("name", 1, 1f, "url", id = 1)
//
//        dao.insertShoppingItem(shoppingItem)
//        //end todo 12
//
//        //todo 14
//        val allShoppingItem = dao.observeAllShoppingItems().getOrAwaitValue()
//
//        assertThat(allShoppingItem).contains(shoppingItem)
//
//    }
}