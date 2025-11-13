fun main() {

    val user1 = UserKS153(1, "Potato")
    val admin1 = AdminKS153(2, "KS")
    user1.sendMessage()
    admin1.sendMessage()
    admin1.deleteMessage()
    admin1.deleteUser()
}

abstract class UsersAndAdmins() {
    abstract val id: Int
    abstract val name: String
}

class AdminKS153(
    override val id: Int,
    override val name: String,
) : UsersAndAdmins(), UserMoves, AdminMoves {

    override fun sendMessage() {
        println("$name отправил сообщение")
    }

    override fun deleteMessage() {
        println("Администратор удалил сообщение")
    }

    override fun deleteUser() {
        println("Пользователь удалён администрацией")
    }
}

class UserKS153(
    override val id: Int,
    override val name: String,
) : UsersAndAdmins(), UserMoves {

    override fun sendMessage() {
        println("$name отправил сообщение")
    }
}

interface UserMoves {
    fun sendMessage()
}

interface AdminMoves {
    fun deleteMessage()
    fun deleteUser()
}