package ch01_stratigy.behavior;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I am Squeaking");
    }
}
