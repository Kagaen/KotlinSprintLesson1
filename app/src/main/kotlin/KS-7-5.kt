fun main() {

    var password = ""
    var length: Int
    do {
        print("Password length at least 6 characters: ")
        length = readln().toInt()
    } while (length < 6)

    for (i in 1..length) {
        val checker = (0..2).random()
        when (checker) {
            0 -> password += (0..9).random()
            1 -> password += ('a'..'z').random()
            2 -> password += ('A'..'Z').random()
        }
    }
    println(password)

}
