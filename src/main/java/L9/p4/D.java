package L9.p4;

import L9.p1.A;
import L9.p1.p2.p3.C;
import L9.p4.p5.E;

import static L9.p1.p2.B.a;
import static L9.p1.p2.B.b;

public class D {
    public static void main(String[] args) {
        A aa = new A();
        System.out.println(aa);

        System.out.println(b + a);
        C c = new C();
        c.abc();

        E e = new E();
        e.abc();
    }
}
