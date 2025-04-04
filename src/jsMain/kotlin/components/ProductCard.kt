package components

import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*

@Composable
fun ProductCard(title: String, description: String, price: String) {
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
        }) { Text("Price: $price") }
        Button(attrs = {
            style {
                backgroundColor(Color.cadetblue)
            }
            onClick { console.log("Added $title to cart") }
        }) { Text("Add to Cart") }
    }
}