package ch03_decorator.beverage;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "DarkRoast";
    }
    public double cost() {
        return 2.99;
    }
}
