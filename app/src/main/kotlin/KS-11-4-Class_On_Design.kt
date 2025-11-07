class Recipe(
    val id: Int,
    var recipeName: String,
    var ingredients: MutableList<Ingredient>,
    var ingredientsNumber: MutableList<Int>,
    val category: String,
    var inFavorites: Boolean = false,
) {
    fun addIngredient(name: Ingredient, count: Int) {
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
    val recipes: MutableList<Recipe>,
) {
    fun addRecipe(name: Recipe) {
        recipes.add(name)
    }
}

class Favorites(
    val recipes: MutableList<String>,
    val recipesId: MutableList<Int>,
    )

