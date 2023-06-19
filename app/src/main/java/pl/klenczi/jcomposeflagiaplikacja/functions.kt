package pl.klenczi.jcomposeflagiaplikacja

fun filter(
    countriesInput: MutableList<Panstwo>,
    properties: MutableSet<String>,
    continent: MutableSet<String>): MutableList<Panstwo> {
    var countriesOutput: MutableList<Panstwo> = mutableListOf()
    for(country in countriesInput){
        if((country.properties).containsAll(properties) && (continent.isEmpty() || zawiera(co = country.continent, wCzym = continent))){
            countriesOutput.add(country)
        }
    }
    return countriesOutput
}

fun zawiera( // funkcja do sprawdzenia czy element ze zbioru 1 zawiera przynajmniej jeden element ze zbioru 2
    co: MutableSet<String>,
    wCzym: MutableSet<String>): Boolean{
    var conditioner = 0
    for(i in co){
        if(wCzym.contains(i)){
            conditioner++
        }
    }
    return conditioner >= 1
}