package com.project1.streamingservices

// Abstract streaming service class, which provides the ability to contain Content
public abstract class StreamingService {
    val catalog: ArrayList<Content>

    constructor() {
        this.catalog = ArrayList<Content>()
    }

    fun addContent(content: Content) {
        this.catalog.add(content)
    }
}