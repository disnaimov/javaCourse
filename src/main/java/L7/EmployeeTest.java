package L7;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee firstEmpl = new Employee(1);
        Employee secondEmpl = new Employee(2, "SecondEmployee");
        Employee thirdEmployee = new Employee(3, "ThirdEmployee", 25000);

        //-----------------------------------FIRST EMPL INFO PRINT------------------------------------------------------
        System.out.println("==={First employee info with methods}===");
        Employee.printEmployeeInfo(firstEmpl);
        System.out.println();

        System.out.println("==={First employee info with sys out}===");
        System.out.println("ID = " + firstEmpl.id);
        System.out.println("SECOND NAME = " + firstEmpl.secondName);
        //System.out.println(firstEmpl.salary); // невозможно тк он private
        System.out.println();
        System.out.println();


        //-----------------------------------SECOND EMPL INFO PRINT-----------------------------------------------------
        System.out.println("==={Second employee info with methods}===");
        Employee.printEmployeeInfo(secondEmpl);
        System.out.println();

        System.out.println("==={Second employee info with sys out}===");
        System.out.println("ID = " + secondEmpl.id);
        System.out.println("SECOND NAME = " + secondEmpl.secondName);
        //System.out.println(secondEmpl.salary); // невозможно тк он private
        System.out.println();
        System.out.println();


        //-----------------------------------THIRD EMPL INFO PRINT------------------------------------------------------
        System.out.println("==={Third employee info with methods}===");
        Employee.printEmployeeInfo(thirdEmployee);
        System.out.println();

        System.out.println("==={Third employee info with sys out}===");
        System.out.println("ID = " + thirdEmployee.id);
        System.out.println("SECOND NAME = " + thirdEmployee.secondName);
        //System.out.println(thirdEmployee.salary); // невозможно тк он private
    }
}
