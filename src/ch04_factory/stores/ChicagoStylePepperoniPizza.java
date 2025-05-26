package ch04_factory.stores;

import ch04_factory.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Pepperoni Sauce";
        toppings.add("Shredded Mozzarella Pepperoni Cheese");
    }
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
