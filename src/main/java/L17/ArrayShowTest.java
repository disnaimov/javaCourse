package L17;

public class ArrayShowTest {
    private static void showArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[][] matrix = { {"el1", "el2"}, {"el1"}, {"el1","el2","el3"} };
        showArray(matrix);
    }
}
