fun main() {

    val machineRoll = roll()
    println("Machine turn: $machineRoll")
    val humanRoll = roll()
    println("Human turn: $humanRoll")
    println(
        when {
            (machineRoll > humanRoll) -> "Machine win"
            (machineRoll < humanRoll) -> "Humanity win"
            else -> "Draw"
        }
    )

}

fun roll(): Int {
    return (1..6).random()
}