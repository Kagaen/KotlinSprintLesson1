import kotlin.math.pow

fun main() {

    print("Your height in cm: ")
    val height = readln().toDouble() / 100
    print("Your weight in kg: ")
    val weight = readln().toDouble()
    val bmi = weight / height.pow(2)

    when {
        bmi < 18.5 -> println("BMI = ${"%.2f".format(bmi)}, underweight ")
        (bmi >= 18.5) && (bmi < 25) -> println("BMI = ${"%.2f".format(bmi)}, normal body weight")
        (bmi >= 25) && (bmi < 30) -> println("BMI = ${"%.2f".format(bmi)}, overweight")
        bmi >= 30 -> println("BMI = ${"%.2f".format(bmi)}, obese")
    }

}