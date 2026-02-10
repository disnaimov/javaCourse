package L6;

public class Student {
    private int id;
    private String name;
    private String secondName;
    private int yearOfStudy;
    private double avgMathGrade;
    private double avgEconomicGrade;
    private double avgForeignLanguageGrade;

    public Student() {
    }

    public Student(int id, String name, String secondName, int yearOfStudy) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.yearOfStudy = yearOfStudy;
    }

    public Student(int id, String name, String secondName, int yearOfStudy, double avgMathGrade, double avgEconomicGrade, double avgForeignLanguageGrade) {
        this.id = id;
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
