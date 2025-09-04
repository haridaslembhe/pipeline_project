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

public class Car {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2022);

        car1.displayInfo();
        car2.displayInfo();
    }
}
