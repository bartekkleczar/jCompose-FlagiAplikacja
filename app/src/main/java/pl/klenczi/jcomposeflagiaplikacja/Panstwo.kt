package pl.klenczi.jcomposeflagiaplikacja

data class Panstwo(
    var name: String,
    var properties: MutableSet<String>, //kolory, ulozenie i znaczek
    var image: Int
    )

var albania = Panstwo("Albania", mutableSetOf("red", "black"), R.drawable.albania)
var andora = Panstwo("Andora", mutableSetOf("blue", "yellow"), R.drawable.andora)
var austria = Panstwo("Austria", mutableSetOf("red", "white"), R.drawable.austria)
var belgia = Panstwo("Belgia", mutableSetOf("black", "yellow", "red"), R.drawable.belgia)
var bialorus = Panstwo("Bialorus", mutableSetOf("red", "green"), R.drawable.bialorus)
var bosnia = Panstwo("Bosnia i Hercegowina", mutableSetOf("blue", "yellow", "white"), R.drawable.bosnia)
var bulgaria = Panstwo("Bułgaria", mutableSetOf("white", "green", "red"), R.drawable.bulgaria)
var chorwacja = Panstwo("Chorwacja", mutableSetOf("red", "white", "blue"), R.drawable.chorwacja)
//var cypr = Panstwo("Cypr", mutableSetOf("white", "blue"), R.drawable.cypr)
var czarnogora = Panstwo("Czarnogora", mutableSetOf("red", "gold"), R.drawable.czarnogora)
var czechy = Panstwo("Czechy", mutableSetOf("white", "red"), R.drawable.czechy)
var dania = Panstwo("Dania", mutableSetOf("red", "white"), R.drawable.dania)
var estonia = Panstwo("Estonia", mutableSetOf("blue", "black", "white"), R.drawable.estonia)
var finlandia = Panstwo("Finlandia", mutableSetOf("blue", "white"), R.drawable.finlandia)
var francja = Panstwo("Francja", mutableSetOf("blue", "white", "red"), R.drawable.francja)
var gibraltar = Panstwo("Gibraltar", mutableSetOf("white", "red"), R.drawable.giblartar)
var grecja = Panstwo("Grecja", mutableSetOf("blue", "white"), R.drawable.grecja)
var hiszpania = Panstwo("Hiszpania", mutableSetOf("red", "yellow"), R.drawable.hiszpania)
var holandia = Panstwo("Holandia", mutableSetOf("red", "white", "blue"), R.drawable.holandia)
var irlandia = Panstwo("Irlandia", mutableSetOf("green", "white", "orange"), R.drawable.irlandia)
var islandia = Panstwo("Islandia", mutableSetOf("blue", "red", "white"), R.drawable.islandia)
var liechtenstein = Panstwo("Liechtenstein", mutableSetOf("blue", "red"), R.drawable.liechtenstein)
var litwa = Panstwo("Litwa", mutableSetOf("yellow", "green", "red"), R.drawable.litwa)
var luksemburg = Panstwo("Luksemburg", mutableSetOf("red", "white", "light blue"), R.drawable.luksemburg)
var lotwa = Panstwo("Lotwa", mutableSetOf("red", "white"), R.drawable.lotwa)
var malta = Panstwo("Malta", mutableSetOf("red", "white"), R.drawable.malta)
var macedonia = Panstwo("Macedonia", mutableSetOf("red", "yellow"), R.drawable.macedonia)
var monako = Panstwo("Monako", mutableSetOf("red", "white"), R.drawable.monako)
var niemcy = Panstwo("Niemcy", mutableSetOf("black", "red", "yellow"), R.drawable.niemcy)
var norwegia = Panstwo("Norwegia", mutableSetOf("red", "white", "blue"), R.drawable.norwegia)
var portugalia = Panstwo("Portugalia", mutableSetOf("green", "red"), R.drawable.portugalia)
var polska = Panstwo("Polska",mutableSetOf("white", "red"), R.drawable.polska)
var rosja = Panstwo("Rosja", mutableSetOf("white", "blue", "red"), R.drawable.rosja)
var rumunia = Panstwo("Rumunia", mutableSetOf("blue", "yellow", "red"), R.drawable.rumunia)
var sanmarino = Panstwo("San Marino", mutableSetOf("white", "blue"), R.drawable.sanmarino)
var serbia = Panstwo("Serbia", mutableSetOf("red", "blue", "white"), R.drawable.serbia)
var slowacja = Panstwo("Słowacja", mutableSetOf("white", "blue", "red"), R.drawable.slowacja)
var slowenia = Panstwo("Słowenia", mutableSetOf("white", "blue", "red"), R.drawable.slowenia)
var szkocja = Panstwo("Szkocja", mutableSetOf("blue", "white"), R.drawable.szkocja)
var szwajcaria = Panstwo("Szwajcaria", mutableSetOf("red", "white"), R.drawable.szwajcaria)
var szwecja = Panstwo("Szwecja", mutableSetOf("blue", "yellow"), R.drawable.szwecja)
var turcja = Panstwo("Turcja", mutableSetOf("red", "white"), R.drawable.turcja)
var ukraina = Panstwo("Ukraina", mutableSetOf("blue", "yellow"), R.drawable.ukraina)
var wegry = Panstwo("Węgry", mutableSetOf("red", "white", "green"), R.drawable.wegry)
var wielka_brytania = Panstwo("Wielka Brytania", mutableSetOf("red", "white", "blue"), R.drawable.wielkabrytania)
var wlochy = Panstwo("Włochy", mutableSetOf("green", "white", "red"), R.drawable.wlochy)

val countriesList = mutableListOf(
    polska,
    niemcy,
    estonia,
    albania,
    andora,
    austria,
    belgia,
    bialorus,
    bosnia,
    bulgaria,
    chorwacja,
    //cypr,
    czarnogora,
    czechy,
    dania,
    estonia,
    finlandia,
    francja,
    gibraltar,
    grecja,
    hiszpania,
    holandia,
    irlandia,
    islandia,
    liechtenstein,
    litwa,
    luksemburg,
    lotwa,
    malta,
    macedonia,
    monako,
    niemcy,
    norwegia,
    portugalia,
    rosja,
    rumunia,
    sanmarino,
    serbia,
    slowacja,
    slowenia,
    szkocja,
    szwajcaria,
    szwecja,
    turcja,
    ukraina,
    wegry,
    wielka_brytania,
    wlochy
)