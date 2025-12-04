abstract class Package184 {
    open fun packageArea() = 0
}

private class CubeBox(val edge: Int) : Package184() {
    val faceNumber = 6
     override fun packageArea() = edge * edge * faceNumber
}

private class Box(
    val length: Int,
    val width: Int,
    val height: Int,
) : Package184() {
     override fun packageArea() = 2 * (length * width + length * height + width * height)
}

fun main() {
    val package1 = CubeBox(5)
    val package2 = Box(6, 5, 4)
    println("Площадь первой посылки: " + package1.packageArea())
    println("Площадь второй посылки: " + package2.packageArea())

}


