fun main() {

    val player1 = PlayerTask213("Hero", 50, 30)
    println(player1.isHealthy())
    val player2 = PlayerTask213("Oreh", 50, 50)
    println(player2.isHealthy())
}

class PlayerTask213(
    val name: String,
    val maxHealth: Int,
    var currentHealth: Int,
) {
    init {
        println("$name's current health is $currentHealth/$maxHealth")
    }
}

fun PlayerTask213.isHealthy(): Boolean = currentHealth == maxHealth