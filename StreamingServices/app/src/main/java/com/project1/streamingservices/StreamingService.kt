package com.project1.streamingservices

// Abstract streaming service class, which provides the ability to contain Content,
// have a subscription cost and have a name
abstract class StreamingService {
    val catalog: ArrayList<Content> = ArrayList()

    fun addContent(content: Content) {
        catalog.add(content)
    }

    abstract fun getSubscriptionCost(): Double
    abstract fun getName(): String
}