import java.util.Locale
import kotlin.math.pow

fun main() {

    print("Your height in cm: ")
    val height = readln().toDouble() / 100
    print("Your weight in kg: ")
    val weight = readln().toDouble()
    val bmi = weight / height.pow(2)
    val niceBmi = String.format(Locale.UK, "%.2f", bmi)

    when {
        bmi < 18.5 -> println("BMI = $niceBmi, underweight ")
        (bmi >= 18.5) && (bmi < 25) -> println("BMI = $niceBmi, normal body weight")
        (bmi >= 25) && (bmi < 30) -> println("BMI = $niceBmi, overweight")
        bmi >= 30 -> println("BMI = $niceBmi, obese")
    }

}