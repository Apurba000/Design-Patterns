package ch04_factory.stores;

import ch04_factory.Pizza;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza(){
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Clam Sauce";
        toppings.add("Grated Clam Cheese");
    }
}
