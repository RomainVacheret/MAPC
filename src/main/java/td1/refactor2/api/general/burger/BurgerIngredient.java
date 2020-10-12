package td1.refactor2.api.general.burger;

import td1.refactor2.api.general.restauration.Base;

public enum BurgerIngredient implements Base {
    CHEDDAR, DEEP_FIRED_ONIONS, TOMATO;

    public double coloriesPer100g() {
        double rtr = 0;
        switch(this) {
            case CHEDDAR:
                rtr = 400;
                break;
            case DEEP_FIRED_ONIONS:
                rtr = 590;
                break;
            case TOMATO:
                rtr = 21;
        }
        return rtr;
    }

    public double price() {
        double rtr = 0;
        switch (this) {
            case CHEDDAR:
            rtr = 4;
            break;
            case DEEP_FIRED_ONIONS:
                rtr = 1.5;
                break;
            case TOMATO:
                rtr = 0.5;
        }
        return rtr;
    }

}
