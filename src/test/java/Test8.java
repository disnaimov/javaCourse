class X2 {}
class Y2 extends X2 {}

public class Test8 {
    public static void abc(X2 x2, Y2 y2) {
        System.out.println("Hi");
    }

    public static void abc(Y2 y2, X2 x2) {
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        Y2 y2 = new Y2();
        //abc(y2, y2);
    }
}

// Компилятор не может выбрать ambiguous method call
