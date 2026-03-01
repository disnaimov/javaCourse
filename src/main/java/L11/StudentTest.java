package L11;

import java.util.Objects;

public class StudentTest {

    private static void studentEqualsV1(Student firstStudent, Student secondStudent) {
            // Можно было оставить проверку только по ID
            if (firstStudent.getId() == secondStudent.getId() &&
                Objects.equals(firstStudent.getFirstName(), secondStudent.getFirstName()) &&
                Objects.equals(firstStudent.getSecondName(), secondStudent.getSecondName()) &&
                firstStudent.getAge() == secondStudent.getAge()
        ) {
                System.out.println("Переданные студенты равны по всем полям");
        } else {
                System.out.println("Переданные студенты не равны по всем полям");
            }
    }

    private static void studentEqualsV2(Student firstStudent, Student secondStudent) {
        String equalsResult = "";
        if (firstStudent.getId() == secondStudent.getId()) {
            equalsResult += "Переданные студенты имеют одинаковый ID, ";
            if (Objects.equals(firstStudent.getFirstName(), secondStudent.getFirstName())) {
                equalsResult += "FirstName, ";
                if (Objects.equals(firstStudent.getSecondName(), secondStudent.getSecondName())) {
                    equalsResult += "SecondName, ";
                    if (firstStudent.getAge() == secondStudent.getAge()) {
                        equalsResult += "Age.";
                    } else {
                        equalsResult += "Переданные студенты имеют разный Age.";
                    }
                } else {
                    equalsResult += "Переданные студенты имеют разный SecondName.";
                }
            } else {
                equalsResult += "Переданные студенты имеют разный FirstName.";
            }
        } else {
            equalsResult += "Переданные студенты имеют разный ID.";
        }
        System.out.println(equalsResult);
    }

    private static void studentEqualsV3(Student firstStudent, Student secondStudent) {
        if (firstStudent.equals(secondStudent)) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты не равны");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(  "Mark", "Markov", 22 );
        Student s2 = new Student(  "Mark", "Markov", 22);

        StudentTest.studentEqualsV1(s1, s2);
        StudentTest.studentEqualsV2(s1, s2);
        StudentTest.studentEqualsV3(s1, s2);

    }
}
