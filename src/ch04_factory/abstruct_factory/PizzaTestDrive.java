package ch04_factory.abstruct_factory;

import ch04_factory.factory_method.Pizza;
import ch04_factory.factory_method.PizzaStore;
import ch04_factory.factory_method.stores.ChicagoPizzaStore;
import ch04_factory.factory_method.stores.NYPizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        ch04_factory.factory_method.PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
