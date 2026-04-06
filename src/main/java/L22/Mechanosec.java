package L22;

public class Mechanosec extends Fish{
    Mechanosec(String param) {
        super(param);
        this.name = param;

    }

    @Override
    void swim() {
        System.out.println("Mechanosec beautiful swimming");
    }

    @Override
    void eat() {
        System.out.println("Mechanosec eat some fish");
    }
}