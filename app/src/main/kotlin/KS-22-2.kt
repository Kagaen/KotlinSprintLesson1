fun main() {
    val regularBook1 = RegularBook222(
        title = "Title",
        author = "simple Author",
    )

    val dataBook1 = DataBook222(
        "Title",
        "simple Author",
    )
    println(regularBook1) // что-то вроде адреса в памяти
    println(dataBook1) // в "data class" встроенная переопределённая функция "toString()"

}

class RegularBook222(
    val title: String,
    val author: String,
)

data class DataBook222(
    val title: String,
    val author: String,
)