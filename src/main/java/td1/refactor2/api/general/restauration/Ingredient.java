package td1.refactor2.api.general.restauration;

public class Ingredient implements Food{
    private final double weight;

    public Ingredient(Base base, double weight) {
        this.weight = weight();
    }

    @Override
    public double weight() {
        return this.weight;
    }


}
