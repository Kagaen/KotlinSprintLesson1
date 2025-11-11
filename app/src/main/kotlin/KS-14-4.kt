fun main() {

    val planet1 = Planet(
        name = "TheBigGasGiant",
        hasAtmosphere = true,
        suitableForLanding = false,
    )
    val satellite1 = planet1.Satellite(
        name = "Pandora",
        hasAtmosphere = true,
        suitableForLanding = true,
    )
    val satellite2 = planet1.Satellite(
        name = "SmallColdRock",
        hasAtmosphere = false,
        suitableForLanding = false,
    )
    println("${planet1.name}: "+ planet1.listOfSatellite.joinToString(", ") { it.name })

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

    inner class Satellite(
        name: String,
        hasAtmosphere: Boolean,
        suitableForLanding: Boolean,
    ) : SpaceBody(name, hasAtmosphere, suitableForLanding) {
        init {
            listOfSatellite.add(this)
        }
    }
}

