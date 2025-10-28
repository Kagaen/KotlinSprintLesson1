const val SUNLIGHT = true
const val OPEN_TENT = true
const val AIR_HUMIDITY = 20
const val WINTER = false

fun main() {

    val sunlight = true
    val openTent = true
    val airHumidity = 20
    val winter = true

    println(
        "Are the conditions favorable for legume growth now? - " +
                "${sunlight == SUNLIGHT && openTent == OPEN_TENT && airHumidity == AIR_HUMIDITY && winter == WINTER}"
    )

}