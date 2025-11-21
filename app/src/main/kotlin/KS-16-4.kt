fun main() {
    requestKS164("почти")
}

class Order164 {
    val numberOfOrder = 456
    private var statusOrder = ""
    private fun changeStatus(newStatus: String) {
        statusOrder = newStatus
        println(statusOrder)
    }

    fun manageOrder(newStatus: String) = changeStatus(newStatus)
}

fun requestKS164(newStatus: String) = Order164().manageOrder(newStatus)
