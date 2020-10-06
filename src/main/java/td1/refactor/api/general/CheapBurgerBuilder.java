package td1.refactor.api.general;

import td1.refactor.api.general.Meat.MeatSize;
import td1.refactor.api.general.Meat.MeatType;

public class CheapBurgerBuilder extends BurgerBuilder {
    public CheapBurgerBuilder(String name, MeatType type, MeatSize size) {
        super(name, type, size);
    }

    @Override
    public double cheesePortion() {
        return 10;
    }

    @Override
    public double tomatoPortion() {
        return 10;
    }

    @Override
    public double onionPortion() {
        return 10;
    }

    @Override
    public double saucePortion() {
        return 40;
    }

    @Override
    public double littleMeatPortion() {
        return 50;
    }

    @Override
    public double mediumMeatPortion() {
        return 100;
    }

    @Override
    public double bigMeatPortion() {
        return 200;
    }
}
