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
        ((damage == false) && (crew in (55..70)) && (provisionBox > 50)) || ((damage == true) && (crew == 70) && (provisionBox >= 50) && (goodWeather == true))

    println("Readiness of the ship: $readiness")

}