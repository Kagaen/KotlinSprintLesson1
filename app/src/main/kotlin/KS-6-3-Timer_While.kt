import kotlin.math.roundToLong

fun main() {

    val msInSec = 1000
    print("Set timer in sec: ")
    var counter = readln().toDouble()
    var timer = (counter * msInSec).roundToLong()

    while (counter > 0) {
        println("${"%.2f".format(counter--)} left")
        if (timer < msInSec) {
            Thread.sleep(timer)
        } else Thread.sleep(1000)
        timer -= 1000
    }
    println("Time out")

}