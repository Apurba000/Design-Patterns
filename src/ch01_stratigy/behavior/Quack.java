package ch01_stratigy.behavior;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I am Quaking");
    }
}
