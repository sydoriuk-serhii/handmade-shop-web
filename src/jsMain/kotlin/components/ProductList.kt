package components

import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.*

@Composable
fun ProductList(onAddToCart: (String, String, Double) -> Unit) {
    Div {
        ProductCard(
            id = "necklace1",
            title = "Handmade Necklace",
            description = "Beautiful handmade necklace",
            price = 25.0,
            onAddToCart = onAddToCart
        )

        ProductCard(
            id = "bowl1",
            title = "Wooden Bowl",
            description = "Handcrafted wooden bowl",
            price = 40.0,
            onAddToCart = onAddToCart
        )

        ProductCard(
            id = "bracelet1",
            title = "Beaded Bracelet",
            description = "Colorful beaded bracelet with natural stones",
            price = 15.0,
            onAddToCart = onAddToCart
        )
    }
}