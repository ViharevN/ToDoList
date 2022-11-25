import java.util.*;


public class Recipe {
    private final String nameRecipe;
    private Set<Products> recipeSet;

    public Recipe(String nameRecipe, Set<Products> recipeSet) {
        this.nameRecipe = nameRecipe;
        this.recipeSet = recipeSet;
        if (nameRecipe == null || nameRecipe.isBlank() || nameRecipe.isEmpty() || recipeSet.size() < 0) {
            throw new RuntimeException("Данные должны быть заполнены");
        }
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public int getSum() {
        int sum = 0;
        for (Products products : recipeSet) {
            sum += products.getCost();
        }
        return sum;
    }

    public Set<Products> getRecipeSet() {
        return recipeSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(nameRecipe, recipe.nameRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipe);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов:").append('\n');
        for (Products product : this.recipeSet) {
            stringBuilder.append(product).append('\n');
        }
        return stringBuilder.toString();
    }
}
