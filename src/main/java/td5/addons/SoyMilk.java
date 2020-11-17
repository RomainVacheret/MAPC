package td5.addons;

import td5.Beverage;

public class SoyMilk extends Extra {

    public SoyMilk(Beverage b) {
        super(b);
    }
    public double extra(double extra) {
        return extra + 1.25;
    }
    
}
