
const val SEC_IN_MIN = 60
const val SEC_IN_HOUR = 3600

fun main(){

    val secondsInSpace = 6480
    val hour = secondsInSpace / SEC_IN_HOUR
    val minutes = secondsInSpace % SEC_IN_HOUR / SEC_IN_MIN
    val seconds = secondsInSpace % SEC_IN_HOUR % SEC_IN_MIN
    val timeInSpace = String.format("%02d:%02d:%02d", hour, minutes, seconds)

    println("Time in space - $timeInSpace")

}