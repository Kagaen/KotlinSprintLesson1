fun main() {

    val sunlight = true
    val openTent = true
    val airHumidity = 20
    val winter = true

    println(
        "Are the conditions favorable for legume growth now? - " +
                "${sunlight == true && openTent == true && airHumidity == 20 && winter == false}"
    )

}