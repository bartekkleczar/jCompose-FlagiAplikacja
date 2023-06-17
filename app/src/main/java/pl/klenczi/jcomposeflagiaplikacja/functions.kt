package pl.klenczi.jcomposeflagiaplikacja

fun filter(
    countriesInput: MutableList<Panstwo>,
    countriesOutput: MutableList<Panstwo>,
    properties: Set<String>): MutableList<Panstwo> {
    for(country in countriesInput){
        if(country.properties.intersect(properties).isNotEmpty()){
            countriesOutput.add(country)
        }
    }
    return countriesOutput
}