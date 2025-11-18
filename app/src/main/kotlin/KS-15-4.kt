fun main() {

    val instrument1 = Instrument(1, "Барабан", 5)
    val component1 = Component(5, "Струны", 10)
    instrument1.search()
}

abstract class Base(
    val id: Int,
    val name: String,
    val amount: Int,
)

class Instrument(
    instId: Int,
    name: String,
    amount: Int,
) : Base(id = instId, name, amount), Search

class Component(
    compId: Int,
    name: String,
    amount: Int,
) : Base(id = compId, name, amount)

interface Search {
    fun search() {
        println("Выполняется поиск")
    }
}