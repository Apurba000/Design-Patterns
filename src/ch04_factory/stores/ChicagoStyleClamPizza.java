package ch04_factory.stores;

import ch04_factory.Pizza;

public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Clam Sauce";
        toppings.add("Shredded Mozzarella Clam Cheese");
    }
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
