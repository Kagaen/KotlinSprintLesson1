import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {

    val currentYear = LocalDate.now().year

    print("Enter your year of birth: ")
    val userYearOfBirth = readln().toInt()

    if (currentYear - userYearOfBirth >= AGE_OF_MAJORITY) {
        println("Show hidden content")
    } else {
        println("Back to main screen")
    }

}