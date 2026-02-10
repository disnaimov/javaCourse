package L6;

// Создать 3 объекта с помощью разных конструкторов
public class StudentTest {
    public static void main(String[] args) {
        Student mark = new Student(
                1,
                "Mark",
                "Markov",
                2,
                3.5,
                4,
                4
        );

        Student maks = new Student(
                2,
                "Maks",
                "Ilyin",
                3
        );

        Student sam = new Student();

        System.out.println(mark);
        System.out.println(maks);
        System.out.println(sam);
    }
}
