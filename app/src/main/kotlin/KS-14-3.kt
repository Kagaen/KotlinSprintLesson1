import kotlin.math.PI

fun main() {

    val listOfFigures = listOf(
        Circle("black", 3.6),
        Circle("white", 5.4),
        Rectangle("black", 9.6, 4.5),
        Rectangle("white", 15.7, 10.2)
    )
    var blackPerimeter = 0.0
    var whiteArea = 0.0
    listOfFigures.forEach {
        if (it.color == "black") blackPerimeter += it.calculatePerimeter()
        else whiteArea += it.calculateArea()
    }
    println("Сумма чёрных периметров = ${"%.1f".format(blackPerimeter)}")
    println("Сумма белых площадей = ${"%.1f".format(whiteArea)}")

}

abstract class Figure(val color: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Rectangle(
    color: String,
    val length: Double,
    val width: Double,
) : Figure(color) {
    override fun calculateArea() = length * width
    override fun calculatePerimeter() = (length + width) * 2
}

class Circle(
    color: String,
    val rad: Double,
) : Figure(color) {
    override fun calculateArea() = PI * rad * rad
    override fun calculatePerimeter() = PI * rad * 2
}
