package td1.refactor2.api.general.restauration;

import java.util.ArrayList;
import java.util.List;

public abstract class Recipe implements ComposedFood {
    protected final String name;
    protected final List<Ingredient> ingredients;

    public Recipe(String name) {
        this.ingredients = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void add(Base base, double weight) {
        this.ingredients.add(new Ingredient(base, weight));
    }

    @Override
    public double caloriesPer100g() {
        return this.ingredients.stream().map(Ingredient::caloriesPer100g).reduce(0.0, Double::sum);
    }

    @Override
    public double calories() {
        return this.ingredients.stream().map(Ingredient::calories).reduce(0.0, Double::sum);
    }

    @Override
    public double weight() {
        return this.ingredients.stream().map(Ingredient::weight).reduce(0.0, Double::sum);
    }

    @Override
    public double price() {
        return this.ingredients.stream().map(Ingredient::price).reduce(0.0, Double::sum);
    }

    public String name() {
        return this.name;
    }
}
