package pages

import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.*
import components.*

@Composable
fun HomePage(onAddToCart: (String, String, Double) -> Unit) {
    H1 { Text("Welcome to Handmade Shop!") }
    ProductList(onAddToCart)
}