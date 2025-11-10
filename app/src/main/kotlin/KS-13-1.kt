class Mobile(
    val number: Long,
    val name: String,
) {
    constructor(
        number: Long,
        name: String,
        company: String?,
    ) : this(number, name)
}

fun main() {
    val mobile1 = Mobile(64555, "sad")
    val mobile2 = Mobile(64555, "sad", null)
}
