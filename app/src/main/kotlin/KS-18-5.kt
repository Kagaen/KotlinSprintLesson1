import kotlin.math.sqrt

class Screen {

    fun draw(x: Int, y: Int) = println("Поставлена точка в координатах [$x;$y]")

    fun draw(x1: Int, y1: Int, x2: Float, y2: Float) {
        val x = x2 - x1
        val y = y2 - y1
        val r = sqrt(x * x + y * y)
        println("Нарисован круг с центром в [$x1;$y1] и радиусом ${"%.1f".format(r)}")
    }

    fun draw(xA: Float, yA: Float, xC: Float, yC: Float) {
        val centerX = (xA + xC) / 2
        val centerY = (yA + yC) / 2
        val dxHalf = -(xC - xA) / 2
        val dyHalf = (yC - yA) / 2
        val xB = centerX + dxHalf
        val yB = centerY + dyHalf
        val xD = centerX - dxHalf
        val yD = centerY - dyHalf
        println(
            "Нарисован квадрат с вершинами:\n" +
                    "A[$xA;$yA]\n" +
                    "B[${"%.1f".format(xB)};${"%.1f".format(yB)}]\n" +
                    "C[$xC;$yC]\n" +
                    "D[${"%.1f".format(xD)};${"%.1f".format(yD)}]"
        )
    }
}

fun main() {

    Screen().draw(5, 2)
    Screen().draw(2, 4, 3.5f, 5.6f)
    Screen().draw(-3.4f, -2.7f, 2.2f, 3.1f)

}
