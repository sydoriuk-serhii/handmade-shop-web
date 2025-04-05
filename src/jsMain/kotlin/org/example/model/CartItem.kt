package org.example.model

data class CartItem(
    val id: String,
    val title: String,
    val price: Double,
    val quantity: Int = 1
)