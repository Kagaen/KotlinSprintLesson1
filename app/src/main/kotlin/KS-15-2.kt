fun main() {

    val temp1 = Temperature(20)
    val precipitation = PrecipitationAmount(100)
    val server = WeatherServer()
    server.sendStat(temp1)
    server.sendStat(precipitation)
}

abstract class WeatherStationStats {
    abstract val stat: Int
    abstract val statName: String
}

class Temperature(override val stat: Int) : WeatherStationStats() {
    override val statName = "Температура"

}

class PrecipitationAmount(override val stat: Int) : WeatherStationStats() {
    override val statName= "Осадки"
}

class WeatherServer : SendData {
    override fun sendStat(type: WeatherStationStats) {
        println("${type.statName}: ${type.stat}")
    }
}

interface SendData {
    fun sendStat(type: WeatherStationStats)
}
