const val KS_LOGIN = "star_lord"
const val KS_PASSWORD = "qwertY"
const val TOKEN_SIZE = 32

fun main() {
    print("Логин: ")
    val login = readln().trim().lowercase()
    print("Пароль: ")
    val password = readln()
    println(stash(auth(login, password)))
}

fun tokenGen(): String {
    val digits = ('0'..'9')
    val lowerCaseChars = ('a'..'z')
    val upperCaseChars = ('A'..'Z')
    val chars = digits + lowerCaseChars + upperCaseChars
    return (1..TOKEN_SIZE).map { chars.random() }.joinToString("")
}

fun auth(log: String?, pas: String?): String? {
    return if ((log == KS_LOGIN) && (pas == KS_PASSWORD)) tokenGen()
    else null
}

fun stash(token: String?): String {
    val cart = "SOMETHING"
    return if (token != null) cart
    else "Неправильный логин или пароль"
}