fun main() {

    val greetings: (String) -> Unit = { username: String -> println("С наступающим новым годом, $username!") }
    greetings("Kagaen")
}