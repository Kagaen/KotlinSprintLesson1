private class Order(
    val orderNumber: Int,
) {
    fun orderInfo(product: String) {
        println("Заказан товар: $product")
    }

    fun orderInfo(product: List<String>) {
        println("Заказан товары: ${product.joinToString(", ")}")
    }
}

fun main() {

    val order1 = Order(1515)
    order1.orderInfo(listOf("Шампунь", "Щётка", "Мыло"))

    val order2 = Order(123)
    order2.orderInfo("Тапки")

}