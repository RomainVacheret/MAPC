package td1.refactor.api.general;

import td1.refactor.api.general.Meat.MeatSize;
import td1.refactor.api.general.Meat.MeatType;

public class ExpensiveBurgerBuilder extends BurgerBuilder {
    public ExpensiveBurgerBuilder(String name, MeatType type, MeatSize size) {
        super(name, type, size);
    }

    @Override
    protected double cheesePortion() {
        return 30;
    }

    @Override
    protected double tomatoPortion() {
        return 10;
    }

    @Override
    protected double onionPortion() {
        return 20;
    }

    @Override
    protected double saucePortion() {
        return 20;
    }

    @Override
    protected double littleMeatPortion() {
        return 100;
    }

    @Override
    protected double mediumMeatPortion() {
        return 200;
    }

    @Override
    protected double bigMeatPortion() {
        return 400;
    }
}