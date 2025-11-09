class Weather constructor() {
    var dayTemp = 35
    var nightTemp = -10
    var rainfall = false

    fun showWeather (){
        println("$dayTemp\n$nightTemp\n$rainfall")
    }
}

fun main() {

    val day1 = Weather()
    day1.showWeather()
    day1.dayTemp = 20
    day1.nightTemp = -5
    day1.rainfall = true
    day1.showWeather()

}