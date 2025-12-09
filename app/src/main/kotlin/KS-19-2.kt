enum class CategoryKS192(val nameCategory: String) {
    CLOTHING("Одежда"),
    OFFICE_SUPPLIES("Канцтовары"),
    OTHER("Разное");

    fun getName() = when (this) {
        CLOTHING -> CLOTHING.nameCategory
        OFFICE_SUPPLIES -> OFFICE_SUPPLIES.nameCategory
        OTHER -> OTHER.nameCategory
    }
}

private class Product(
    val name: String,
    val id: Int,
    val category: CategoryKS192,
) {
    fun getInfo() = "Название: $name\nНомер: $id\nКатегория: ${category.getName()}\n"
}

fun main() {

    val listOfProducts = mutableListOf<Product>()

    listOfProducts.add(Product("Шарф", 1, CategoryKS192.CLOTHING))
    listOfProducts.add(Product("Ручка", 23, CategoryKS192.OFFICE_SUPPLIES))
    listOfProducts.add(Product("Игрушка", 45, CategoryKS192.OTHER))

    listOfProducts.forEach { println(it.getInfo()) }
}