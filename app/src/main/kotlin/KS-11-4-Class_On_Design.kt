class Recipe(
    val id: Int,
    var recipeName: String,
    var ingredients: MutableList<String>,
    var ingredientsNumber: MutableList<Int>,
    val category: String,
    var inFavorites: Boolean = false,
) {
    fun addIngredient(name: String, count: Int) {
        ingredients.add(name)
        ingredientsNumber.add(count)
    }

    fun changeName(newName: String) {
        recipeName = newName
    }

    fun toFavorites() {
        inFavorites = true
    }

    fun outFavorites() {
        inFavorites = false
    }

}

class Ingredient(
    id: Int,
    val nameIngredient: String,
    val type: String,
)

class Category(
    val nameCategory: String,
    val recipes: MutableList<String>,
) {
    fun addRecipe(name: String) {
        recipes.add(name)
    }
}

