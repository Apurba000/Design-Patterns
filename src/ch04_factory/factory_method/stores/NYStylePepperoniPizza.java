package ch04_factory.factory_method.stores;

import ch04_factory.factory_method.Pizza;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "NY Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Pepperoni Sauce";
        toppings.add("Grated Pepperoni Cheese");
    }
}
