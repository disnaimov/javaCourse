package Test11.package2;

import Test11.package1.X;

public class Y extends X {
    Y(){}

    public void abc() {
        System.out.println("Y");
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();
    }
}
