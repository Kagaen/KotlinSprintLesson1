package org.example.app

fun main(){

    val secondsInSpace = 6480
    val hour = secondsInSpace/3600
    val minutes = secondsInSpace%3600/60
    val seconds = secondsInSpace%3600%60
    val timeInSpace = String.format("%02d:%02d:%02d", hour, minutes, seconds)

    println("Time in space - $timeInSpace")

}