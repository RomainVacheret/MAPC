package td1.refactor.api.general;

import td1.refactor.api.general.Meat.MeatSize;
import td1.refactor.api.general.Meat.MeatType;
import td1.refactor.api.general.Sauce.SauceType;

public class ExpensiveRestaurant implements Restaurant {
    @Override
    public BurgerBuilder orderMenu(Menus menuType) {
        BurgerBuilder rtr = null;
        switch(menuType) {
                    case MEAT:
                        rtr = new ExpensiveBurgerBuilder("BigMarcel", MeatType.BEEF, MeatSize.MEDIUM)
                            .withSauce(SauceType.BURGER)
                            .withTomato();
                        break;
                    case FISH:
                        rtr = new ExpensiveBurgerBuilder("FiletO'Poisson", MeatType.WHITEFISH, MeatSize.MEDIUM)
                            .withSauce(SauceType.BEARNAISE);
                        break;
                    case CHEESE:
                        rtr = new ExpensiveBurgerBuilder("MaxeeCheese", MeatType.BEEF, MeatSize.MEDIUM)
                            .withCheese()
                            .withOignons();
                        break;
                    default:
                        System.out.println("Custom menus must be ordered separately");
                }
        return rtr;
    }

    @Override
    public BurgerBuilder orderPersonnal(String name, MeatType type, MeatSize size) {
        return new ExpensiveBurgerBuilder(name, type, size);
    }
    
}
