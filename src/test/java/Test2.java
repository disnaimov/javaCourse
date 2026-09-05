class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }
}

class Doctor extends Employee {
    void sleep() {
        System.out.println("Doctor sleeps");
    }
}

class Test2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        //Employee x = new Employee(); - incorrect
        Employee x = new Doctor(); //- correct
        //Doctor x = new Doctor(); - correct
        // Doctor x = new Employee(); - error
        // Employee1 x = (Doctor) new Employee1(); - error
        //Doctor x = (Doctor) new Employee1(); - error
        e.sleep();
        x.sleep();
    }
}