fun main() {

    val listOfStrings = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven")

    listOfStrings.mapIndexed { index, str: String ->
        println(if (index % 2 == 0) "press $str" else str)
    }

}