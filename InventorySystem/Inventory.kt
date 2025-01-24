class Inventory {
    val map: HashMap<String, Int>

    constructor() {
        this.map = HashMap()
    }

    fun add(id: String, quantity: Int): Unit {
        if (map.containsKey(id)) {
            throw Exception("Cannot add a product that already exists.")
        }

        map.put(id, maxOf(0, quantity))
    }

    fun update(id: String, newQuant: Int): Unit {
        if (!map.containsKey(id)) {
            throw Exception("Cannot update a nonexistent product.")
        }

        map.put(id, maxOf(0, newQuant))
    }

    fun get(id: String): Int {
        if (!map.containsKey(id)) {
            throw Exception("Product not found.")
        }

        return map.getOrDefault(id, 0)
    }

    fun remove(id: String): Unit {
        if (!map.containsKey(id)) {
            throw Exception("Cannot delete a nonexistent product.")
        }

        map.remove(id)
    }

    fun display() {
        for (entry in this.map) {
            var product = entry.key
            var quantity = entry.value

            println("$product: $quantity")
        }
    }
}