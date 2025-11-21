fun main() {

    val user = UserKS175()
    println(user.toString())
    user.changePassword("sadfr456")
    user.changeLogin("Kagaen")
    println(user.toString())

}

private class UserKS175 {
    var login = "user450078"
        set(value) {
            field = value
            println("Логин успешно изменён")
        }
    var password = "qwerty"
        get() = "*".repeat(field.length)
        set(value) = println("Вы не можете изменить пароль")

    fun changeLogin(newLogin: String) {
        login = newLogin
    }

    fun changePassword(newPassword: String) {
        password = newPassword
    }

    override fun toString() = "login - $login, password - $password"

}