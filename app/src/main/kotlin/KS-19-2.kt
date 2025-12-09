private enum class Goods {
    Clothes {
        override fun getName() = this.name
    },
    OfficeSupplies {
        override fun getName() = this.name
    },
    Others {
        override fun getName() = this.name
    };

    abstract fun getName(): String
}

private class Product(
    val name: String,
    val id: Int,
    val category: Goods,
) {
    init {
        listOfProducts.add(this)
    }

    fun getInfo() = println("Название: $name\nНомер: $id\nТип: ${category.getName()}\n")
}

private val listOfProducts = mutableListOf<Product>()

fun main() {

    Product("Scarf", 1, Goods.Clothes)
    Product("Pen", 23, Goods.OfficeSupplies)
    Product("Toy", 45, Goods.Others)
    listOfProducts.forEach { it.getInfo() }
}