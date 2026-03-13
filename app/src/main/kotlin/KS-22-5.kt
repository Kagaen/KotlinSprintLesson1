import java.time.LocalDate

fun main() {
    val place = GalacticGuide(
        eventTitle = "Альфа Центавра",
        eventDescription = "Звёздная система",
        eventDistanceFromEarth = 4.37
    )
    println(
        """Информация о месте:
          Название: ${place.component1()}
          Описание: ${place.component2()}
          Дата события: ${place.component3()}
          Световых лет до земли: ${place.component4()}""".trimIndent()
    )
}

data class GalacticGuide(
    val eventTitle: String,
    val eventDescription: String,
    val eventData: LocalDate = LocalDate.now(),
    val eventDistanceFromEarth: Double,
    )