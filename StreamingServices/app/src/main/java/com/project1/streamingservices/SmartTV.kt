package com.project1.streamingservices

// SmartTV class which manages various streaming services
class SmartTV {
    private val services: ArrayList<StreamingService> = ArrayList()

    fun addService(service: StreamingService) {
        services.add(service)
    }
    
    // Displays details of all content in all streaming services
    fun displayAllServicesContent() {
        for (service in services) {
            for (content in service.catalog) {
                println(content.getDetails())
            }
        }
    }

    // Plays all content in all streaming services
    fun playAllContent() {
        for (service in services) {
            for (content in service.catalog) {
                println(content.play())
            }
        }
    }

    // Displays details of all content in all streaming services
    fun displayAllSubscriptionCosts() {
        for (service in services) {
            println("${service.getName()}: ${service.getSubscriptionCost()}")

            for (content in service.catalog) {
                println("${content.getDetails()}, cost: ${content.getSubscriptionCost()}")
            }
        }
    }
}