package into;

public class RubberDuck extends Duck{

    public RubberDuck(){
        super.flyBehaviour = new FlyNoWay();
        super.quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("RubberDuck is Displaying");
    }

    @Override
    public void swim() {
        System.out.println("RubberDuck is swimming");
    }
}
