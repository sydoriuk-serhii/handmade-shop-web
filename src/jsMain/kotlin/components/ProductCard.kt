package components

import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*

@Composable
fun ProductCard(
    id: String,
    title: String,
    description: String,
    price: Double,
    onAddToCart: (String, String, Double) -> Unit
) {
    Div(attrs = {
        style {
            border(1.px, LineStyle.Solid, Color.lightgray)
            borderRadius(4.px)
            padding(16.px)
            marginBottom(16.px)
        }
    }) {
        H3 { Text(title) }
        P { Text(description) }
        P(attrs = {
            style {
                fontWeight("bold")
                color(Color.darkgreen)
            }
        }) { Text("Price: $${price.toFixed(2)}") }
        Button(attrs = {
            style {
                backgroundColor(Color.cadetblue)
            }
            onClick {
                onAddToCart(id, title, price)
                console.log("Added $title to cart")
            }
        }) { Text("Add to Cart") }
    }
}

// Extension function to format doubles as currency
fun Double.toFixed(digits: Int): String {
    return this.asDynamic().toFixed(digits) as String
}