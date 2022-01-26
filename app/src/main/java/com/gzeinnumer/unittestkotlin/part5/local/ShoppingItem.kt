package com.gzeinnumer.unittestkotlin.part5.local

import androidx.room.Entity
import androidx.room.PrimaryKey

//todo 9
@Entity(tableName = "shopping_items")
data class ShoppingItem(
    var name: String,
    var amount: Int,
    var price: Float,
    var imageUrl: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)