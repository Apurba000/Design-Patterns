package ch04_factory.abstruct_factory.stores;

import ch04_factory.abstruct_factory.NYPizzaIngredientFactory;
import ch04_factory.abstruct_factory.Pizza;
import ch04_factory.abstruct_factory.PizzaIngredientFactory;
import ch04_factory.abstruct_factory.PizzaStore;
import ch04_factory.abstruct_factory.pizza.CheesePizza;
import ch04_factory.abstruct_factory.pizza.ClamPizza;
import ch04_factory.abstruct_factory.pizza.PepperoniPizza;
import ch04_factory.abstruct_factory.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (item) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
            }
        }
        return pizza;
    }
}
