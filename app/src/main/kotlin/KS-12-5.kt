import kotlin.random.Random

const val KELVIN_TO_CELSIUS = 273

class Weather05(_dayTemp: Int, _nightTemp: Int, _rainfall: Boolean) {
    var dayTemp = _dayTemp - KELVIN_TO_CELSIUS
    var nightTemp = _nightTemp - KELVIN_TO_CELSIUS
    var rainfall = _rainfall

    init {
        println(" $dayTemp   $nightTemp   $rainfall")
    }
}

fun Collection<Int>.average(): Double = (this.sum() / this.size).toDouble()

fun main() {

    val listOfDays = mutableListOf<Weather05>()

    println("         День Ночь Осадки")
    for (day in 1..30) {
        print("Сутки $day: ")
        val weather = Weather05(
            (284..311).random(),
            (269..283).random(),
            Random.nextBoolean()
        )
        listOfDays.add(weather)
    }

    val averageDayTemp = listOfDays.map { it.dayTemp }.average()
    val averageNightTemp = listOfDays.map { it.nightTemp }.average()
    val rainfallDayCount = listOfDays.count { it.rainfall }

    println("\nСредняя дневная температура: ${"%.1f".format(averageDayTemp)}\n" +
            "Средняя ночная температура: ${"%.1f".format(averageNightTemp)}\n" +
            "Дней с осадками: $rainfallDayCount")

}