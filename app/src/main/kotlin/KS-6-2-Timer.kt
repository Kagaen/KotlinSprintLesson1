import kotlin.math.roundToLong

fun main() {

    val rounding = 1000
    print("Set timer in sec: ")
    val timer = readln().format("%.2f").toDouble() * rounding
    Thread.sleep(timer.roundToLong())
    println("Passed ${"%.2f".format(timer / rounding)} seconds")

}