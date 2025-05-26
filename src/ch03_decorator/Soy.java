package ch03_decorator;

import ch03_decorator.beverage.Beverage;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
    public double cost() {
        return beverage.cost() + .40;
    }
}
