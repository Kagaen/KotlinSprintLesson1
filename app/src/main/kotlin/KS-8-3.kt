fun main() {

    val salad = arrayOf("капуста","ананас","маслины","курица")

    print("Найти ингредиент: ")
    val finder = readln().trim()
    val exist = finder in salad

    if (exist) println("Ингредиент “$finder” в рецепте есть")
    else println("Такого ингредиента в рецепте нет")

}