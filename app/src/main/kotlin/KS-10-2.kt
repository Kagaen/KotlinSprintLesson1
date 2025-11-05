fun main() {

    do {
        print("Login: ")
        val validLogin = validate(readln())
        print("Password: ")
        val validPassword = validate(readln())
        if (!validLogin || !validPassword) println("Login or password is too short\n")
        else println("good")
    } while (!validLogin || !validPassword)

}

fun validate(str: String): Boolean = (str.length >= 4)

