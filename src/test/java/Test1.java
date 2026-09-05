public class Test1 {
    void abc(short s) { System.out.println("byte"); }
    void abc(int i) { System.out.println("int"); }
    void abc(float f) { System.out.println("float"); }
    void abc(Object o) { System.out.println("Object"); }

    public static void main(String[] args) {
        Test1 t = new Test1();
        char c = 55;
        t.abc(c); // выведет int
        t.abc(false); // boolean -> Boolean -> Object
        t.abc(3.14); // double -> Double -> Object
    }
}
