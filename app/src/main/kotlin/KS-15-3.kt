fun main() {

    val user1 = RegularUserKS153(1, "Potato")
    val admin1 = AdminKS153(2, "KS")

    user1.readForum()
    user1.sendMessage()
    admin1.readForum()
    admin1.sendMessage()
    admin1.deleteMessage()
    admin1.deleteUser()
}

abstract class UserKS153(
    val id: Int,
    val name: String,
) {

    fun sendMessage() {
        println("$name отправил сообщение")
    }

    fun readForum() {
        println("$name зашёл на форум. Что-то читает")
    }
}

class AdminKS153(
    id: Int,
    name: String,
) : UserKS153(id, name) {

    fun deleteMessage() {
        println("Администратор удалил сообщение")
    }

    fun deleteUser() {
        println("Пользователь удалён администрацией")
    }
}

class RegularUserKS153(
    id: Int,
    name: String,
) : UserKS153(id, name)