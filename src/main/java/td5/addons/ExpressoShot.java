package td5.addons;

import td5.Beverage;

public class ExpressoShot extends Extra {

    public ExpressoShot(Beverage b) {
        super(b);
    }
    public double extra(double extra) {
        return extra + 0.80;
    }
    
}
