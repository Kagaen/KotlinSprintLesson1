fun main() {

    val str = "D2-D4;0"
    val step = str.split("-",";")
    val stepFrom = step[0]
    val stepTo = step[1]
    val move = step[2]
    println("""
        $stepFrom
        $stepTo
        $move
    """.trimIndent())

}