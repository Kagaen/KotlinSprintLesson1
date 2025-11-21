fun main() {

    val secretFile = FolderKS173("Не открывать!", 50, true)
    val file = FolderKS173("Public", 100, false)
    println(secretFile.toString())
    println(file.toString())

}

class FolderKS173(
    name: String,
    fileCount: Int,
    private val isSecret: Boolean
) {
    val name = name
        get() = if (isSecret) "Скрытая папка" else field
    val fileCount = fileCount
        get() = if (isSecret) 0 else field

    override fun toString() = "$name, $fileCount файлов"

}