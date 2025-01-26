package com.project1.streamingservices

// SmartTV class which manages various streaming services
public class SmartTV {
    val services: ArrayList<StreamingService>

    constructor() {
        this.services = ArrayList<StreamingService>()
    }

    fun addService(service: StreamingService) {
        this.services.add(service)
    }
    
    // Displays details of all content in all streaming services
    fun displayAllServicesContent() {
        for (service in this.services) {
            for (content in service.catalog) {
                println(content.getDetails())
            }
        }
    }

    // Plays all content in all streaming services
    fun playAllContent() {
        for (service in this.services) {
            for (content in service.catalog) {
                println(content.play())
            }
        }
    }
}