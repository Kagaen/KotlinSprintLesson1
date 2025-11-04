fun main() {


    print("Количество ингредиентов в рецепте: ")
    val indexCount = readln().toInt()
    val recipe = arrayOfNulls<String>(indexCount)

    for (i in 0 until indexCount) {
        print("Ингредиент ${i + 1} - ")
        recipe[i] = readln().trim()
    }
    println("Записан рецепт: ${recipe.joinToString()}")

}
