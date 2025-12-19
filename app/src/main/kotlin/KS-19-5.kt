enum class Gender(val designation: String) {
    MAN("муж"),
    WOMAN("жен"),
}

private const val ERROR_FORMAT = "Неверный формат, попробуйте снова"

private class Person(
    val name: String,
    val gender: Gender,
)

private fun readGender(input: String): Gender? {

    val gender = Gender.entries.firstOrNull { it.designation.equals(input, ignoreCase = true) }
    if (gender == null) {
        println(ERROR_FORMAT)
        return null
    }
    return gender

}

fun main() {

    val fileCabinet = mutableListOf<Person>()
    println("Формат ввода: [Имя], [пол: \"${Gender.entries.joinToString("\" или \"") { it.designation }}\"]")

    while (fileCabinet.size < 5) {
        val userInput = readln()
        val input = userInput.split(",")
        if (input.size == 2) {
            val name = input[0].trim()
            if (name == "") {
                println(ERROR_FORMAT)
                continue
            }
            val gender = readGender(input[1].trim()) ?: continue
            fileCabinet.add(Person(name, gender))
            println("$name добавлен в картотеку")
        } else println(ERROR_FORMAT)
    }
    println()
    fileCabinet.forEach { println("Имя: ${it.name}; Пол: ${it.gender.designation}.") }

}