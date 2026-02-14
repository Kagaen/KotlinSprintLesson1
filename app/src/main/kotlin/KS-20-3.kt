fun main() {

    val player1 = PlayerTask3("Seeker", true)
    val player2 = PlayerTask3("Searcher", false)

    val openTheDoor: (PlayerTask3) -> String = { player: PlayerTask3 ->
        if (player.keyPresence) "${player.name} open the door"
        else "${player.name} can't open the door"
    }
    println(openTheDoor(player1))
    println(openTheDoor(player2))

}

class PlayerTask3(
    val name: String,
    val keyPresence: Boolean,
)