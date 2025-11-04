fun main() {

    print("Password length: ")
    println(passwordGen(readln().toInt()))

}

fun passwordGen(length: Int): String {

    val password = mutableListOf<Char>()
    val digits = ('0'..'9')
    val intRange = (0x20..0x2F)
    val specChar = intRange.map { it.toChar() }
    val chars = digits + specChar

    for (i in 0 until length) password.add(chars.random())

    password.shuffle()
    return password.joinToString("")
}