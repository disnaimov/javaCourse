package L10;

public class Task1 {
    private static class Car {
        private String color;
        private String engine;
        private int doorQuantity;

        public Car(String color, String engine, int doorQuantity) {
            this.color = color;
            this.engine = engine;
            this.doorQuantity = doorQuantity;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getDoorQuantity() {
            return doorQuantity;
        }

        public void setDoorQuantity(int doorQuantity) {
            this.doorQuantity = doorQuantity;
        }

        public String getEngine() {
            return engine;
        }

        public static void printCarInfo(Car car) {
            System.out.println("Car color = " + car.getColor());
            System.out.println("Car engine = " + car.getEngine());
            System.out.println("Car door quantity = " + car.getDoorQuantity());
        }

        public void changeCarDoorCount(Car car, int newDoorCount) {
            car.setDoorQuantity(car.getDoorQuantity() + newDoorCount);
        }

        public static void swapCarsColor(Car firstCar, Car secondCar) {
            String firstCarColor = firstCar.getColor();
            firstCar.setColor(secondCar.getColor());
            secondCar.setColor(firstCarColor);
        }
    }
    public static void main(String[] args) {
        Car car1 = new Car("Red", "V8", 4);
        Car car2 = new Car("Blue", "V6", 2);

        //----------------------------------FIRST METHOD TEST-------------------------------------------------------
        System.out.println("Car1 doorQuantity before changes = " + car1.getDoorQuantity());
        car1.setDoorQuantity(5);
        System.out.println("Car1 doorQuantity after changes = " + car1.getDoorQuantity());

        //----------------------------------SECOND METHOD TEST------------------------------------------------------
        System.out.println("Car1 info");
        Car.printCarInfo(car1);
        System.out.println();
        System.out.println("Car2 info");
        Car.printCarInfo(car2);
        System.out.println();

        Car.swapCarsColor(car1, car2);
        System.out.println("Car1 color after switch = " + car1.getColor());
        System.out.println("Car2 color after switch = " + car2.getColor());
    }
}
