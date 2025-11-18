fun main() {
    requestKS164("почти")
}

class Order164 {
    val numberOfOrder = 456
    private var statusOrder = ""
    fun changeStatus(newStatus: String){
        statusOrder = newStatus
        println(statusOrder)
    }
}

fun requestKS164(newStatus: String) = Order164().changeStatus(newStatus)
