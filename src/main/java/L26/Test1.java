package L26;

class First {
    static int multiply(int num1, int num2, int num3) {
        return num1*num2*num3;
    }

    static void printDivision(int num1, int num2) {
        System.out.println(num1/num2);
    }
}

class Second {
    public static void main(String[] args) {
        int m1 = First.multiply(10, 20, 30);
        First.printDivision(50, 2);

        int m2 = First.multiply(20, 30, 40);
        First.printDivision(100, 2);

        System.out.println(m1);
        System.out.println(m2);
    }
}
