package components

import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.*

@Composable
fun ProductCard(title: String, description: String, price: String) {
    Div {
        H3 { Text(title) }
        P { Text(description) }
        P { Text("Price: $price") }
        Button { Text("Add to Cart") }
    }
}
