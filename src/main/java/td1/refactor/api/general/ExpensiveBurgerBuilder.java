package td1.refactor.api.general;

import td1.refactor.api.general.Meat.MeatSize;
import td1.refactor.api.general.Meat.MeatType;

public class ExpensiveBurgerBuilder extends BurgerBuilder {
    public ExpensiveBurgerBuilder(String name, MeatType type, MeatSize size) {
        super(name, type, size);
    }

    @Override
    public double cheesePortion() {
        return 30;
    }

    @Override
    public double tomatoPortion() {
        return 10;
    }

    @Override
    public double onionPortion() {
        return 20;
    }

    @Override
    public double saucePortion() {
        return 20;
    }

    @Override
    public double littleMeatPortion() {
        return 100;
    }

    @Override
    public double mediumMeatPortion() {
        return 200;
    }

    @Override
    public double bigMeatPortion() {
        return 400;
    }
}