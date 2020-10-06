package td1.refactor.api.general;

import td1.refactor.api.general.Meat.MeatSize;
import td1.refactor.api.general.Meat.MeatType;

public class CheapBurgerBuilder extends BurgerBuilder {
    public CheapBurgerBuilder(String name, MeatType type, MeatSize size) {
        super(name, type, size);
    }

    @Override
    protected double cheesePortion() {
        return 10;
    }

    @Override
    protected double tomatoPortion() {
        return 10;
    }

    @Override
    protected double onionPortion() {
        return 15;
    }

    @Override
    protected double saucePortion() {
        return 40;
    }

    @Override
    protected double littleMeatPortion() {
        return 50;
    }

    @Override
    protected double mediumMeatPortion() {
        return 100;
    }

    @Override
    protected double bigMeatPortion() {
        return 200;
    }
}
