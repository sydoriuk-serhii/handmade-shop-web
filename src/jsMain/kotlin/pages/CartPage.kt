package pages

import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.*

@Composable
fun CartPage() {
    H1 { Text("Shopping Cart") }
    P { Text("Your selected items will appear here.") }
}