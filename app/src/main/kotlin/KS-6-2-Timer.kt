import kotlin.math.roundToLong

fun main() {

    val rounding = 1000

    print("Set timer in sec: ")
    val counter = readln().toDouble()

    val timer = (counter * rounding).roundToLong()
    Thread.sleep(timer)
    println("Passed ${"%.2f".format(counter)} seconds")

}