package intro.behavior;

import intro.behavior.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I am Squeaking");
    }
}
