class Weather04 (_dayTemp: Int, _nightTemp: Int, _rainfall: Boolean) {
    var dayTemp = _dayTemp
    var nightTemp = _nightTemp
    var rainfall = _rainfall
    val toCelsius = 273
    init {
        println("${dayTemp - toCelsius}\n${nightTemp - toCelsius}\n$rainfall")
    }

}

fun main() {

    val day1 = Weather04(293, 253, false)

}