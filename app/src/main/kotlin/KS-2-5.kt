package org.example.app

import kotlin.math.pow

fun main() {

    val deposit = 70000.0
    val perceptionRate = 16.7
    val depositPeriod = 20.0

    println("%.3f".format((deposit * (1 + perceptionRate / 100).pow(depositPeriod))))

}