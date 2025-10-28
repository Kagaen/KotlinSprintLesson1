import kotlin.random.Random

fun main() {

    val a = Random.nextInt(1, 10)
    val b = Random.nextInt(1, 10)

    print("Enter the result: $a + $b = ")
    val userRes = readln().toInt()

    if ( a + b == userRes) {
        println("Welcome")
    } else {
        println("Access is denied")
    }

}