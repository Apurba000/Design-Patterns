package intro;

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
