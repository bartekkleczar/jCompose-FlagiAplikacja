package pl.klenczi.jcomposeflagiaplikacja

fun filter(
    countriesInput: MutableList<Panstwo>,
    properties: MutableSet<String>): MutableList<Panstwo> {
    var countriesOutput: MutableList<Panstwo> = mutableListOf()
    for(country in countriesInput){
        if((country.properties).containsAll(properties)){
            countriesOutput.add(country)
        }
    }
    return countriesOutput
}