package L13;

public class Test {
    //TODO выводит время в формате час:минута в интервале от 0 до 6 часов, если час больше единицы и минута кратна 10
    // то метод заканчивает работу. Если секунда * час > минуты то переходим на другую минуту
    private static void method() {
        int hour = 6;
        int min = 60;
        int sec = 60;

        for (int i = 0; i < hour; i++) {
            for (int j = 0; j < min; j++) {
                if (i > 1 && j % 10 == 0) {
                    continue;
                }
                System.out.println("Час " + i + " минута " + j);
                for (int z = 0; z < sec; z++) {
                    continue;
                }
            }
        }
    }

    public static void main(String[] args) {
        method();
    }
}
