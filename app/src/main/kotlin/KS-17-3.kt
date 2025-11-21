fun main() {

    val secretFile = FileKS173("Не открывать!", 50, true)
    val file = FileKS173("Public", 100, false)
    println(secretFile.toString())
    println(file.toString())
}

class FileKS173(
    name: String,
    fileCount: Int,
    val secret: Boolean
) {
    val name = name
        get() = if (secret) "Скрытая папка" else field
    val fileCount = fileCount
        get() = if (secret) 0 else field

    override fun toString(): String {
        return "Название = $name, файлов = $fileCount"
    }
}