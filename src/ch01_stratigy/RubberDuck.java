package ch01_stratigy;

import ch01_stratigy.behavior.FlyNoWay;
import ch01_stratigy.behavior.MuteQuack;

public class RubberDuck extends Duck{

    public RubberDuck(){
        super.flyBehaviour = new FlyNoWay();
        super.quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("RubberDuck is Displaying");
    }

}
