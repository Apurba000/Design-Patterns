package intro;

import intro.behavior.FlyNoWay;
import intro.behavior.MuteQuack;

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
