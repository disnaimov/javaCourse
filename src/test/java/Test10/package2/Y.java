package Test10.package2;

import Test10.package1.X;

public class Y extends X {
    public void abc() {
        System.out.println("Y");
    }

    public void def() {
        Y y = new Y();
        y.abc();
    }

    public void ghi() {
        X x = new Y();

        // Можно обращаться к protected, из подкласса, даже если он в другом пакете,
        // Но только через ссылку типа подкласса, в данном случае Y

        //x.abc();
    }

    public static void main(String[] args) {
        Y a = new Y();
        a.abc();
        a.def();
        a.ghi();
    }
}
