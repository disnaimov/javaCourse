package L22;

public abstract class Fish extends Animal{

    Fish(String param) {
        super(param);
        this.name = param;
    }

    @Override
    void sleep() {
        System.out.println("Always interesting watch how fishes sleeps");
    }

    abstract void swim();
}
