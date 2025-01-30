package com.project1.streamingservices

// Concrete Content types
class Movie(name: String, creator: String, releaseYear: Int, genre: String) : Content(name, creator, releaseYear, genre) {
    override fun play(): String {
        return "Playing Movie: ${this.name}"
    }

    override fun getSubscriptionCost(): Double {
        return 5.99
    }
}

class TVShow(name: String, creator: String, releaseYear: Int, genre: String, val seasons: Int, val episodes: Int) : Content(name, creator, releaseYear, genre) {
    override fun play(): String {
        return "Playing TV Show: ${this.name}"
    }

    override fun getDetails(): String {
        return "${this.name} (${this.releaseYear}) by ${this.creator}, Genre: ${this.genre}, ${this.seasons} seasons and ${this.episodes} episodes"
    }

    override fun getSubscriptionCost(): Double {
        return 10.99
    }
}

class Documentary(name: String, creator: String, releaseYear: Int, genre: String, val topic: String) : Content(name, creator, releaseYear, genre) {
    override fun play(): String {
        return "Playing Documentary: ${this.name}"
    }

    override fun getDetails(): String {
        return "${this.name} (${this.releaseYear}) by ${this.creator}, Genre: ${this.genre}, Topic: ${this.topic}"
    }

    override fun getSubscriptionCost(): Double {
        return 4.99
    }
}