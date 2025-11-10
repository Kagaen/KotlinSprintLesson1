class Mobile(
    val number: Long,
    val name: String,
    val company: String?,
)

fun main() {
    val mobile1 = Mobile(64555, "sad")
    val mobile2 = Mobile(64555, "sad", null)
}
