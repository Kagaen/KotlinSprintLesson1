fun main() {

    val listOfStrings =
        listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven")

    val listOfLambdas: List<() -> String> = listOfStrings.map { str: String -> { "Нажат элемент \"$str\"" } }

    listOfLambdas.mapIndexed { index: Int, lambda: () -> String ->
        if (index % 2 == 0) println(lambda())
    }
}