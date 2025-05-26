package ch01_stratigy;

import ch01_stratigy.behavior.FlyWithWings;
import ch01_stratigy.behavior.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        super.flyBehaviour = new FlyWithWings();
        super.quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck is Displaying");
    }

}
