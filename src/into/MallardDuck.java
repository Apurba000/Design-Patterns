package into;

public class MallardDuck extends Duck{

    public MallardDuck(){
        super.flyBehaviour = new FlyWithWings();
        super.quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck is Displaying");
    }

    @Override
    public void swim() {
        System.out.println("MallardDuck is swimming");
    }
}
