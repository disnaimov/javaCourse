package L21;

public class Dog extends Pet{
    public Dog(String name) {
        System.out.println("I am dog, my name is = " + name);
    }
    public void play() {
        System.out.println("Dog " + this.name + " plays");
    }
}
