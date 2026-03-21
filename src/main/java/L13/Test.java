package L13;

public class Test {
    private static void method() {
        int hour = 6;
        int min = 60;
        int sec = 60;

        for (int i = 1; i < hour; i++) {
            for (int j = 0; j < min; j++) {
                if (i > 1 && j % 10 == 0) {
                    continue;
                }
                System.out.println("Час " + i + " минута " + j);
            }
        }
    }

    public static void main(String[] args) {
        method();
    }
}
