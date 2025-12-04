abstract class Pet(val name: String) {
    open val action = ""
    fun feed() = "$name -> $action"
}

private class Dog(name: String) : Pet(name) {
    override val action = "Грызёт кость"
}

private class Cat(name: String) : Pet(name) {
    override val action = "Ест рыбу"
}

private class Fox(name: String) : Pet(name) {
    override val action = "Жуёт ягоды"
}

fun main() {

    val dog = Dog("Бобик")
    val fox = Fox("Алиса")
    val cat = Cat("Вася")
    val arrayOfPets: Array<Pet> = arrayOf(dog, cat, fox)
    arrayOfPets.forEach { println(it.feed()) }
}