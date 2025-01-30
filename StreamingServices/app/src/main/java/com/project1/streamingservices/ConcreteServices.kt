package com.project1.streamingservices

// Concrete Streaming Services
class Netflix : StreamingService() {
    override fun getSubscriptionCost(): Double {
        return 17.99
    }

    override fun getName(): String {
        return "Netflix"
    }
}

class Hulu : StreamingService() {
    override fun getSubscriptionCost(): Double {
        return 9.99
    }

    override fun getName(): String {
        return "Hulu"
    }
}