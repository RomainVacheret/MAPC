package td5.coffees;

import td5.Beverage;

public abstract class Coffee implements Beverage {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
