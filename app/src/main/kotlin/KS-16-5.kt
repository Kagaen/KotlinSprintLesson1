fun main() {

    val player = Player("Персонаж", 50, 12)
    player.takeDamage(40)
    player.heal(20)
    player.takeDamage(40)
    player.heal(20)
    player.takeDamage(40)

}

class Player(
    private val name: String,
    private var health: Int,
    private var power: Int,
) {
    private var dead = false

    fun takeDamage(damage: Int) {
        if (!dead) {
            health -= damage
            if (health <= 0) {
                println("$name получил $damage урона, Здоровье = 0")
                death()
            } else println("$name получил $damage урона, Здоровье = $health")
        } else println("Хватит")
    }

    fun heal(heal: Int) {
        if (!dead) {
            health += heal
            println("$name восстанавливает $heal здоровья, Здоровье = $health")
        } else println("$name мёртв, лечение невозможно")
    }

    private fun death() {
        health = 0
        power = 0
        dead = true
        println("""$name погиб
            |Здоровье = $health
            |Сила = $power
        """.trimMargin())
    }
}