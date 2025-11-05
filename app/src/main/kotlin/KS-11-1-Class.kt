fun main() {

    val user1 = User(
        id = 0,
        login = "ivan",
        password = "123va",
        mail = "ivan32@mail.ru"
    )
    val user2 = User(
        id = 1,
        login = "igor",
        password = "ad123",
        mail = "igor454@gmail.ru"
    )
    println("${user1.id}\n${user1.login}\n${user1.password}\n${user1.mail}\n")
    println("${user2.id}\n${user2.login}\n${user2.password}\n${user2.mail}")

}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
) {

}