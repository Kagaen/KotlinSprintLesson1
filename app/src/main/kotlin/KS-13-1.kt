class Mobile(
    val number: Long,
    val name: String,
    val company: String? = null,
)

fun main() {
    val mobile1 = Mobile(64555, "sad")
    val mobile2 = Mobile(64555, "sad", null)
}
