package L24;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
class ShiftScheduler {
    // Создаём два шаблона форматирования
    private static final DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! HH:mm");
    private static final DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm, dd/MMM/yy");

    public static void smena(LocalDateTime start, LocalDateTime end, Period period, Duration duration) {
        LocalDateTime current = start;

        while (current.isBefore(end)) {
            // 1. Вывод текущего времени по первому шаблону
            System.out.println("Работаем с: " + current.format(formatter1));

            // 2. Увеличение на период и вывод
            LocalDateTime afterPeriod = current.plus(period);
            System.out.println("До: " + afterPeriod.format(formatter1));

            // 3. Отдых с использованием второго шаблона
            System.out.println("Отдыхаем с: " + afterPeriod.format(formatter2));

            // 4. Увеличение на продолжительность и вывод
            LocalDateTime afterDuration = afterPeriod.plus(duration);
            System.out.println("До: " + afterDuration.format(formatter2));
            System.out.println("------------------------------------------------");

            // Обновляем текущий объект для следующей итерации
            current = afterDuration;
        }
    }

    public static void main(String[] args) {
        // Создаём объекты LocalDateTime
        LocalDateTime start = LocalDateTime.of(2024, 2, 3, 9, 0);
        LocalDateTime end = LocalDateTime.of(2024, 2, 4, 9, 0);

        // Создаём Period и Duration
        Period period = Period.ofDays(1); // один день
        Duration duration = Duration.ofHours(8); // 8 часов

        // Запускаем смену
        smena(start, end, period, duration);
    }
}

public class Main {
}
