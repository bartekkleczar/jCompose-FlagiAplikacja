package pl.klenczi.jcomposeflagiaplikacja

data class Panstwo(
    var name: String,
    var properties: Set<String>, //kolory, ulozenie i znaczek
    var image: Int
    )

var polska = Panstwo("Polska",setOf("white", "red", "horizontal"), 1)
var niemcy = Panstwo("Niemcy", setOf("black", "red", "yellow", "horizontal"), 1)

val countriesList = listOf(polska, niemcy)