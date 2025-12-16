enum class Gender(val designation: String) {
    MAN("муж"),
    WOMAN("жен"),
}

private class Person(
    val name: String,
    val gender: Gender,
)

private fun readGender(input: String): Gender? {

    val gender = Gender.entries.find { it.designation == input }
    if (gender == null) {
        println("Неверный формат, попробуйте снова")
        return null
    }
    return gender

}

fun main() {

    val fileCabinet = mutableListOf<Person>()
    println("Формат ввода: [Имя], [пол: \"${Gender.entries.joinToString("\" или \"") { it.designation }}\"]")

    while (fileCabinet.size < 5) {
        val userInput = readlnOrNull()
        if (userInput == null) {
            println("Неверный формат, попробуйте снова")
            continue
        } else if (!userInput.contains(',')) {
            println("Неверный формат, попробуйте снова")
            continue
        }
        val input = userInput.split(",")
        val name = input[0].trim()
        val gender = readGender(input[1].trim()) ?: continue
        fileCabinet.add(Person(name, gender))
        println("$name добавлен в картотеку")
    }
    println()
    fileCabinet.forEach { println("Имя: ${it.name}; Пол: ${it.gender.designation}.") }

}