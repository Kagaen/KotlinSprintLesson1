abstract class Dice {
    open fun roll() = ""
}

private class D4(
    val faceNumber: Short = 4,
) : Dice() {
    override fun roll() = "Результат броска кубика: ${(1..faceNumber).random()}"
}

private class D6(
    val faceNumber: Short = 6,
) : Dice() {
    override fun roll() = "Результат броска шестигранной кости: ${(1..faceNumber).random()}"
}

private class D8(
    val faceNumber: Short = 8,
) : Dice() {
    override fun roll() = "Результат броска восьмигранника: ${(1..faceNumber).random()}"
}

fun main() {

    val dice1: Dice = D4()
    val dice2: Dice = D6()
    val dice3: Dice = D8()
    val listOfDice: List<Dice> = listOf(dice1, dice2, dice3)
    listOfDice.forEach { println(it.roll()) }
}