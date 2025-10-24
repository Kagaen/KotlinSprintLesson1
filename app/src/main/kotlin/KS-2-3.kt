package org.example.app

const val MIN_IN_HOUR = 60

fun main() {

    val departureHour = 9
    val departureMin = 39
    val roadMin = 457

    val arrival = departureHour * MIN_IN_HOUR + departureMin + roadMin
    val arrivalMin = arrival % MIN_IN_HOUR
    val arrivalHour = arrival / MIN_IN_HOUR

    println("Arrival time - ${"%02d".format(arrivalHour)}:${"%02d".format(arrivalMin)}")

}