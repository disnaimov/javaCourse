import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add(1, "Ivanov");
        students.add(2, "Petrov");
        students.add(3, "Sidorov");
        students.remove(2);
        for (String s : students) {
            System.out.println(s + "");
        }
    }
}

// IndexOutOfBoundsException
