package L5;

import L4.Student;

public class L5 {

    //--------------------------------------------------TASK 1----------------------------------------------------------
    private static class BankAccount {
        private final int id;
        private final String name;
        double balance;

        public BankAccount(int id, String name, double balance) {
            this.id = id;
            this.name = name;
            this.balance = balance;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public static void addToBalance(BankAccount account, double quantityToAdd) {
            account.setBalance(account.getBalance() + quantityToAdd);
        }

        public static void decreaseBalance(BankAccount account, double quantityToDecrease) {
            account.setBalance(account.getBalance() - quantityToDecrease);
        }
    }

    private static void bankAccountTest() {
        BankAccount FIRST_ACCOUNT = new BankAccount(1, "FIRST_ACCOUNT", 1500);
        BankAccount SECOND_ACCOUNT = new BankAccount(2, "SECOND_ACCOUNT", 2000);

        System.out.println("Баланс до уменьшения");
        System.out.println("Аккаунт " + FIRST_ACCOUNT.getName() + " Баланс = " + FIRST_ACCOUNT.getBalance());
        System.out.println("Аккаунт " + SECOND_ACCOUNT.getName() + " Баланс = " + SECOND_ACCOUNT.getBalance());

        BankAccount.decreaseBalance(FIRST_ACCOUNT, 1000);
        BankAccount.decreaseBalance(SECOND_ACCOUNT, 1100);

        System.out.println("Баланс после уменьшения");
        System.out.println("Аккаунт " + FIRST_ACCOUNT.getName() + " Баланс = " + FIRST_ACCOUNT.getBalance());
        System.out.println("Аккаунт " + SECOND_ACCOUNT.getName() + " Баланс = " + SECOND_ACCOUNT.getBalance());

        BankAccount.addToBalance(FIRST_ACCOUNT, 2500);
        BankAccount.addToBalance(SECOND_ACCOUNT, 4000);

        System.out.println("Баланс после увеличения");
        System.out.println("Аккаунт " + FIRST_ACCOUNT.getName() + " Баланс = " + FIRST_ACCOUNT.getBalance());
        System.out.println("Аккаунт " + SECOND_ACCOUNT.getName() + " Баланс = " + SECOND_ACCOUNT.getBalance());

    }

    //--------------------------------------------------TASK 2----------------------------------------------------------
    private static void studentTest() {
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

        printDoubleNum(getAvgGradeAnd(mark));
        printDoubleNum(getAvgGradeAnd(maks));
        printDoubleNum(getAvgGradeAnd(sam));
    }

    private static double getAvgGradeAnd(Student student) {
        return (student.getAvgMathGrade() + student.getAvgEconomicGrade() + student.getAvgForeignLanguageGrade()) / 3;
    }

    private static void printDoubleNum(double doubleNum) {
        System.out.printf("%.2f\n", doubleNum);
    }

    //--------------------------------------------------TASK 3----------------------------------------------------------
    private static class Employee {
        private int id;
        private String secondName;
        private int age;
        private double salary;

        public Employee(int id, String secondName, int age, double salary) {
            this.id = id;
            this.secondName = secondName;
            this.age = age;
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public static void multiplySalary(Employee employee) {
            employee.setSalary(employee.getSalary() * 2);
        }
    }

    private static void employeeTest() {
        Employee employee = new Employee(
                1,
                "SecondName1",
                25,
                25000

        );

        Employee employee2 = new Employee(
                2,
                "SecondName2",
                30,
                40000
        );

        Employee.multiplySalary(employee);
        Employee.multiplySalary(employee2);

        System.out.println("First employee salary after multiply = " + employee.getSalary());
        System.out.println("Second employee salary after multiply = " +employee2.getSalary());
    }

    //--------------------------------------------------TESTING---------------------------------------------------------
    public static void main(String[] args) {
        // Task 1
        //bankAccountTest();
        // Task 2
        //studentTest();
        //Task3
        employeeTest();
    }
}


