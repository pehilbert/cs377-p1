package com.project1.streamingservices

// Abstract Content class; things like Movies and TV Shows inherit from this
public abstract class Content(val name: String, val creator: String, val releaseYear: Int, val genre: String) : Playable {
    override fun play(): String {
        return "Playing some content"
    }

    override fun getDetails(): String {
        return "${this.name} (${this.releaseYear}) by ${this.creator}, Genre: ${this.genre}"
    }

    abstract fun getSubscriptionCost(): Double
}