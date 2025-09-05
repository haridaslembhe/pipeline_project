class Car {
    String brand;
    int year;

    // Constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Car: " + brand + " (" + year + ")");
    }
}

public class demo {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", 2021);
        Car car2 = new Car("Hero India", 2025);

        car1.displayInfo();
        car2.displayInfo();
    }
}
