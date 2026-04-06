package L22;

public abstract class Mammal extends Animal implements Speakable{
    Mammal(String param) {
        super(param);
        this.name = param;
    }
    abstract void run();
}
