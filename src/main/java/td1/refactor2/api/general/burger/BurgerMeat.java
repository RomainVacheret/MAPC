package td1.refactor2.api.general.burger;

public enum BugerMeat implements Base {

    BEEF, WHITEFISH;
    // public enum MeatType {
    //     BEEF, WHITEFISH;
    //     // BEEF : 200 kcal / 100g
    //     // WHITEFISH : 170 kcal / 100g

    //     public double price() {
    //         double rtr;
    //         switch (this) {
    //             case WHITEFISH:
    //                 rtr = 6;
    //                 break;
    //             case BEEF:
    //             default:
    //                 rtr = 4;
    //         }
    //         return rtr;
    //     }
    // }

    @Override
    public double price() {
        return type.price() * weight / 100;
    }

    public double caloriesPer100g() {
        double rtr = 0;
        switch(this) {
            case BEEF:
                rtr = 200;
                break;
            case WHITEFISH:
                rtr = 170;
        }
        return rtr;

    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€", type, weight(), price());
    }
}
