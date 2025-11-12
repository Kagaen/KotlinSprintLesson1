fun main() {

    val goodWay = Liner()
    val unstoppable = Icebreaker().let { println(it.tonnage) }
    val magdalena = Cargo().also { print(it.speed) }

}

open class Liner(
    val speed: Int = 100,
    val capacity: Int = 1000,
    val tonnage: Int = 200,
)

class Icebreaker(
    speed: Int = 50,
    capacity: Int = 100,
    val breakIceAbility: Boolean = true,
) : Liner(speed, capacity, tonnage = 400)

class Cargo(
    speed: Int = 70,
    capacity: Int = 50,
) : Liner(speed, capacity, tonnage = 2000)