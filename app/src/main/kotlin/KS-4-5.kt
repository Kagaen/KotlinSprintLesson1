const val DAMAGE = false
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_PROVISION_CRATES = 50
const val GOOD_WEATHER = true

fun main() {

    print("Damage: ")
    val damage = readln().toBoolean()
    print("Number of crew: ")
    val crew = readln().toInt()
    print("Crates of provisions: ")
    val provisionBox = readln().toInt()
    print("Weather is good: ")
    val goodWeather = readln().toBoolean()

    val readiness =
        ((damage == DAMAGE) && (crew in MIN_CREW..MAX_CREW) && (provisionBox > MIN_PROVISION_CRATES))
                || ((damage == !DAMAGE) && (crew == MAX_CREW) && (provisionBox >= MIN_PROVISION_CRATES) && (goodWeather == GOOD_WEATHER))

    println("Readiness of the ship: $readiness")

}