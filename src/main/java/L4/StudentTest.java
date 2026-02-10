package L4;

// Вывести среднюю оценку каждого студента учитывая 3 предмета
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
                3,
                2.8,
                3.3,
                4.5
        );

        Student sam = new Student(
                3,
                "Sam",
                "Lav",
                1,
                3.3,
                4.4,
                5

        );

        printDoubleNum(getAvgGradeAnd(mark.getAvgMathGrade(), mark.getAvgEconomicGrade(), mark.getAvgForeignLanguageGrade()));
        printDoubleNum(getAvgGradeAnd(maks.getAvgMathGrade(), maks.getAvgEconomicGrade(), maks.getAvgForeignLanguageGrade()));
        printDoubleNum(getAvgGradeAnd(sam.getAvgMathGrade(), sam.getAvgEconomicGrade(), sam.getAvgForeignLanguageGrade()));
    }

    private static double getAvgGradeAnd(double avgMathGrade, double avgEconomicGrade, double avgForeignLanguageGrade) {
        return (avgMathGrade + avgEconomicGrade + avgForeignLanguageGrade) / 3;
    }

    private static void printDoubleNum(double doubleNum) {
        System.out.printf("%.2f\n", doubleNum);
    }
}
