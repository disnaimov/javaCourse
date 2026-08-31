package L23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Employee maks = new Employee("Maks", "IT", 150000);
        Employee egor = new Employee("Egor", "AI", 80000);
        Employee artur = new Employee("Artur", "IT", 40000);
        Employee aram = new Employee("Aram", "Sport", 10000);

        ArrayList<Employee> emList = new ArrayList<>(Arrays.asList(maks, egor, artur, aram));

        emList.add(new Employee("Lena", "Buh", 50000));
        emList.add(new Employee("IT", "IT", 15000));

        TestEmployee emplTester = new TestEmployee();

        ArrayList<Employee> em1 = emplTester.employeesFilter(employee -> employee.getSalary()>40000 && employee.getDepartment().equals("IT"), emList);
        ArrayList<Employee> em2 = emplTester.employeesFilter(employee -> employee.getSalary() != 40000 && employee.getName().startsWith("A"), emList);
        ArrayList<Employee> em3 = emplTester.employeesFilter(employee -> employee.getName().equals(employee.getDepartment()), emList);

        System.out.println("департамент IT, ЗП > 200");
        em1.forEach(emplTester::printEmployeeInfo);

        System.out.println("имя начинается с A, ЗП != 450");
        em2.forEach(emplTester::printEmployeeInfo);

        System.out.println("имя работника == департамент");
        em3.forEach(emplTester::printEmployeeInfo);
    }
}

class Employee {
    private String name;
    private String department;
    private Integer salary;

    public Employee(String name, String department, Integer salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getSalary() {
        return salary;
    }
}

class TestEmployee {
    void printEmployeeInfo(Employee employee) {
        System.out.println("{ Имя = " + employee.getName() + " Департамент = " + employee.getDepartment() + " ЗП = " + employee.getSalary() + " }");
    }

    ArrayList<Employee> employeesFilter(Predicate<Employee> predicate, ArrayList<Employee> employees) {
        return employees.stream().filter(predicate).collect(Collectors.toCollection(ArrayList<Employee>::new));
    }
}
