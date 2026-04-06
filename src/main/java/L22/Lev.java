package L22;

public class Lev extends Mammal{
    Lev(String param) {
        super(param);
        this.name = param;
    }

    @Override
    void eat() {
        System.out.println("Lev eats");
    }

    @Override
    void sleep() {
        System.out.println("Lev sleeps");
    }

    @Override
    void run() {
        System.out.println("Lev runs");
    }
}
