fun main() {

    val recipe = mutableListOf("water", "meat", "potato")

    print("The recipe has the basic ingredients: $recipe\n" +
            "Would you like add more? - ")
    val answer = readln().trim()
    if (answer.equals("yes", ignoreCase = true)) {
        print("Which ingredient you want to add? - ")
        recipe.add(readln().trim())
    } else return

    println("The recipe has the ingredients now: $recipe")

}