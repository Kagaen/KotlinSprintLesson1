class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String? = null
) {
    fun showInfo() {
        println("User info:\nID - $id\nLogin -$login\nPassword - $password\nMail - $mail\nBio - $bio")
    }

    fun writeBio() {
        println("Write bio: ")
        bio = readln()
    }

    fun passwordChange() {
        print("Current password: ")
        if (readln() == password) {
            print("New password: ")
            password = readln()
        }
    }
}

fun main() {

    val user = User2(
        id = 12,
        login = "rama",
        password = "12123",
        mail = "rama@mail.ru",
    )

    user.writeBio()
    user.passwordChange()
    user.showInfo()

}