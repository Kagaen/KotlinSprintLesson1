fun main() {

    var wins = 0
    do {
        val result = game()
        if (result == "Humanity win") wins++
        println("$result\n" +
                "Do you want to roll the dice again? Enter “Yes” or “No”")
        val answer = readln().trim().lowercase()
        if (answer == "no") println("Your wins: $wins")
    } while (answer == "yes")

}

fun roll(): Int = (1..6).random()

fun game(): String {
    val machineRoll = roll()
    println("Machine dice: $machineRoll")
    val humanRoll = roll()
    println("Human dice: $humanRoll")
    return when {
        machineRoll > humanRoll -> "Machine win"
        machineRoll < humanRoll -> "Humanity win"
        else -> "Draw"
    }
}