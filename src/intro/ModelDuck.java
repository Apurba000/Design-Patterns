package intro;

import intro.behavior.FlyNoWay;
import intro.behavior.Quack;

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
