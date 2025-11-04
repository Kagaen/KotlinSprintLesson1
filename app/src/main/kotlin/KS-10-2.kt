fun main() {

    do {
        print("Login: ")
        val validLogin = validation(readln())
        print("Password: ")
        val validPassword = validation(readln())
        if (!validLogin || !validPassword) println("Login or password is too short\n")
        else println("good")
    } while (!validLogin || !validPassword)

}

fun validation(str: String): Boolean = (str.length >= 4)

