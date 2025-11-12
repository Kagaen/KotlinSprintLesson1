fun main() {

    Crucian().swim()
    Seagull().fly()
    Seagull().swim()
    Duck().fly()
    Duck().swim()

}

class Crucian() : Swim {
    override fun swim() {
        println("Карась Плывёт в толще воды")
    }
}

abstract class Birds() : Swim, Fly

class Seagull() : Birds() {
    override fun swim() {
        println("Чайка Дрейфует на поверхномти воды")
    }

    override fun fly() {
        println("Чайка Летит")
    }
}

class Duck() : Birds() {
    override fun swim() {
        println("Утка Дрейфует на поверхномти воды")
    }

    override fun fly() {
        println("Утка Летит")
    }
}

interface Swim {
    fun swim()
}

interface Fly {
    fun fly()
}