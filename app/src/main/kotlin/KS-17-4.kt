fun main() {

    val packet = Package(15_487, "Jing_Pang")
    packet.moveTo("Beijing")
    packet.moveTo("Novosibirsk")
    packet.moveTo("Moscow")
}

class Package(
    val number: Int,
    _location: String,
) {
    var moveCount = 0
    var location = _location
        set(value) {
            moveCount++
            println("$moveCount - $value")
        }

    fun moveTo(loc: String) {
        location = loc
    }
}