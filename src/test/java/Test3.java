class Test3 implements interface1, interface2 {
    public void abc() {
        System.out.println("OK");
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        ((interface1)t).abc();
    }
}

interface interface1 {
    int a = 5;
    void abc();
}

interface interface2 {
    int a = 10;
    void abc();
}

// Test1 - реализует abc один раз, этого достаточно
// Test1 - имеет доступ к обоим контантам a
// ((interface1)t).abc(); вызов через приведение типа, результат "ОК"
/*
Проблемы были бы если:
*Методы в интерфейсах имели разные сигнатуры
*с Java 8, если бы в интерфейсах были default-методы с одинаковой сигнатурой, но разной реализацией
 */
