fun main() {

    val circleKS162 = CircleKS162(6)
    circleKS162.circleLength()
    circleKS162.circleArea()

}

class CircleKS162(private val rad: Int) {
    private val pi = 3.14
    fun circleArea() = println("Площадь: ${pi * rad * rad}")
    fun circleLength() = println("Длина окружности: ${pi * rad * 2}")
}