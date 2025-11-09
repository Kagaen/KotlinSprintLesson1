class Weather01 constructor(
    var dayTemp: Int,
    var nightTemp: Int,
    var rainfall: Boolean,
) {

    fun showWeather() {
        println("$dayTemp\n$nightTemp\n$rainfall")
    }
}

fun main() {

    val day1 = Weather01(20,-5,true)
    day1.showWeather()

}