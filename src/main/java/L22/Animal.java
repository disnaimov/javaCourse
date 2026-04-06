package L22;

public abstract class Animal {
    String name;

    Animal(String param) {
        this.name = param;
    }

    abstract void eat();
    abstract void sleep();
}