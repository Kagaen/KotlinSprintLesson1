fun main() {

    var password = ""
    for (i in 1..6) {
        password += if (i % 2 == 1) {
            ('a'..'z').random()
        } else (0..9).random()
    }
    println(password)

}