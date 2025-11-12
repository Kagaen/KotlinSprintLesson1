fun main() {

    val goodWay = Liner1()
    val unstoppable = Icebreaker1()
    val magdalena = Cargo1()

    goodWay.showShipProp()
    goodWay.gangway()
    println()
    unstoppable.showShipProp()
    unstoppable.openAftGate()
    println()
    magdalena.showShipProp()
    magdalena.craneActivate()

}

open class Ship(
    val speed: Int,
    val capacity: Int,
    val tonnage: Int,
    val breakIceAbility: Boolean = false,
) {
    fun showShipProp() {
        println("$speed\n$capacity\n$tonnage\n$breakIceAbility")
    }
}

class Liner1(
    speed: Int = 100,
    capacity: Int = 1000,
): Ship(speed, capacity, tonnage = 200,) {
    fun gangway() {
        println("Выдвигаем трап со шкафута")
    }

}

class Icebreaker1(
    speed: Int = 50,
    capacity: Int = 100,
    breakIceAbility: Boolean = true,
) : Ship(speed, capacity, tonnage = 400, breakIceAbility) {
    fun openAftGate() {
        println("Кормовые ворота открыты")
    }

}

class Cargo1(
    speed: Int = 70,
    capacity: Int = 50,
) : Ship(speed, capacity, tonnage = 2000) {
    fun craneActivate() {
        println("Погрузочный кран активирован")
    }

}