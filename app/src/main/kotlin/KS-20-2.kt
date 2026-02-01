fun main() {

    val healthPotionPower = 60
    val useHealthPotion: (PlayerTask2) -> Unit = { player:PlayerTask2 ->
        println("${player.name} use health potion and restore $healthPotionPower HP")
        player.currentHealth += healthPotionPower
        if (player.currentHealth > player.maxHealth) player.currentHealth = player.maxHealth
    }

    val player = PlayerTask2("Hero", 50, 20)
    useHealthPotion(player)
    println("${player.name} has ${player.currentHealth} HP")

}

class PlayerTask2(
    val name: String,
    val maxHealth: Int,
    var currentHealth: Int,
) {
    init {
        println("$name's current health is $currentHealth/$maxHealth")
    }
}