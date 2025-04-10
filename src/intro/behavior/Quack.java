package intro.behavior;

import intro.behavior.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I am Quaking");
    }
}
