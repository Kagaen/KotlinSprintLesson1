const val PASSWORD_SIZE = 6

fun main() {

    var password = ""
    val charRange = 'a'..'z'
    val intRange = 0..9

    for (i in 1..PASSWORD_SIZE) {
        password += if (i % 2 == 1) {
            charRange.random()
        } else intRange.random()
    }
    println(password)

}