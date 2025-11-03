fun main() {

    val salad = arrayOf("капуста","ананас","маслины","курица")
    println(salad.joinToString(", ","[", "]"))

    print("Найти ингредиент: ")
    val find = readln().trim()
    val exist = find in salad

    if (exist) {
        println("Чем заменить?")
        val replace = readln().trim()
        val index = salad.indexOf(find)
        salad[index] = replace
        println("Готово! Вы сохранили следующий список: ${salad.joinToString(", ","[", "]")}")
    }
    else println("Такого ингредиента в рецепте нет")

}