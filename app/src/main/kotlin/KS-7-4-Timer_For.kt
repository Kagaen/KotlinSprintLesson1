fun main () {

    print("Set a timer: ")
    val timer = readln().toInt()
    for (count in timer downTo 1) {
        println("$count left")
        Thread.sleep(1000)
    }
    println("Time out")
}