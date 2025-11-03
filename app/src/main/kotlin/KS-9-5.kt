fun main() {

    val userList = mutableListOf<String>()
    println("Add 5 ingredients:")
    for (i in 1..5) {
        userList += readln().trim()
    }

    val recipe = userList.toSet().sorted().toMutableList()
    recipe[0] = recipe[0].replaceFirstChar { it.uppercase() }
    println(recipe.joinToString(", "))

}