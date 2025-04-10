package intro;

import intro.behavior.FlyWithWings;
import intro.behavior.Squeak;

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
