package com.project1.streamingservices

// Concrete Content types
class Movie(name: String, creator: String, releaseYear: Int, genre: String) : Content(name, creator, releaseYear, genre) {
    override fun play(): String {
        return "Playing Movie: $name"
    }

    override fun getSubscriptionCost(): Double {
        return 5.99
    }
}

class TVShow(name: String, creator: String, releaseYear: Int, genre: String, private val seasons: Int, private val episodes: Int) : Content(name, creator, releaseYear, genre) {
    override fun play(): String {
        return "Playing TV Show: $name"
    }

    override fun getDetails(): String {
        return "$name ($releaseYear) by $creator, Genre: $genre, $seasons seasons and $episodes episodes"
    }

    override fun getSubscriptionCost(): Double {
        return 10.99
    }
}

class Documentary(name: String, creator: String, releaseYear: Int, genre: String, private val topic: String) : Content(name, creator, releaseYear, genre) {
    override fun play(): String {
        return "Playing Documentary: $name"
    }

    override fun getDetails(): String {
        return "$name ($releaseYear) by $creator, Genre: $genre, Topic: $topic"
    }

    override fun getSubscriptionCost(): Double {
        return 4.99
    }
}