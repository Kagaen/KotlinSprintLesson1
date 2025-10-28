const val LOGIN = "Zaphod"
const val PAROL = "PanGalactic"

fun main () {

    println("Yeah, go ahead, please enter your details...")
    val login = readln()

    if (login == LOGIN) {
        println("Password...")
        val password = readln()
        if (password == PAROL) {
            println("Welcome aboard the ship \"Heart of Gold\"")
        } else {
            println("You don't seem to want to be here either...")
        }
    } else println("Unknown user, would you like to register?")

}