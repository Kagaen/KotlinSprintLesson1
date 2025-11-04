const val MIN_SIZE = 6

fun main() {

    val password = mutableListOf<Char>()
    val chars = ('0'..'9') + ('a'..'z') + ('A'..'Z')
    var length: Int

    do {
        print("Password length at least 6 characters: ")
        length = readln().toInt()
    } while (length < MIN_SIZE)

    password.add(('0'..'9').random())
    password.add(('a'..'z').random())
    password.add(('A'..'Z').random())

    for (i in 3 until length) {
        password.add(chars.random())
    }

    password.shuffle()
    println(password.joinToString(""))

}
