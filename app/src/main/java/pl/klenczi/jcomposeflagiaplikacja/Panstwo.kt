package pl.klenczi.jcomposeflagiaplikacja

data class Panstwo(
    var name: String,
    var properties: MutableSet<String>, //kolory, ulozenie i znaczek
    var image: Int
    )

var albania = Panstwo("Albania", mutableSetOf("red", "black", "other"), R.drawable.albania)
var andora = Panstwo("Andora", mutableSetOf("blue", "yellow", "vertical"), R.drawable.andora)
var austria = Panstwo("Austria", mutableSetOf("red", "white", "horizontal"), R.drawable.austria)
var belgia = Panstwo("Belgia", mutableSetOf("black", "yellow", "red", "vertical"), R.drawable.belgia)
var bialorus = Panstwo("Bialorus", mutableSetOf("red", "green", "horizontal"), R.drawable.bialorus)
var bosnia = Panstwo("Bosnia i Hercegowina", mutableSetOf("blue", "yellow", "white", "other"), R.drawable.bosnia)
var bulgaria = Panstwo("Bułgaria", mutableSetOf("white", "green", "red", "horizontal"), R.drawable.bulgaria)
var chorwacja = Panstwo("Chorwacja", mutableSetOf("red", "white", "blue", "horizontal"), R.drawable.chorwacja)
var cypr = Panstwo("Cypr", mutableSetOf("white", "blue", "other"), R.drawable.cypr)
var czarnogora = Panstwo("Czarnogora", mutableSetOf("red", "yellow", "other"), R.drawable.czarnogora)
var czechy = Panstwo("Czechy", mutableSetOf("white", "red", "other"), R.drawable.czechy)
var dania = Panstwo("Dania", mutableSetOf("red", "white", "cross"), R.drawable.dania)
var estonia = Panstwo("Estonia", mutableSetOf("blue", "black", "white", "horizontal"), R.drawable.estonia)
var finlandia = Panstwo("Finlandia", mutableSetOf("blue", "white", "cross"), R.drawable.finlandia)
var francja = Panstwo("Francja", mutableSetOf("blue", "white", "red", "vertical"), R.drawable.francja)
var gibraltar = Panstwo("Gibraltar", mutableSetOf("white", "red", "other"), R.drawable.giblartar)
var grecja = Panstwo("Grecja", mutableSetOf("blue", "white", "other"), R.drawable.grecja)
var hiszpania = Panstwo("Hiszpania", mutableSetOf("red", "yellow", "horizontal"), R.drawable.hiszpania)
var holandia = Panstwo("Holandia", mutableSetOf("red", "white", "blue", "horizontal"), R.drawable.holandia)
var irlandia = Panstwo("Irlandia", mutableSetOf("green", "white", "orange", "vertical"), R.drawable.irlandia)
var islandia = Panstwo("Islandia", mutableSetOf("blue", "red", "white", "cross"), R.drawable.islandia)
var liechtenstein = Panstwo("Liechtenstein", mutableSetOf("blue", "red", "horizontal"), R.drawable.liechtenstein)
var litwa = Panstwo("Litwa", mutableSetOf("yellow", "green", "red", "horizontal"), R.drawable.litwa)
var luksemburg = Panstwo("Luksemburg", mutableSetOf("red", "white", "blue", "horizontal"), R.drawable.luksemburg)
var lotwa = Panstwo("Lotwa", mutableSetOf("red", "white", "horizontal"), R.drawable.lotwa)
var malta = Panstwo("Malta", mutableSetOf("red", "white", "vertical"), R.drawable.malta)
var macedonia = Panstwo("Macedonia", mutableSetOf("red", "yellow", "other"), R.drawable.macedonia)
var monako = Panstwo("Monako", mutableSetOf("red", "white", "horizontal"), R.drawable.monako)
var niemcy = Panstwo("Niemcy", mutableSetOf("black", "red", "yellow", "horizontal"), R.drawable.niemcy)
var norwegia = Panstwo("Norwegia", mutableSetOf("red", "white", "blue", "cross"), R.drawable.norwegia)
var portugalia = Panstwo("Portugalia", mutableSetOf("green", "red", "vertical"), R.drawable.portugalia)
var polska = Panstwo("Polska",mutableSetOf("white", "red", "horizontal"), R.drawable.polska)
var rosja = Panstwo("Rosja", mutableSetOf("white", "blue", "red", "horizontal"), R.drawable.rosja)
var rumunia = Panstwo("Rumunia", mutableSetOf("blue", "yellow", "red", "vertical"), R.drawable.rumunia)
var sanmarino = Panstwo("San Marino", mutableSetOf("white", "blue", "vertical"), R.drawable.sanmarino)
var serbia = Panstwo("Serbia", mutableSetOf("red", "blue", "white", "horizontal"), R.drawable.serbia)
var slowacja = Panstwo("Słowacja", mutableSetOf("white", "blue", "red", "horizontal"), R.drawable.slowacja)
var slowenia = Panstwo("Słowenia", mutableSetOf("white", "blue", "red", "horizontal"), R.drawable.slowenia)
var szkocja = Panstwo("Szkocja", mutableSetOf("blue", "white", "cross"), R.drawable.szkocja)
var szwajcaria = Panstwo("Szwajcaria", mutableSetOf("red", "white", "cross"), R.drawable.szwajcaria)
var szwecja = Panstwo("Szwecja", mutableSetOf("blue", "yellow", "cross"), R.drawable.szwecja)
var turcja = Panstwo("Turcja", mutableSetOf("red", "white", "other"), R.drawable.turcja)
var ukraina = Panstwo("Ukraina", mutableSetOf("blue", "yellow", "horizontal"), R.drawable.ukraina)
var wegry = Panstwo("Węgry", mutableSetOf("red", "white", "green", "horizontal"), R.drawable.wegry)
var wielka_brytania = Panstwo("Wielka Brytania", mutableSetOf("red", "white", "blue", "cross"), R.drawable.wielkabrytania)
var wlochy = Panstwo("Włochy", mutableSetOf("green", "white", "red", "vertical"), R.drawable.wlochy)

var argentina = Panstwo("Argentyna", mutableSetOf("blue", "white"), R.drawable.argentyna)
var bahamy = Panstwo("Bahamy", mutableSetOf("blue", "yellow"), R.drawable.bahamy)
var belize = Panstwo("Belize", mutableSetOf("red", "blue"), R.drawable.belize)
var boliwia = Panstwo("Boliwia", mutableSetOf("red", "yellow", "green"), R.drawable.boliwia)
var brazylia = Panstwo("Brazylia", mutableSetOf("green", "yellow"), R.drawable.brazylia)
var chili = Panstwo("Chile", mutableSetOf("red", "white", "blue"), R.drawable.chile)
var ekwador = Panstwo("Ekwador", mutableSetOf("yellow", "blue", "red"), R.drawable.ekwador)
var gujana = Panstwo("Gujana", mutableSetOf("green", "yellow", "black"), R.drawable.gujana)
var jamajka = Panstwo("Jamajka", mutableSetOf("green", "yellow", "black"), R.drawable.jamajka)
var kanada = Panstwo("Kanada", mutableSetOf("red", "white"), R.drawable.kanada)
var kolumbia = Panstwo("Kolumbia", mutableSetOf("yellow", "blue", "red"), R.drawable.kolumbia)
var kostaryka = Panstwo("Kostaryka", mutableSetOf("blue", "white", "red"), R.drawable.kostaryka)
var kuba = Panstwo("Kuba", mutableSetOf("red", "blue", "white"), R.drawable.kuba)
var meksyk = Panstwo("Meksyk", mutableSetOf("green", "white", "red"), R.drawable.meksyk)
var panama = Panstwo("Panama", mutableSetOf("red", "white", "blue"), R.drawable.panama)
var paragwaj = Panstwo("Paragwaj", mutableSetOf("red", "white", "blue"), R.drawable.paragwaj)
var peru = Panstwo("Peru", mutableSetOf("red", "white"), R.drawable.peru)
var stanyzjednoczone = Panstwo("Stany Zjednoczone", mutableSetOf("red", "white", "blue"), R.drawable.stanyzjednoczone)
var surinam = Panstwo("Surinam", mutableSetOf("green", "yellow", "red"), R.drawable.surinam)
var urugwaj = Panstwo("Urugwaj", mutableSetOf("white", "blue"), R.drawable.urugwaj)
var wenezuela = Panstwo("Wenezuela", mutableSetOf("yellow", "blue", "red"), R.drawable.wenezuela)

val countriesList = mutableListOf(
    albania,
    andora,
    argentina,
    austria,
    bahamy,
    belgia,
    belize,
    bialorus,
    boliwia,
    brazylia,
    bulgaria,
    chorwacja,
    chili,
    cypr,
    czarnogora,
    czechy,
    dania,
    ekwador,
    estonia,
    finlandia,
    francja,
    gibraltar,
    grecja,
    gujana,
    hiszpania,
    holandia,
    irlandia,
    islandia,
    jamajka,
    kanada,
    kolumbia,
    kostaryka,
    kuba,
    liechtenstein,
    litwa,
    luksemburg,
    lotwa,
    malta,
    macedonia,
    meksyk,
    monako,
    niemcy,
    norwegia,
    panama,
    paragwaj,
    peru,
    polska,
    portugalia,
    rosja,
    rumunia,
    sanmarino,
    serbia,
    slowacja,
    slowenia,
    stanyzjednoczone,
    surinam,
    szkocja,
    szwajcaria,
    szwecja,
    turcja,
    ukraina,
    urugwaj,
    wegry,
    wielka_brytania,
    wenezuela,
    wlochy
)