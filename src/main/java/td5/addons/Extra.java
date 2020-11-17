package td5.addons;

import td5.Beverage;

public abstract class Extra implements Beverage {
    protected Beverage beverage;

    protected Extra(Beverage b) {
        this.beverage = b;
    }

    protected abstract double extra(double extra);

    @Override
    public double getPrice() {
        return this.extra(this.beverage.getPrice());
    }

    @Override
    public String toString() {
        return String.format("%s, %s", beverage.toString(), this.getClass().getSimpleName());
    }
}
