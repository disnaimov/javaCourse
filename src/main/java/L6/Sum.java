package L6;
// создать класс с 5 overloaded методами, вычисляющими сумму 0-4 параметров, передают эту сумму в output и выводят на экран
// когда слагаемых нет - сумма = 0
public class Sum {

    private static int countSum() {
        System.out.println(0);
        return 0;
    }

    private static int countSum(int num1) {
        System.out.println(num1);
        return num1;
    }

    private static int countSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
        return sum;
    }

    private static int countSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println(sum);
        return sum;
    }

    private static int countSum(int num1, int num2, int num3, int num4) {
        int sum = num1 + num2 + num3 + num4;
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        countSum();
        countSum(1);
        countSum(1, 2);
        countSum(1, 2, 3);
        countSum(1, 2, 3, 4);
    }
}
