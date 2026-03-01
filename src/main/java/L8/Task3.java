package L8;

public class Task3 {
    int a = 1;
    static int b = 2;
    static void abc(final int a) {
        System.out.println(a);
        System.out.println(Task3.b);
    }

    public static void main(String[] args) {
        abc(5);
    }
}
