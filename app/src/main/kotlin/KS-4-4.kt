fun main() {

    val day = 5
    val check = day % 2
    println(
        "Hands exercises: ${check == 1}\n" +
                "Legs exercises: ${check == 0}\n" +
                "Spine exercises: ${check == 0}\n" +
                "Abs exercises: ${check == 1}"
    )

}