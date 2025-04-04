package pages

import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.*

@Composable
fun ProductPage() {
    H1 { Text("Product Details") }
    P { Text("More information about the selected product...") }
}