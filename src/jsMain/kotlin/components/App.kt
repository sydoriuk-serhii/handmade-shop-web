package components

import androidx.compose.runtime.*
import pages.*

@Composable
fun App() {
    var currentPage by remember { mutableStateOf("home") }

    Header { currentPage = it }

    when (currentPage) {
        "home" -> HomePage()
        "product" -> ProductPage()
        "cart" -> CartPage()
    }
}
