class Mobile2(
    val number: Long,
    val name: String,
    val company: String? = null,
) {
    fun mobileInfo() = println("- Имя: $name\n- Номер: $number\n- Компания: ${company ?: "не указано"}")
}

fun main() {
    val mobile1 = Mobile2(89454681573, "Игорь")
    mobile1.mobileInfo()
}