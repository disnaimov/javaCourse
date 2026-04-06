package L22;

public class Penguin extends Bird{
    Penguin(String param) {
        super(param);
        this.name = param;
    }

    @Override
    void fly() {
        System.out.println("Penguin can't fly");
    }

    @Override
    void eat() {
        System.out.println("Penguin eat fish");
    }

    @Override
    void sleep() {
        System.out.println("Penguin sleeps");
    }

    @Override
    public void speak() {
        System.out.println("Penguin can't sing like some birds");
    }
}