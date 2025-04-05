package org.example.pages

import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*
import org.example.model.CartItem

@Composable
fun CartPage(items: List<CartItem>, onUpdateCart: (List<CartItem>) -> Unit) {
    H1 { Text("Shopping Cart") }

    if (items.isEmpty()) {
        P { Text("Your cart is empty.") }
    } else {
        Div {
            items.forEach { item ->
                Div(attrs = {
                    style {
                        border(1.px, LineStyle.Solid, Color.lightgray)
                        padding(8.px)
                        marginBottom(8.px)
                        display(DisplayStyle.Flex)
                        justifyContent(JustifyContent.SpaceBetween)
                        alignItems(AlignItems.Center)
                    }
                }) {
                    Div {
                        H3 { Text(item.title) }
                        P { Text("Price: $${item.price.toFixed(2)}") }
                        P { Text("Quantity: ${item.quantity}") }
                        P { Text("Total: $${(item.price * item.quantity).toFixed(2)}") }
                    }

                    Div {
                        Button(attrs = {
                            onClick {
                                val updatedItems = items.map {
                                    if (it.id == item.id) it.copy(quantity = it.quantity + 1) else it
                                }
                                onUpdateCart(updatedItems)
                            }
                        }) { Text("+") }

                        Button(attrs = {
                            style { marginLeft(4.px) }
                            onClick {
                                val updatedItems = if (item.quantity > 1) {
                                    items.map {
                                        if (it.id == item.id) it.copy(quantity = it.quantity - 1) else it
                                    }
                                } else {
                                    items.filter { it.id != item.id }
                                }
                                onUpdateCart(updatedItems)
                            }
                        }) { Text("-") }

                        Button(attrs = {
                            style {
                                marginLeft(8.px)
                                backgroundColor(Color.red)
                            }
                            onClick {
                                val updatedItems = items.filter { it.id != item.id }
                                onUpdateCart(updatedItems)
                            }
                        }) { Text("Remove") }
                    }
                }
            }

            // Total section
            val total = items.sumOf { it.price * it.quantity }
            Div(attrs = {
                style {
                    border(1.px, LineStyle.Solid, Color.darkgray)
                    paddingTop(16.px)
                    marginTop(16.px)
                    textAlign("right")
                    fontWeight("bold")
                }
            }) {
                P { Text("Total: $${total.toFixed(2)}") }
                Button(attrs = {
                    style {
                        backgroundColor(Color.green)
                        padding(12.px, 24.px)
                        marginTop(8.px)
                    }
                    onClick { console.log("Checkout initiated for $${total.toFixed(2)}") }
                }) { Text("Checkout") }
            }
        }
    }
}

// Extension function to format doubles as currency
fun Double.toFixed(digits: Int): String {
    return this.asDynamic().toFixed(digits) as String
}