package com.project1.inventorysystem

class Inventory {
    private val map: HashMap<String, Int> = HashMap()

    // Adds a new entry into inventory. Throws exception if product already exists
    fun add(id: String, quantity: Int) {
        if (map[id] != null) {
            throw Exception("Cannot add a product that already exists.")
        }

        map[id] = maxOf(0, quantity)
    }

    // Updates an existing entry. Throws exception if product does not exist
    fun update(id: String, newQuant: Int) {
        if (map[id] == null) {
            throw Exception("Cannot update a nonexistent product.")
        }

        map[id] = maxOf(0, newQuant)
    }

    // Gets the quantity of an entry. Throws exception if product does not exist
    fun get(id: String): Int {
        if (map[id] == null) {
            throw Exception("Product not found.")
        }

        // suggestion by Android studio to add !!
        return map[id]!!
    }

    // Removes an entry. Throws exception if product does not exist
    fun remove(id: String) {
        if (map[id] == null) {
            throw Exception("Cannot delete a nonexistent product.")
        }

        map.remove(id)
    }

    // Displays current inventory
    fun display() {
        for (entry in map) {
            val product = entry.key
            val quantity = entry.value

            println("$product: $quantity")
        }
    }
}