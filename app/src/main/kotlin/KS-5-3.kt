fun main() {

    val firstNumber = (0..42).random()
    val secondNumber = (0..42).random()
    println("Try to guess the two numbers from 0 to 42 ")

    val userFirstNum = readln().toIntOrNull()
    val userSecondNum = readln().toIntOrNull()

    println(
        if ((userFirstNum == firstNumber && userSecondNum == secondNumber) ||
            (userFirstNum == secondNumber && userSecondNum == firstNumber)
        ) {
            "Congratulations! You've won the grand prize!"
        } else if ((userFirstNum != firstNumber) && (userSecondNum != secondNumber) &&
            (userFirstNum != secondNumber) && (userSecondNum != firstNumber)
        ) {
            "Bad Luck!"
        } else "You've won a consolation prize!"
    )

    println("$firstNumber, $secondNumber")

}