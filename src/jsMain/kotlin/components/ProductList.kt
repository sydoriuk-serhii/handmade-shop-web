package components

import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.*

@Composable
fun ProductList() {
    Div {
        ProductCard("Handmade Necklace", "Beautiful handmade necklace", "$25")
        ProductCard("Wooden Bowl", "Handcrafted wooden bowl", "$40")
    }
}
