package td1.refactor.client;

import td1.refactor.api.general.*;
import td1.refactor.api.general.Meat.MeatSize;
import td1.refactor.api.general.Meat.MeatType;
import td1.refactor.api.general.Restaurant.RestaurantType;
import td1.refactor.api.general.Sauce.SauceType;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        RestaurantFactory advisor = new RestaurantFactory();

        Burger aliceDinner = advisor
                .selectRestaurant(RestaurantType.CHEAP)
                .orderMenu(Menus.FISH)
                .cook();

        Burger bobDinner = advisor      
                .selectRestaurant(RestaurantType.CHEAP)
                .orderMenu(Menus.MEAT)
                .withOignons()
                .withCheese()
                .cook();

        Burger charlesDinner = advisor
                .selectRestaurant(RestaurantType.EXPENSIVE)
                .orderPersonnal("Ownstyle", MeatType.BEEF, MeatSize.BIG)
                .withOignons()
                .withCheese()
                .withSauce(SauceType.BARBECUE)
                .withSauce(SauceType.BEARNAISE)
                .withSauce(SauceType.BURGER)
                .withCheese()
                .cook();

        List<Burger> dinners = Arrays.asList(
                aliceDinner,
                bobDinner,
                charlesDinner
        );
        for (Burger dinner : dinners) {
            System.out.println(dinner);
        }
    }
}