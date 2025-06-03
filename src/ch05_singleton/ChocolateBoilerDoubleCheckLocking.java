package ch05_singleton;

public class ChocolateBoilerDoubleCheckLocking {

    private static volatile ChocolateBoilerDoubleCheckLocking instance;
    private boolean empty;
    private boolean boiled;
    private ChocolateBoilerDoubleCheckLocking() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerDoubleCheckLocking getInstance(){
        if (instance == null){
            synchronized (ChocolateBoilerDoubleCheckLocking.class){
                if (instance == null){
                    instance = new ChocolateBoilerDoubleCheckLocking();
                }
            }
        }
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}