package L22;

public abstract class Bird extends Animal implements Speakable{
    Bird(String param) {
        super(param);
        this.name = param;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(this.name + " sings");
    }
}
