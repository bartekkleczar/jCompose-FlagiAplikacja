package pl.klenczi.jcomposeflagiaplikacja

data class Panstwo(
    var name: String,
    var properties: MutableSet<String>, //kolory, ulozenie i znaczek
    var image: Int
    )

var polska = Panstwo("Polska",mutableSetOf("white", "red", "horizontal"), R.drawable.polska)
var niemcy = Panstwo("Niemcy", mutableSetOf("black", "red", "yellow", "horizontal"), R.drawable.niemcy)
var estonia = Panstwo("Estonia", mutableSetOf("black", "white", "blue", "horizontal"), R.drawable.estonia)

val countriesList = mutableListOf(polska, niemcy, estonia)