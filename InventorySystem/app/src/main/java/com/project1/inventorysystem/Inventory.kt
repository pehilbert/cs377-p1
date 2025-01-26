package com.project1.inventorysystem

public class Inventory {
    val map: HashMap<String, Int>

    constructor() {
        this.map = HashMap<String, Int>()
    }
    
    // Adds a new entry into inventory. Throws exception if product already exists
    fun add(id: String, quantity: Int): Unit {
        if (map.containsKey(id)) {
            throw Exception("Cannot add a product that already exists.")
        }

        map.put(id, maxOf(0, quantity))
    }

    // Updates an existing entry. Throws exception if product does not exist
    fun update(id: String, newQuant: Int): Unit {
        if (!map.containsKey(id)) {
            throw Exception("Cannot update a nonexistent product.")
        }

        map.put(id, maxOf(0, newQuant))
    }

    // Gets the quantity of an entry. Throws exception if product does not exist
    fun get(id: String): Int {
        if (!map.containsKey(id)) {
            throw Exception("Product not found.")
        }

        return map.getOrDefault(id, 0)
    }

    // Removes an entry. Throws exception if product does not exist
    fun remove(id: String): Unit {
        if (!map.containsKey(id)) {
            throw Exception("Cannot delete a nonexistent product.")
        }

        map.remove(id)
    }

    // Displays current inventory
    fun display() {
        for (entry in this.map) {
            var product = entry.key
            var quantity = entry.value

            println("$product: $quantity")
        }
    }
}