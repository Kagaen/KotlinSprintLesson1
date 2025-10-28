import java.util.Locale
import kotlin.math.pow

const val CM_IN_M = 100
const val UNDERWEIGHT = 18.5
const val NORMAL_WEIGHT = 25
const val OVERWEIGHT = 30

fun main() {

    print("Your height in cm: ")
    val height = readln().toDouble() / CM_IN_M
    print("Your weight in kg: ")
    val weight = readln().toDouble()
    val bmi = weight / height.pow(2)
    val niceBmi = String.format(Locale.UK, "%.2f", bmi)

    when {
        bmi < UNDERWEIGHT -> println("BMI = $niceBmi, underweight ")
        bmi < NORMAL_WEIGHT -> println("BMI = $niceBmi, normal body weight")
        bmi < OVERWEIGHT -> println("BMI = $niceBmi, overweight")
        bmi >= OVERWEIGHT -> println("BMI = $niceBmi, obese")
    }

}