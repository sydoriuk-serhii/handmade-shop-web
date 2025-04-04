package components

import androidx.compose.runtime.*
import model.CartItem
import pages.*

@Composable
fun App() {
    var currentPage by remember { mutableStateOf("home") }
    var cartItems by remember { mutableStateOf(listOf<CartItem>()) }

    val addToCart: (String, String, Double) -> Unit = { id, title, price ->
        val existingItem = cartItems.find { it.id == id }
        cartItems = if (existingItem != null) {
            cartItems.map { if (it.id == id) it.copy(quantity = it.quantity + 1) else it }
        } else {
            cartItems + CartItem(id, title, price)
        }
    }

    Header { currentPage = it }

    when (currentPage) {
        "home" -> HomePage(addToCart)
        "product" -> ProductPage(addToCart)
        "cart" -> CartPage(cartItems) {
            cartItems = it
        }
    }
}