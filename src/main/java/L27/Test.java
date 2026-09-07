package L27;
class First {
    static final double pi = 3.14;

    void printArea(int radius) {
        System.out.println(radius * radius * pi);
    }

    static void printPerimeter(int radius) {
        System.out.println(2 * pi * radius);
    }

    void printAreaAndPerimeter(int radius) {
        printArea(radius);
        printPerimeter(radius);
    }
}

class Second {
    public static void main(String[] args) {
        First test = new First();
        test.printArea(10);
        test.printAreaAndPerimeter(20);
    }
}

public class Test {
}
