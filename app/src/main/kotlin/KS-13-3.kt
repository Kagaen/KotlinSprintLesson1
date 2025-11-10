class Contact(
    var number: Long,
    var name: String,
    var company: String? = null,
)

fun main() {

    val listOfContacts: List<Contact> = listOf(
        Contact(89451674589, "Олег"),
        Contact(84621264789, "Александр", "null"),
        Contact(89645621874, "Сигизмунд"),
        Contact(89124826545, "Изя", "Кашерные дела"),
        Contact(89324957825, "Владимир", "Администрация")
    )
    val listOfCompany = listOfContacts.mapNotNull { list -> list.company }
    println(listOfCompany)
}