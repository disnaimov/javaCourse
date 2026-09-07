package L18;

public class CommandLineArrays {
    public static String[] abc(String[]... arrays) {
        // Подсчёт общего размера
        int totalLength = 0;
        for (String[] arr : arrays) {
            totalLength += arr.length;
        }

        // Создаём новый массив из всех элементов
        String[] result = new String[totalLength];

        // Заполняем результат
        int index = 0;
        for (String[] arr : arrays) {
            for (String s : arr) {
                result[index++] = s;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] array1 = {"apple", "banana"};
        String[] array2 = {"cat", "dog"};
        String[] array3 = {"hello", "world"};

        String[] combined = abc(array1, array2, array3);

        for (int i = 0; i < combined.length; i++) {
            for (String param : args) {
                if (combined[i] != null && combined[i].equals(param)) {
                    combined[i] = null;
                }
            }
        }

        // Вывод результата
        System.out.println("Обновлённый массив:");
        for (String s : combined) {
            System.out.println(s);
        }
    }
}
