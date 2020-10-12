package td1.refactor2.api.general.restauration;

import td1.refactor2.api.general.dietetic.DieteticElement;
import td1.refactor2.api.general.monetary.Product;

public interface Base extends Product, DieteticElement{
    boolean hasUniquePrice();
}
