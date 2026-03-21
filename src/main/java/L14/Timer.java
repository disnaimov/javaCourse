package L14;

public class Timer {
    public static void timer() {
        int hour = 0, minute = 0, second = 0;
        OUTER:
        while (hour < 6) {

            MIDDLE:
            do {
                if (hour > 1 && minute % 10 == 0){
                    break OUTER;
                }
                second = 0;
                INNER:
                while (second < 60) {
                    if (second * hour > minute){
                        second++;
                        continue INNER;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }
                minute++;
            } while (minute < 60);
            minute = 0;
            hour++;

        }
    }
}


 class Main {
    public static void main(String[] args) {
        Timer.timer();
    }
}