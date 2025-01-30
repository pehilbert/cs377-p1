package com.project1.streamingservices

// Abstract streaming service class, which provides the ability to contain Content
abstract class StreamingService {
    val catalog: ArrayList<Content> = ArrayList()

    fun addContent(content: Content) {
        this.catalog.add(content)
    }

    abstract fun getSubscriptionCost(): Double
    abstract fun getName(): String
}