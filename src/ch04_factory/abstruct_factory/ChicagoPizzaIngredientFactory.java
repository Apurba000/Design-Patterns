package ch04_factory.abstruct_factory;

import ch04_factory.abstruct_factory.ingerdeints.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new Dough("ThickCrustDough");
    }

    @Override
    public Sauce createSauce() {
        return new Sauce("Plum Tomato Sauce");
    }

    @Override
    public Cheese createCheese() {
        return new Cheese("MozzarellaCheese");
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Veggies("Spinach"), new Veggies("BlackOlives"), new Veggies("EggPlant")};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni("SlicedPepperoni");
    }

    @Override
    public Clams createClam() {
        return new Clams("FrozenClams");
    }
}
