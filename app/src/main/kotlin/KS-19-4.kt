enum class Ammunition(
    val color: String,
    val damage: Int
) {
    BLUE("синий", 5),
    GREEN("зелёный", 10),
    RED("красный", 20)
}

private class Tank {
    var cartridge: Ammunition? = null
    fun changeAmmunition(ammunition: Ammunition) {
        cartridge = ammunition
        println("Заряжен ${cartridge!!.color} снаряд")
    }

    fun shot() {
        println(cartridge?.let { "Выстрел на ${it.damage} урона" } ?: "Пушка не заряжена")
        cartridge = null
    }
}

fun main() {
    val tank = Tank()
    tank.changeAmmunition(Ammunition.BLUE)
    tank.shot()
    tank.changeAmmunition(Ammunition.GREEN)
    tank.shot()
    tank.shot()
    tank.changeAmmunition(Ammunition.RED)
    tank.shot()
}

