package com.project1.streamingservices

fun main() {
    val smartTV = SmartTV()

    // Creating streaming services
    val netflix = Netflix()
    val hulu = Hulu()

    // Creating content for Netflix
    val netflixMovie = Movie("Inception", "Christopher Nolan", 2010, "Sci-Fi")
    val netflixTVShow = TVShow("Stranger Things", "The Duffer Brothers", 2016, "Sci-Fi", 4, 34)
    val netflixDocumentary = Documentary("Our Planet", "David Attenborough", 2019, "Nature", "Environmental Issues")

    // Creating content for Hulu
    val huluMovie = Movie("The Matrix", "Wachowski Sisters", 1999, "Action")
    val huluTVShow = TVShow("The Handmaid's Tale", "Bruce Miller", 2017, "Drama", 4, 46)
    val huluDocumentary = Documentary("Fyre", "Chris Smith", 2019, "Documentary", "Music Festival Disaster")

    // Adding content to services
    netflix.addContent(netflixMovie)
    netflix.addContent(netflixTVShow)
    netflix.addContent(netflixDocumentary)
    hulu.addContent(huluMovie)
    hulu.addContent(huluTVShow)
    hulu.addContent(huluDocumentary)

    // Adding services to the SmartTV
    smartTV.addService(netflix)
    smartTV.addService(hulu)
    
    // Using the SmartTV
    smartTV.displayAllServicesContent()
    smartTV.playAllContent()
}