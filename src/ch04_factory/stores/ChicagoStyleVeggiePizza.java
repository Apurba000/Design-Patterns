package ch04_factory.stores;

import ch04_factory.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Veggie Sauce";
        toppings.add("Shredded Mozzarella Veggie Cheese");
    }
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
