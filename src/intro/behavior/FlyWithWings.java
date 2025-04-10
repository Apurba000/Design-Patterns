package intro.behavior;

import intro.behavior.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I am Flying");
    }
}
