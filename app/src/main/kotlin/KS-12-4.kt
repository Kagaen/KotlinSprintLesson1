class Weather04 (_dayTemp: Int, _nightTemp: Int, _rainfall: Boolean) {
    val toCelsius = 273
    var dayTemp = _dayTemp - toCelsius
    var nightTemp = _nightTemp - toCelsius
    var rainfall = _rainfall
    init {
        println("$dayTemp\n$nightTemp\n$rainfall")
    }

}

fun main() {

    val day1 = Weather04(293, 253, false)

}