package td1.refactor2.api.general.restauration;

import td1.refactor2.api.general.dietetic.DieteticElement;
import td1.refactor2.api.general.monetary.Product;

public interface Food extends DieteticElement, Product{
    double weight();
    default double calories();
}
