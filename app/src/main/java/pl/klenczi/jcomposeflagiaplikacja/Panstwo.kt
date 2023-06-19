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
var cypr = Panstwo("Cypr", mutableSetOf("white", "yellow", "other"), R.drawable.cypr)
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
var wielkabrytania = Panstwo("Wielka Brytania", mutableSetOf("red", "white", "blue", "cross"), R.drawable.wielkabrytania)
var wlochy = Panstwo("Włochy", mutableSetOf("green", "white", "red", "vertical"), R.drawable.wlochy)

var argentina = Panstwo("Argentyna", mutableSetOf("blue", "white", "horizontal"), R.drawable.argentyna)
var bahamy = Panstwo("Bahamy", mutableSetOf("blue", "yellow", "black", "horizontal", "other"), R.drawable.bahamy)
var barbados = Panstwo("Bahamy", mutableSetOf("blue", "yellow", "black", "vertical"), R.drawable.barbados)
var belize = Panstwo("Belize", mutableSetOf("red", "blue", "horizontal", "other"), R.drawable.belize)
var boliwia = Panstwo("Boliwia", mutableSetOf("red", "yellow", "green", "horizontal"), R.drawable.boliwia)
var brazylia = Panstwo("Brazylia", mutableSetOf("green", "yellow", "other"), R.drawable.brazylia)
var chili = Panstwo("Chile", mutableSetOf("red", "white", "blue", "horizontal", "other"), R.drawable.chile)
var ekwador = Panstwo("Ekwador", mutableSetOf("yellow", "blue", "red", "horizontal"), R.drawable.ekwador)
var gujana = Panstwo("Gujana", mutableSetOf("green", "yellow", "black", "other"), R.drawable.gujana)
var jamajka = Panstwo("Jamajka", mutableSetOf("green", "yellow", "black", "cross"), R.drawable.jamajka)
var kanada = Panstwo("Kanada", mutableSetOf("red", "white", "vertical"), R.drawable.kanada)
var kolumbia = Panstwo("Kolumbia", mutableSetOf("yellow", "blue", "red", "horizontal"), R.drawable.kolumbia)
var kostaryka = Panstwo("Kostaryka", mutableSetOf("blue", "white", "red", "horizontal"), R.drawable.kostaryka)
var kuba = Panstwo("Kuba", mutableSetOf("red", "blue", "white", "horizontal", "other"), R.drawable.kuba)
var meksyk = Panstwo("Meksyk", mutableSetOf("green", "white", "red", "vertical"), R.drawable.meksyk)
var panama = Panstwo("Panama", mutableSetOf("red", "white", "blue", "other"), R.drawable.panama)
var paragwaj = Panstwo("Paragwaj", mutableSetOf("red", "white", "blue", "horizontal"), R.drawable.paragwaj)
var peru = Panstwo("Peru", mutableSetOf("red", "white", "vertical"), R.drawable.peru)
var stanyzjednoczone = Panstwo("Stany Zjednoczone", mutableSetOf("red", "white", "blue", "horizontal", "other"), R.drawable.stanyzjednoczone)
var surinam = Panstwo("Surinam", mutableSetOf("green", "yellow", "red", "horizontal"), R.drawable.surinam)
var urugwaj = Panstwo("Urugwaj", mutableSetOf("white", "blue", "horizontal", "other"), R.drawable.urugwaj)
var wenezuela = Panstwo("Wenezuela", mutableSetOf("yellow", "blue", "red", "horizontal"), R.drawable.wenezuela)
var antiguabarbuda = Panstwo("Antigua i Barbuda", mutableSetOf("red", "blue", "other"), R.drawable.antiguabarbuda)
var dominika = Panstwo("Dominika", mutableSetOf("green", "yellow", "cross"), R.drawable.dominika)
var dominikana = Panstwo("Dominikana", mutableSetOf("red", "white", "blue", "cross"), R.drawable.dominikana)
var grenada = Panstwo("Grenada", mutableSetOf("red", "yellow", "green", "other"), R.drawable.grenada)
var gwatemala = Panstwo("Gwatemala", mutableSetOf("blue", "white", "blue", "vertical"), R.drawable.gwatemala)
var haiti = Panstwo("Haiti", mutableSetOf("blue", "red", "horizontal"), R.drawable.haiti)
var honduras = Panstwo("Honduras", mutableSetOf("blue", "white", "horizontal"), R.drawable.honduras)
var nikaragua = Panstwo("Nikaragua", mutableSetOf("blue", "white", "horizontal"), R.drawable.nikaragua)
var stkittsnevis = Panstwo("St. Kitts i Nevis", mutableSetOf("green", "yellow", "black", "other"), R.drawable.stkittsnevis)
var stlucia = Panstwo("St. Lucia", mutableSetOf("blue", "yellow", "black", "other"), R.drawable.stlucia)
var stvimcentgrenadyny = Panstwo("St. Vimcent Grenadyny", mutableSetOf("blue", "green", "yellow", "vertical"), R.drawable.stvimcentgrenadyny)
var salwador = Panstwo("Salwador", mutableSetOf("blue", "white", "blue", "horizontal"), R.drawable.salwador)

var afganistan = Panstwo("Afganistan", mutableSetOf("black", "white"), R.drawable.afganistan)
var arabiasaudyjska = Panstwo("Arabia Saudyjska", mutableSetOf("green", "white"), R.drawable.arabiasaudyjska)
var armenia = Panstwo("Armenia", mutableSetOf("red", "blue", "orange"), R.drawable.armenia)
var azerbejdzan = Panstwo("Azerbejdżan", mutableSetOf("blue", "red", "green"), R.drawable.azerbejdzan)
var bahrajn = Panstwo("Bahrajn", mutableSetOf("red", "white"), R.drawable.bahrajn)
var bangladesz = Panstwo("Bangladesz", mutableSetOf("green", "red"), R.drawable.bangladesz)
var birma = Panstwo("Birma", mutableSetOf("red", "blue", "white"), R.drawable.birma)
var bhutan = Panstwo("Bhutan", mutableSetOf("orange", "yellow"), R.drawable.bhutan)
var chinskarepublikaludowa = Panstwo("Chińska Republika Ludowa", mutableSetOf("red", "yellow"), R.drawable.chinskarepublikaludowa)
var indie = Panstwo("Indie", mutableSetOf("orange", "white", "green"), R.drawable.indie)
var indonezja = Panstwo("Indonezja", mutableSetOf("red", "white"), R.drawable.indonezja)
var irak = Panstwo("Irak", mutableSetOf("red", "white", "black"), R.drawable.irak)
var iran = Panstwo("Iran", mutableSetOf("green", "white", "red"), R.drawable.iran)
var izrael = Panstwo("Izrael", mutableSetOf("blue", "white"), R.drawable.izrael)
var japonia = Panstwo("Japonia", mutableSetOf("red", "white"), R.drawable.japonia)
var jemen = Panstwo("Jemen", mutableSetOf("red", "white", "black"), R.drawable.jemen)
var jordania = Panstwo("Jordania", mutableSetOf("black", "white", "green", "red"), R.drawable.jordania)
var kazachstan = Panstwo("Kazachstan", mutableSetOf("blue", "yellow"), R.drawable.kazachstan)
var kirgistan = Panstwo("Kirgistan", mutableSetOf("red", "yellow", "blue"), R.drawable.kirgistan)
var koreapolnocna = Panstwo("Korea Północna", mutableSetOf("red", "white", "blue"), R.drawable.koreapolnocna)
var koreapoludniowa = Panstwo("Korea Południowa", mutableSetOf("red", "white", "blue"), R.drawable.koreapoludniowa)
var kuwejt = Panstwo("Kuwejt", mutableSetOf("green", "white", "red"), R.drawable.kuwejt)
var laos = Panstwo("Laos", mutableSetOf("blue", "red"), R.drawable.laos)
var liban = Panstwo("Liban", mutableSetOf("red", "white"), R.drawable.liban)
var malezja = Panstwo("Malezja", mutableSetOf("red", "white", "blue"), R.drawable.malezja)
var maledivy = Panstwo("Malediwy", mutableSetOf("red", "white", "green"), R.drawable.maledivy)
var mongolia = Panstwo("Mongolia", mutableSetOf("red", "blue"), R.drawable.mongolia)
var nepal = Panstwo("Nepal", mutableSetOf("red", "white"), R.drawable.nepal)
var oman = Panstwo("Oman", mutableSetOf("red", "white", "green"), R.drawable.oman)
var pakistan = Panstwo("Pakistan", mutableSetOf("green", "white"), R.drawable.pakistan)
var filipiny = Panstwo("Filipiny", mutableSetOf("blue", "red", "yellow"), R.drawable.filipiny)
var katar = Panstwo("Katar", mutableSetOf("czerwony", "white"), R.drawable.qatar)
var singapur = Panstwo("Singapur", mutableSetOf("red", "white"), R.drawable.singapur)
var srilanka = Panstwo("Sri Lanka", mutableSetOf("yellow", "red", "green"), R.drawable.srilanka)
var syria = Panstwo("Syria", mutableSetOf("red", "white", "black"), R.drawable.syria)
var tadzykistan = Panstwo("Tadżykistan", mutableSetOf("red", "white", "green"), R.drawable.tadzykistan)
var tajlandia = Panstwo("Tajlandia", mutableSetOf("red", "white", "blue"), R.drawable.tajlandia)
var timorwschodni = Panstwo("Timor Wschodni", mutableSetOf("red", "black", "yellow"), R.drawable.timorwschodni)
var turkmenistan = Panstwo("Turkmenistan", mutableSetOf("green", "red"), R.drawable.turkmenistan)
var uzbeckistan = Panstwo("Uzbekistan", mutableSetOf("blue", "white", "green"), R.drawable.uzbekistan)
var wietnam = Panstwo("Wietnam", mutableSetOf("red", "yellow"), R.drawable.wietnam)
var zjednoczoneemiratyarabskie = Panstwo("Zjednoczone Emiraty Arabskie", mutableSetOf("black", "white", "green", "red"), R.drawable.emiratyarabskie)


val countriesList = mutableListOf(
    afganistan,
    albania,
    andora,
    antiguabarbuda,
    arabiasaudyjska,
    argentina,
    armenia,
    azerbejdzan,
    austria,
    bahamy,
    bahrajn,
    bangladesz,
    barbados,
    belgia,
    belize,
    bhutan,
    bialorus,
    birma,
    boliwia,
    bosnia,
    brazylia,
    bulgaria,
    chorwacja,
    chili,
    chinskarepublikaludowa,
    cypr,
    czarnogora,
    czechy,
    dania,
    dominika,
    dominikana,
    ekwador,
    estonia,
    filipiny,
    finlandia,
    francja,
    gibraltar,
    grecja,
    grenada,
    gujana,
    gwatemala,
    haiti,
    honduras,
    indie,
    indonezja,
    irak,
    iran,
    irlandia,
    islandia,
    izrael,
    jamajka,
    japonia,
    jemen,
    jordania,
    kanada,
    katar,
    kazachstan,
    kirgistan,
    kolumbia,
    koreapolnocna,
    koreapoludniowa,
    kostaryka,
    kuba,
    kuwejt,
    laos,
    liban,
    liechtenstein,
    litwa,
    luksemburg,
    lotwa,
    malezja,
    maledivy,
    malta,
    macedonia,
    meksyk,
    monako,
    mongolia,
    nepal,
    nikaragua,
    niemcy,
    norwegia,
    oman,
    pakistan,
    panama,
    paragwaj,
    peru,
    polska,
    portugalia,
    rosja,
    rumunia,
    salwador,
    sanmarino,
    serbia,
    singapur,
    slowacja,
    slowenia,
    srilanka,
    stkittsnevis,
    stlucia,
    stvimcentgrenadyny,
    stanyzjednoczone,
    surinam,
    syria,
    szkocja,
    szwajcaria,
    szwecja,
    tadzykistan,
    tajlandia,
    timorwschodni,
    turcja,
    turkmenistan,
    ukraina,
    urugwaj,
    uzbeckistan,
    wegry,
    wielkabrytania,
    wietnam,
    wenezuela,
    wlochy,
    zjednoczoneemiratyarabskie,
)