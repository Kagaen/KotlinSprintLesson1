fun main() {

    val number1 = (0..10).random()
    val number2 = (0..10).random()

    print("Enter the result: $number1 + $number2 = ")
    val userRes = readln().toInt()

    if (number1 + number2 == userRes) {
        println("Welcome")
    } else {
        println("Access is denied")
    }

}