fun main() {
    val mainScreen = MainScreenViewModel()
    println(mainScreen.mainScreenState)
    println(mainScreen.loadData())
    println(mainScreen.loadData())
    println(mainScreen.loadData())
    println(mainScreen.loadData())
}

class MainScreenViewModel(val mainScreenState: MainScreenState = MainScreenState()) {

    private val listOfStates = listOf<String>("Отсутствие данных", "Загрузка данных", "Наличие загруженных данных")
    private var currentIndex = 0

    fun loadData(): MainScreenState {

        currentIndex = (currentIndex + 1) % listOfStates.size
        mainScreenState.data = listOfStates[currentIndex]
        val state =
            if (currentIndex == 1) mainScreenState.copy(isLoading = true) else mainScreenState.copy(isLoading = false)

        return state
    }

    data class MainScreenState(
        var data: String = "Отсутствие данных",
        val isLoading: Boolean = false,
    )
}
