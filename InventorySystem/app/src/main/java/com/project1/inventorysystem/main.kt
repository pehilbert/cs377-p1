package com.project1.inventorysystem

// Main function for testing
fun main() {
    // Instantiate inventory object
    val inv = Inventory()

    // Populate initial inventory
    inv.add("Apples", 2)
    inv.add("Bananas", 5)

    println("Initial inventory:")
    inv.display()

    // Try to get a value
    val numApples = inv.get("Apples")
    println("Retrieved number of apples: $numApples")

    // Update some values
    inv.update("Apples", 4)
    inv.update("Bananas", -1)

    println("Updated apples quantity to 4, tried to set bananas to -1")
    inv.display()

    // Try to remove something
    inv.remove("Bananas")
    
    println("Removed bananas")
    inv.display()

    // Try to update something we haven't added yet, should throw an exception
    println("Trying to update squash")
    inv.update("Squash", 2)
}