package ch04_factory.abstruct_factory.pizza;

import ch04_factory.abstruct_factory.Pizza;
import ch04_factory.abstruct_factory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;
    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();
    }

}
