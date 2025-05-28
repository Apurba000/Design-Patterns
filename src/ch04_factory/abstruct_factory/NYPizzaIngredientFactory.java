package ch04_factory.abstruct_factory;

import ch04_factory.abstruct_factory.ingerdeints.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new Dough("ThinCrustDough");
    }

    @Override
    public Sauce createSauce() {
        return new Sauce("MarinaraSauce");
    }

    @Override
    public Cheese createCheese() {
        return new Cheese("ReggianoCheese");
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Veggies("Garlic"), new Veggies("Onion"), new Veggies("Mushroom"), new Veggies("RedPepper")};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni("SlicedPepperoni");
    }

    @Override
    public Clams createClam() {
        return new Clams("FreshClams");
    }
}
