package L17;

public class ArraySortTest {
    public static void bubbleSort(int[] arr) {
        for (int out = 0; out < arr.length-1; out++) { //length-1 - последний элемент итак "всплывет"
            for (int in = 0; in < arr.length-1-out; in++) {        //arr.length-1-out - проходим только неотсортированную часть массива, избегаем лишних итераций
                if (arr[in] > arr[in+1]) {
                    int temp = arr[in];     // ← long → int
                    arr[in] = arr[in + 1];
                    arr[in + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 0, 6};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
