const val TABLES = 13

fun main() {

    val tablesResToday = 9
    val tablesResTomorrow = 13
    println(
        "Availability of tables for today: ${tablesResToday < TABLES}\n" +
                "Availability of tables for today: ${tablesResTomorrow < TABLES}"
    )

}