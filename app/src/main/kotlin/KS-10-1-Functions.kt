fun main() {

    val machineRoll = rolldice()
    println("Machine turn: $machineRoll")
    val humanRoll = rolldice()
    println("Human turn: $humanRoll")
    println(
        when {
            (machineRoll > humanRoll) -> "Machine win"
            (machineRoll < humanRoll) -> "Humanity win"
            else -> "Draw"
        }
    )

}

fun rolldice(): Int {
    return (1..6).random()
}