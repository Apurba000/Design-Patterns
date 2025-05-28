package ch04_factory.abstruct_factory.stores;

import ch04_factory.abstruct_factory.*;
import ch04_factory.abstruct_factory.pizza.CheesePizza;
import ch04_factory.abstruct_factory.pizza.ClamPizza;
import ch04_factory.abstruct_factory.pizza.PepperoniPizza;
import ch04_factory.abstruct_factory.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        switch (item) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
            }
        }
        return pizza;
    }
}
