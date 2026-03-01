package L8;

public class Task4 {
    int a = 1;
    static int b = 2;
    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Task4.b);
    }

    public static void main(String[] args) {
        Task4 t4 = new Task4();
        t4.abc(4);
    }
}
