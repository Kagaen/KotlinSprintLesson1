fun main() {
    game()
}

fun roll(): Int = (1..6).random()

fun game() {
    var humanWins = 0
    do {
        val machineRoll = roll()
        println("Machine dice: $machineRoll")
        val humanRoll = roll()
        println("Human dice: $humanRoll")
        when {
            (machineRoll > humanRoll) -> println("Machine win")
            (machineRoll < humanRoll) -> {
                println("Humanity win")
                humanWins++
            }

            else -> println("Draw")
        }
        println("Do you want to roll the dice again? Enter “Yes” or “No”")
        val answer = readln().trim()
        if (answer.equals("no", ignoreCase = true)) println("Your wins: $humanWins")
    } while (answer.equals("yes", ignoreCase = true))
}

