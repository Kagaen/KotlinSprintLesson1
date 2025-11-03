fun main() {

    print("Enter a number: ")
    val number = readln().toInt()
    for (range in 0..number step 2) {
        println(range)
    }

}