class Car {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3  = new Car();
        car1 = null;
        Car car4 = car1;
        car3 = null;
        car2 = null;
        System.gc();
    }
}
// объекты пригодны для удаления со строк
// car1 - 8
// car2 - 11
// car3 - 10
//car4 - 9
