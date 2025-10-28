fun main() {

    val listOfNum = listOf((0..42).random(), (0..42).random(), (0..42).random())

    println("Try to guess the three mysterious numbers")
    val userListOfNum = listOf(readln().toIntOrNull(), readln().toIntOrNull(), readln().toIntOrNull())

    val result = userListOfNum.intersect(listOfNum).size
    println(
        when (result) {
            3 -> "Congratulations! You've won the grand prize!"
            2 -> "You've won a common prize!"
            1 -> "You've won a consolation prize!"
            else -> "Bad Luck!"
        }
    )
    println("Mysterious numbers: $listOfNum")

}