package L21;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Paul");
        Cat cat = new Cat("Lax");
        cat.setName("Lax");

        System.out.println("Paul paws = " + dog.getPaw());
        cat.sleep();
    }
}
