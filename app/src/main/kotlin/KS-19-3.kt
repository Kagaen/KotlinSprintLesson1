import Action.CLEAR_ASTEROID
import Action.LAND
import Action.TAKE_OFF

enum class Action {
    TAKE_OFF,
    LAND,
    CLEAR_ASTEROID,
}

private class SpaceShip {
    fun execute(move: Action) = when (move) {
        TAKE_OFF -> println("Взлёт")
        LAND -> println("Посадка")// TODO добавить выбор места посадки
        CLEAR_ASTEROID -> TODO()
    }
}

fun main() {
    val ship = SpaceShip()
    ship.execute(TAKE_OFF)
    ship.execute(LAND)
    ship.execute(CLEAR_ASTEROID)
}