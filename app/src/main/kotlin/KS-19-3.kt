enum class Action {
    TAKE_OFF,
    LAND,
    CLEAR_ASTEROID;

    fun action(): String = when (this) {
        TAKE_OFF -> "Взлёт"
        LAND -> "Посадка"// TODO добавить выбор места посадки
        CLEAR_ASTEROID -> TODO()
    }
}

private class SpaceShip {
    fun execute(move: Action) = println(move.action())
}

fun main() {
    val ship = SpaceShip()
    ship.execute(Action.TAKE_OFF)
    ship.execute(Action.LAND)
    ship.execute(Action.CLEAR_ASTEROID)
}