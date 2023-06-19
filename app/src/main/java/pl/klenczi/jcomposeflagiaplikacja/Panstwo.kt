package pl.klenczi.jcomposeflagiaplikacja

data class Panstwo(
    var name: String,
    var continent: MutableSet<String>,
    var properties: MutableSet<String>, //kolory, ulozenie i znaczek
    var image: Int
    )

