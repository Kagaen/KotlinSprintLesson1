fun main() {

    print("Введите строку: ")
    println(readln().vowelCount())
}

fun String.vowelCount(): Int {

    val vowelsEng = "aeiou"
    val vowelsRus = "аеёиоуыэюя"
    val vowels = vowelsEng + vowelsEng.uppercase() +
            vowelsRus + vowelsRus.uppercase()

    return this.count { it in vowels }
}