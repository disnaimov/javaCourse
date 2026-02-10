package L4;

public class Student {
    private final int number;
    private final String name;
    private final String secondName;
    private final int yearOfStudy;
    private final double avgMathGrade;
    private final double avgEconomicGrade;
    private final double avgForeignLanguageGrade;

    public Student(int number, String name, String secondName, int yearOfStudy, double avgMathGrade, double avgEconomicGrade, double avgForeignLanguageGrade) {
        this.number = number;
        this.name = name;
        this.secondName = secondName;
        this.yearOfStudy = yearOfStudy;
        this.avgMathGrade = avgMathGrade;
        this.avgEconomicGrade = avgEconomicGrade;
        this.avgForeignLanguageGrade = avgForeignLanguageGrade;
    }

    public double getAvgMathGrade() {
        return avgMathGrade;
    }

    public double getAvgEconomicGrade() {
        return avgEconomicGrade;
    }

    public double getAvgForeignLanguageGrade() {
        return avgForeignLanguageGrade;
    }
}
