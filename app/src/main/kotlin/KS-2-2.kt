package org.example

import java.util.Locale

fun main() {

    val employeeCount = 50
    val employeeSalary = 30000
    val internCount = 30
    val internSalary = 20000

    val employeeExpenses = employeeSalary * employeeCount
    val allExpenses = employeeExpenses + internSalary * internCount
    val averageSalary = allExpenses / (employeeCount + internCount)

    println(String.format(Locale.UK, "%,d", employeeExpenses))
    println(String.format(Locale.UK, "%,d", allExpenses))
    println(String.format(Locale.UK, "%,d", averageSalary))

}