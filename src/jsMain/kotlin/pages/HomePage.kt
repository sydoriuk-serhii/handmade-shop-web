package pages

import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.*
import components.*

@Composable
fun HomePage() {
    H1 { Text("Welcome to Handmade Shop!") }
    ProductList()
}
