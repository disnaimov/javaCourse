package L7;

public class Employee {
    protected int id;
    public String secondName;
    private double salary;

    public void printId() {
        System.out.println("ID = " + this.id);
    }

    public void printSecondName() {
        System.out.println("SECOND NAME = " + this.secondName);
    }

    public void printSalary() {
        System.out.println("SALARY = " + this.salary);
    }

    public static void printEmployeeInfo(Employee employee) {
        employee.printId();
        employee.printSecondName();
        employee.printSalary();
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String secondName, double salary) {
        this.id = id;
        this.secondName = secondName;
        this.salary = salary;
    }

     Employee(int id, String secondName) {
        this.secondName = secondName;
    }

    private Employee(double salary) {
        this.salary = salary;
    }

}
