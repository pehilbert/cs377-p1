package com.project1.inventorysystem

fun main() {
    val inv = Inventory()

    inv.add("Apples", 2)
    inv.add("Bananas", 5)

    println("Initial inventory:")
    inv.display()

    val numApples = inv.get("Apples")
    println("Retrieved number of apples: $numApples")

    inv.update("Apples", 4)
    inv.update("Bananas", -1)

    println("Updated apples quantity to 4, tried to set bananas to -1")
    inv.display()

    inv.remove("Bananas")
    
    println("Removed bananas")
    inv.display()

    println("Trying to update squash")
    inv.update("Squash", 2)
}