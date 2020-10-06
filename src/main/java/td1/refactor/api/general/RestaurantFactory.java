package td1.refactor.api.general;

import td1.refactor.api.general.Restaurant.RestaurantType;

public class RestaurantFactory {
    private static RestaurantFactory instance;
    private RestaurantFactory() {}

    public static RestaurantFactory getInstance() {
        if(instance == null) {
            instance = new RestaurantFactory();
        }
        return instance;
    }
    public Restaurant selectRestaurant(RestaurantType type) {
        Restaurant rtr = null;
        switch(type) {
            case CHEAP:
                rtr = new CheapRestaurant();
                break;
            case EXPENSIVE:
                rtr = new ExpensiveRestaurant();
                break;
            default:
                System.out.println("Wrong restaurant type.");
        }
        return rtr;
    }
}
