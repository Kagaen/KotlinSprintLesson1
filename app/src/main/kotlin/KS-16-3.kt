fun main() {
    println(if (User163().validate()) "Пароль принят" else "Пароль не совпадает")
}

class User163 {
    val login = "rama"
    private val parol = "dvaVanDama"
    fun validate() = parol == readln()
}