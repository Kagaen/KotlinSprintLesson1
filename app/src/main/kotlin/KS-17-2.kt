private class ShipKS172(
    _name: String,
    val speed: Int,
    val port: String,
) {
    var name = _name
        set(value) {
            if (value != name) println("Нельзя менять имя корабля!")
        }

    override fun toString(): String {
        return "name = $name, speed = $speed, port = $port"
    }
}

fun main() {
    val ship = ShipKS172("Ship", 15, "Port")
    println(ship.toString())
    ship.name = readln()
    println(ship.toString())
}