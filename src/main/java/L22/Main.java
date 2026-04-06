package L22;

public class Main {
    public static void main(String[] args) {
        Mechanosec mechanosec = new Mechanosec("Fish name");
        System.out.println(mechanosec.name);
        mechanosec.eat();
        mechanosec.swim();
        mechanosec.sleep();

        Speakable penguin = new Penguin("Penguin name");
        penguin.speak();

        Lev lev = new Lev("Lev name");
        System.out.println(lev.name);
        lev.eat();
        lev.run();
        lev.sleep();
        lev.speak();

        Mammal lev2 = new Lev("Lev2 name");
        System.out.println(lev2.name);
        lev2.eat();
        lev2.run();
        lev2.sleep();
        lev2.speak();
    }
}
