private enum class Fish {
    Guppy,
    Angelfish,
    Goldfish,
    SiameseFightingFish
}

fun main() {
    println(Fish.entries.joinToString())
}