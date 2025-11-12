data class Contact2(
    var number: Long?,
    var name: String?,
    var company: String? = null,
) {
    fun newContact(): Contact2 {
        print("Номер: ")
        try {
            val number = readln().toLong()
        } catch (e: Exception) {
            println("Ошибка: ${e::class.simpleName}")
        }
        print("Имя: ")
        val name: String = readln()
        print("Компания: ")
        val company = readln()
        return Contact2(number, name, company)
    }
}

fun main() {

    val contact = Contact2(null, null, null)
    contact.newContact()

}