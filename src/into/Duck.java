package into;

public abstract class Duck {
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public void display(){
        System.out.println("Displaying Duck");
    }

    public void swim(){
        System.out.println("Duck is swimming");
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

}
