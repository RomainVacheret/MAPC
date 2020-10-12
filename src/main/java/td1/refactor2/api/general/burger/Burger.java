package td1.refactor2.api.general.burger;

import td1.refactor2.api.general.restauration.Recipe;

public class Burger extends Recipe {
    public Burger(String name) {
        super(name);
    }

    @Override
    public String toString() {
        final String DELIM = "--------------------\n";
        StringBuilder buffer = new StringBuilder();
        buffer.append(String.format("*** Menu %s ***\n", this.name));
        for (Object item : this.ingredients) {
            buffer.append(String.format("- %s\n", item));
        }
        buffer.append(DELIM);
        buffer.append(String.format("price:         %.2f\n", price()));
        buffer.append(DELIM);
        return buffer.toString();
    }
}
