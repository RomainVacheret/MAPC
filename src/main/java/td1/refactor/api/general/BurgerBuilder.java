package td1.refactor.api.general;

import java.util.ArrayList;
import java.util.List;

import td1.refactor.api.general.Meat.MeatSize;
import td1.refactor.api.general.Meat.MeatType;
import td1.refactor.api.general.Sauce.SauceType;

public abstract class BurgerBuilder {

    protected final List<FoodProduct> products;
    protected final String name;

    protected abstract double littleMeatPortion();
    protected abstract double mediumMeatPortion();
    protected abstract double bigMeatPortion();
    protected abstract double cheesePortion();
    protected abstract double onionPortion();
    protected abstract double saucePortion();
    protected abstract double tomatoPortion();

    public BurgerBuilder(String name, MeatType type, MeatSize size) {
        this.name = name;
        this.products = new ArrayList<>();
        this.products.add(new Meat(type, this.getMeatWeight(size)));
    }

    public BurgerBuilder withOnion() {
        this.products.add(new DeepFriedOnions(this.onionPortion()));
        return this;
    }

    public BurgerBuilder withCheese() {
        this.products.add(new Cheddar(this.cheesePortion()));
        return this;
    }

    public BurgerBuilder withTomato()  {
        this.products.add(new Tomato(this.tomatoPortion()));
        return this;
    }

    public BurgerBuilder withSauce(SauceType type) {
        this.products.add(new Sauce(type, this.saucePortion()));
        return this;
    }

    public Burger cook() {
        return new Burger(this.name, this.products);
    }

    public double getMeatWeight(MeatSize size) {
        double weight;
        switch(size) {
            case LITTLE: 
                weight = this.littleMeatPortion();
                break;
            case MEDIUM:
                weight = this.mediumMeatPortion();
                break;
            case BIG:
            default:
                weight = this.bigMeatPortion();
        }
        return weight;
    }
}
