fun main() {

    val salad = arrayOf("капуста","ананас","маслины","курица")
    var exist = false

    print("Найти ингредиент: ")
    val finder = readln().trim()

    for (i in salad) {
        if (i == finder) exist = true
    }
    if (exist) println("Ингредиент “$finder” в рецепте есть")
    else println("Такого ингредиента в рецепте нет")

}