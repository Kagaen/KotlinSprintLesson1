fun main() {

    val list = mutableListOf<Int>()
    repeat(10) {
        list.add((0..11).random())
    }
    println(list.joinToString(", "))
    println(list.evenNumberSum())

}

fun List<Int>.evenNumberSum(): Int {
    var even = 0
    this.forEach { if (it % 2 == 0) even += it }
    return even
}