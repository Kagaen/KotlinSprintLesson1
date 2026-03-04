fun main() {
    val regularBook1 = RegularBook(
        title = "Title",
        author = "simple Author",
    )
    val regularBook2 = RegularBook(
        "Title",
        "simple Author",
    )
    val dataBook1 = DataBook(
        "Title",
        "simple Author",
    )
    val dataBook2 = DataBook(
        "Title",
        "simple Author",
    )
    println(regularBook1 == regularBook2) // false
    println(regularBook1 == dataBook1) // false
    println(regularBook2 == dataBook1) // везде false, т.к. сраниваются ссылки на объекты в памяти
    println(dataBook1 == dataBook2) // true, т.к. сравниваются одинаковые поля экзепляров одного и того же класса

}

class RegularBook(
    val title: String,
    val author: String,
)

data class DataBook(
    val title: String,
    val author: String,
)
