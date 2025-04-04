package components

import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.*

@Composable
fun Header(onNavigate: (String) -> Unit) {
    Nav {
        Button(attrs = { onClick { onNavigate("home") } }) { Text("Home") }
        Button(attrs = { onClick { onNavigate("product") } }) { Text("Products") }
        Button(attrs = { onClick { onNavigate("cart") } }) { Text("Cart") }
    }
}
