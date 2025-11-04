fun main() {

    val omeletRecipe = listOf(2, 50, 15)

    print("Portions count: ")
    val count = readln().toInt()
    val order = omeletRecipe.map { it * count }
    println("For $count omelettes need:\n" +
            "eggs - ${order[0]}, milk - ${order[1]} ml, butter - ${order[2]} g")

}