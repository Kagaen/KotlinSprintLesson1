fun main() {

    do {
        val code = (1000..9999).random()
        println("Ваш код авторизации: $code")
        print("Пожалуйста, введите код авторизации: ")
        val userCode = readln().toIntOrNull()
    } while (code != userCode)
    println("Добро пожаловать")

}