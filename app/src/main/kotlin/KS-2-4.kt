package org.example.app

fun main() {

    val krystalOreValue = 7
    val ironOreValue = 11
    val buff = 1.2

    println("Bonus krystal ore - ${"%.0f".format(krystalOreValue * buff - krystalOreValue)} ")
    println("Bonus iron ore - ${"%.0f".format(ironOreValue * buff - ironOreValue)} ")

}