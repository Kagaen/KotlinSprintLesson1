fun main() {

    print("Set timer in sec: ")
    var counter = readln().toInt()

    while (counter > 0) {
        println("${counter--} left")
        Thread.sleep(1000)
    }
    println("Time out")

}