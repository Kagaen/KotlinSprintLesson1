fun main() {

    val kubik = Kubik()
    kubik.getKubik()

}

class Kubik {
    private val digit = (0..6).random()
    fun getKubik() = println("Выпало $digit")
}