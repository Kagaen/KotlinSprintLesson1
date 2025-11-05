fun main() {

    val salad = arrayOf("капуста","ананас","маслины","курица")
    println(salad.joinToString(", ","[", "]"))

    print("Найти ингредиент: ")
    val findIndex = salad.indexOf(readln().trim())

    if (findIndex != -1) {
        println("Чем заменить?")
        salad[findIndex] = readln().trim()
        println("Готово! Вы сохранили следующий список: ${salad.joinToString(", ","[", "]")}")
    }
    else println("Такого ингредиента в рецепте нет")

}