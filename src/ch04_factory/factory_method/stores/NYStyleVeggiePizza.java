package ch04_factory.factory_method.stores;

import ch04_factory.factory_method.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Veggie Sauce";
        toppings.add("Grated Veggie Cheese");
    }

}
