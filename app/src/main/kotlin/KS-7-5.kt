const val MIN_SIZE = 6

fun main() {

    val password = mutableListOf<Char>()
    val digits = ('0'..'9')
    val loverCaseChars = ('a'..'z')
    val upperCaseChars = ('A'..'Z')
    val chars = digits + loverCaseChars + upperCaseChars
    var length: Int

    do {
        print("Password length at least 6 characters: ")
        length = readln().toInt()
    } while (length < MIN_SIZE)

    password.add(digits.random())
    password.add(loverCaseChars.random())
    password.add(upperCaseChars.random())

    for (i in 3 until length) {
        password.add(chars.random())
    }

    password.shuffle()
    println(password.joinToString(""))

}
