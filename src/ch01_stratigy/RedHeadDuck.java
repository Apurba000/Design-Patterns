package ch01_stratigy;

import ch01_stratigy.behavior.FlyWithWings;
import ch01_stratigy.behavior.Squeak;

public class RedHeadDuck extends Duck{

    public RedHeadDuck(){
        super.flyBehaviour = new FlyWithWings();
        super.quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("RedHeadDuck is Displaying");
    }
}
