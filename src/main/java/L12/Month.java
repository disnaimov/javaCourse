package L12;

public class Month {
    private static void getDayQuantityByMonthNumber(int monthNumber) {
        switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Days in your month = " + 31);
                break;

            case 4, 6, 9, 11:
                System.out.println("Days in your month = " + 30);
                break;

            case 2:
                System.out.println("Days in your month = " + 28);
                break;

            default:
                System.out.println("Incorrect month number = " + monthNumber);
        }
    }

    public static void main(String[] args) {
        getDayQuantityByMonthNumber(1);
        getDayQuantityByMonthNumber(4);
        getDayQuantityByMonthNumber(2);
        getDayQuantityByMonthNumber(222);
    }
}
