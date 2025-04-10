import intro.Duck;
import intro.MallardDuck;
import intro.RedHeadDuck;
import intro.RubberDuck;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        printDuck(new MallardDuck());
//        printDuck(new RedHeadDuck());
//        printDuck(new RubberDuck());

        Duck mDuck = new MallardDuck();
        Duck rDuck = new RedHeadDuck();
        Duck rUbberDuck = new RubberDuck();


        printDuck(mDuck);
        printDuck(rDuck);
        printDuck(rUbberDuck);
    }

    private static void printDuck(Duck duck){
        duck.display();
        duck.swim();
        duck.performQuack();
        duck.performFly();
    }
}