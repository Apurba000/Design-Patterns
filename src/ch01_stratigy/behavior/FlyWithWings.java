package ch01_stratigy.behavior;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I am Flying");
    }
}
