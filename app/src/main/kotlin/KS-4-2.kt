const val AVER_BOTTOM_WEIGHT = 35
const val AVER_TOP_WEIGHT = 100
const val AVER_VOLUME = 100

fun main() {

    var weight = 20
    var volume = 80
    println(
        "The cargo with a weight of $weight kg and a volume of $volume liters corresponds to the 'Average' category:" +
                " ${(weight > AVER_BOTTOM_WEIGHT) && (weight <= AVER_TOP_WEIGHT) && (volume < AVER_VOLUME)}"
    )

    weight = 50
    volume = 100
    println(
        "The cargo with a weight of $weight kg and a volume of $volume liters corresponds to the 'Average' category:" +
                " ${(weight > AVER_BOTTOM_WEIGHT) && (weight <= AVER_TOP_WEIGHT) && (volume < AVER_VOLUME)}"
    )

}