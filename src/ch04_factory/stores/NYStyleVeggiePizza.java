package ch04_factory.stores;

import ch04_factory.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Veggie Sauce";
        toppings.add("Grated Veggie Cheese");
    }

}
