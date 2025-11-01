fun main() {

    print("Create a username: ")
    val userLogin = readln().trim()
    print("Create a password: ")
    val userPassword = readln().trim()

    do {
        print("Enter your login: ")
        val compare1 = readln().trim() == userLogin
        print("Enter your password: ")
        val compare2 = readln().trim() == userPassword
    } while (compare1 != compare2)

    println("Welcome")

}