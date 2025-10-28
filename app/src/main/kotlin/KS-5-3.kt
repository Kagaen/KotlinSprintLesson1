import kotlin.random.Random

fun main() {

    val firstLotteryNumber = Random.nextInt(0, 42)
    val secondLotteryNumber = Random.nextInt(0, 42)
    println("Try to guess the numbers from 0 to 42 ($firstLotteryNumber, $secondLotteryNumber)")

    val userFirstNumber = readln().toIntOrNull()
    val userSecondNumber = readln().toIntOrNull()

    if (userFirstNumber == firstLotteryNumber) {
        if (userSecondNumber == secondLotteryNumber) {
            println("Congratulations! You've won the grand prize!")
        } else {
            println("You've won a consolation prize!")
        }
    } else {
        if (userFirstNumber == secondLotteryNumber) {
            if (userSecondNumber == firstLotteryNumber) {
                println("Congratulations! You've won the grand prize!")
            } else {
                println("You've won a consolation prize!")
            }
        } else {
            if (userSecondNumber == firstLotteryNumber) {
                println("You've won a consolation prize!")
            } else {
                println("Bad Luck!")
            }
        }
    }
}