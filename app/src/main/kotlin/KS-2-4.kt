package org.example.app

fun main() {

    val krystalOreValue = 7.0
    val ironOreValue = 11.0
    val buff = 20

    println("Bonus krystal ore - ${(krystalOreValue / 100 * buff).toInt()}")
    println("Bonus iron ore - ${(ironOreValue / 100 * buff).toInt()}")

}