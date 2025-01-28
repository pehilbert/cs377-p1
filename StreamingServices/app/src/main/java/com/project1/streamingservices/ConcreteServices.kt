package com.project1.streamingservices

// Concrete Streaming Services
public class Netflix : StreamingService() {
    override fun getSubscriptionCost(): Double {
        return 17.99
    }
}

public class Hulu : StreamingService() {
    override fun getSubscriptionCost(): Double {
        return 9.99
    }
}