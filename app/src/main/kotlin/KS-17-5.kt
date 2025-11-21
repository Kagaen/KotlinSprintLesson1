fun main() {

    val user = UserKS175("user1234578", "qwert")
    println(user.toString())
    user.login = "Kagaen"
    user.password = "qrws24f3w"
    println(user.toString())

}

private class UserKS175(
    login: String,
    password: String
) {
    var login = login
        set(value) {
            field = value
            println("Логин успешно изменён")
        }
    var password = password
        get() = "*".repeat(field.length)
        set(value) = println("Вы не можете изменить пароль")

    override fun toString() = "login - $login, password - $password"

}