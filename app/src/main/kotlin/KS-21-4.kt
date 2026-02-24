import java.io.File

fun main() {

    val file = File("testFile.txt")
    file.addToFile("Что-то новое")
    file.addToFile("ещё новее")
    println(file.readText())
}

fun File.addToFile(text: String) {
    if (exists()) {
        val currentText = readText()
        writeText(text.lowercase() + "\n$currentText")
    } else {
        println("Файла $name не существует, создаём")
        createNewFile()
        writeText(text.lowercase())
    }
}