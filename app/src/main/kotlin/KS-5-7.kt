const val KM_LIMIT = 100

fun main() {

    print("Distance in km: ")
    val distance = readln().toDouble()
    print("Consumption per 100km: ")
    val consumption = readln().toDouble()
    print("Price per liter: ")
    val price = readln().toDouble()

    val literCount = (distance * consumption) / KM_LIMIT
    val cost = literCount * price

    println(
        "Cost of the travel: ${"%.2f".format(cost)}\n" +
                "Need liters: ${"%.2f".format(literCount)}"
    )

}