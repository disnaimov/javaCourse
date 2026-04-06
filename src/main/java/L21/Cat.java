package L21;

public class Cat extends Pet{
    public Cat(String name) {
        System.out.println("I am cat, my name is = " + name);
    }
    public void sleep() {
        System.out.println("Cat " + this.name + " sleeps");
    }
}
