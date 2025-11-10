data class Contact1(
    var number: Long?,
    var name: String?,
    var company: String? = null,
)

class PhoneBook() {
    val phoneBook = mutableListOf<Contact1>()

    fun newContact(): Contact1 {
        print("Номер: ")
        val number = readln().toLongOrNull()
        print("Имя: ")
        val name: String = readln()
        print("Компания: ")
        val company = readln()
        return Contact1(number, name, company)
    }

    fun addToPhoneBook() {
        val contact = newContact()
        if (contact.number == null) {
            println("Номер не может быть пустым\n")
            return
        }
        phoneBook.add(contact)
        println("Контакт добавлен\n")
    }

    fun writeContacts() {
        val list = phoneBook.joinToString("\n") { "${it.number}, ${it.name}, ${it.company ?: "не указано"}" }
        println(list)
    }
}

fun main() {
    val phoneBook = PhoneBook()
    phoneBook.addToPhoneBook()
    phoneBook.addToPhoneBook()
    phoneBook.addToPhoneBook()
    println()
    phoneBook.writeContacts()
}