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
    magdalena.gangway()

}

open class Liner1(
    val speed: Int = 100,
    val capacity: Int = 1000,
    val tonnage: Int = 200,
    val breakIceAbility: Boolean = false,
) {
    fun showShipProp() {
        println("$speed\n$capacity\n$tonnage\n$breakIceAbility")
    }

    fun gangway() {
        println("Выдвигаем трап со шкафута")
    }

}

class Icebreaker1(
    speed: Int = 50,
    capacity: Int = 100,
    breakIceAbility: Boolean = true,
) : Liner1(speed, capacity, tonnage = 400, breakIceAbility) {
    fun openAftGate() {
        println("Кормовые ворота открыты")
    }

}

class Cargo1(
    speed: Int = 70,
    capacity: Int = 50,
) : Liner1(speed, capacity, tonnage = 2000) {
    fun craneActivate() {
        println("Погрузочный кран активирован")
    }

}