package ch01_stratigy;

import ch01_stratigy.behavior.FlyNoWay;
import ch01_stratigy.behavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Model Duck is Displaying");
    }
}
