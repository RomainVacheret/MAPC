package td5.addons;

import td5.Beverage;

public class Discount extends Extra {

    public Discount(Beverage b) {
        super(b);
    }
    public double extra(double extra) {
        return extra * 0.80;
    }
    
}