package ch03_decorator;

import ch03_decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    public double cost() {
        return beverage.cost() + .20;
    }
}
