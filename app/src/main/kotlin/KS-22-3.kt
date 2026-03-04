fun main() {
    val user = User223(1, "Олег", 30)
    val (userId, userName, userAge) = user
    println("ID: $userId\nИмя: $userName\nВозраст: $userAge")
}

data class User223(
    val id: Int,
    val firstName: String,
    val age: Int
)