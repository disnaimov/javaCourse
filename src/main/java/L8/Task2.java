package L8;

public class Task2 {
    int a = 1;
    //static int a = 2;
    void abc(int a) {
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Task2 t1 = new Task2();
        t1.abc(3);
    }
}
