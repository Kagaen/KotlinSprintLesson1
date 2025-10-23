package org.example.app

fun main(){

    val secondsInSpace = 6480
    val secInMin = 60
    val secInHour = 3600
    val hour = secondsInSpace / secInHour
    val minutes = secondsInSpace % secInHour / secInMin
    val seconds = secondsInSpace % secInHour % secInMin
    val timeInSpace = String.format("%02d:%02d:%02d", hour, minutes, seconds)

    println("Time in space - $timeInSpace")

}