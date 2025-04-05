package org.example.pages

import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.*
import org.example.components.ProductCard

@Composable
fun ProductPage(onAddToCart: (String, String, Double) -> Unit) {
    H1 { Text("Product Details") }
    P { Text("More information about the selected product...") }

    // Example product details
    Div {
        ProductCard(
            id = "detailed-product",
            title = "Premium Wooden Bowl",
            description = "Handcrafted premium wooden bowl made from sustainable oak",
            price = 59.99,
            onAddToCart = onAddToCart
        )
    }
}