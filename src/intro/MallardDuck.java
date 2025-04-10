package intro;

import intro.behavior.FlyWithWings;
import intro.behavior.Quack;

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
