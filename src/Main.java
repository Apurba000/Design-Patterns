import into.Duck;
import into.MallardDuck;
import into.RedHeadDuck;
import into.RubberDuck;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        printDuck(new MallardDuck());
        printDuck(new RedHeadDuck());
        printDuck(new RubberDuck());

    }

    private static void printDuck(Duck duck){
        duck.display();
        duck.swim();
        duck.performQuack();
        duck.performFly();
    }
}