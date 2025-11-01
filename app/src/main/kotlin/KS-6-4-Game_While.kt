fun main() {

    val number = (0..9).random()
    var attempt = 5

    println("Угадай число от 0 до 9")
    while (attempt > 0) {
        val compare = readln().toIntOrNull() == number
        if (compare) {
            println("Это была великолепная игра!")
            break
        } else {
            attempt--
            println("Неверно" +
                when (attempt) {
                    in 2..4 -> " ,осталось $attempt попытки"
                    1 -> " ,осталась одна попытка"
                    else -> " ,было загадано число $number"
                }
            )
        }
    }

}