package pl.klenczi.jcomposeflagiaplikacja

data class Panstwo(
    var name: String,
    var properties: MutableSet<String>, //kolory, ulozenie i znaczek
    var image: Int
    )

var polska = Panstwo("Polska",mutableSetOf("white", "red", "horizontal"), 1)
var niemcy = Panstwo("Niemcy", mutableSetOf("black", "red", "yellow", "horizontal"), 1)
var estonia = Panstwo("Estonia", mutableSetOf("black", "white", "blue", "horizontal"), 1)

val countriesList = mutableListOf(polska, niemcy, estonia)