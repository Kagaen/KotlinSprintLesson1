fun main() {

    val planet1 = Planet(
        name = "TheBigGasGiant",
        hasAtmosphere = true,
        suitableForLanding = false,
    )
    val satellite1 = Satellite(
        name = "Pandora",
        hasAtmosphere = true,
        suitableForLanding = true,
        planet1,
    )
    val satellite2 = Satellite(
        name = "SmallColdRock",
        hasAtmosphere = false,
        suitableForLanding = false,
        planet1,
    )
    println("${planet1.name}: " + planet1.listOfSatellite.joinToString(", ") { it.name })

}

abstract class SpaceBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val suitableForLanding: Boolean,
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    suitableForLanding: Boolean,
) : SpaceBody(name, hasAtmosphere, suitableForLanding) {
    val listOfSatellite: MutableList<Satellite> = mutableListOf()
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    suitableForLanding: Boolean,
    planet: Planet,
) : SpaceBody(name, hasAtmosphere, suitableForLanding) {
    init {
        planet.listOfSatellite.add(this)
    }
}
